package section__13;

// 스레드 클래스 상속
class ThreadExample extends Thread {
    // run() 메서드 구현
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // Thread.currentThread().getName() <-- 스레드 이름을 반환
            System.out.println(Thread.currentThread().getName() + " - Thread 상속 - " + i);
        }
    }
}

class RunnableExample implements Runnable {
    // run() 메서드 구현
    @Override
    public void run() {
        boolean bool = true;
        while (bool) {
            System.out.println(Thread.currentThread().getName() + " : Runnable 실행!");
            bool = false;
        }
    }
}

// 동기화
class Bonus {
    private int point;

    public int getPoint() {
        return point;
    }

    // 메서드 동기화 (synchronized)
    public synchronized void addPoint(int point, String threadName) {
        this.point += point;
        System.out.println(threadName + " : " + this.point);
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample threadExample = new ThreadExample();
        // 스레드 시작
        threadExample.start();

        Thread runnableExample = new Thread(new RunnableExample());
        // 스레드 시작
        runnableExample.start();

        // 기존 메인(main) 스레드 작업
        for (int i = 0; i < 10; i++) {
            System.out.println("메인(main) 스레드 작업" + " - " + i);
        }

        Bonus bonus = new Bonus();

        // 스레드 생성
        Thread t1 = new Thread(()->{
           for (int i = 0; i < 10; i++) {
                bonus.addPoint(100, "t1");
           }
        });

        // 스레드 생성
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                bonus.addPoint(100, "t2");
            }
        });

        t1.start();
        t2.start();

        t1.join(); // Thread 실행을 마칠 때까지 대기 (끝나면 다음 줄 코드 시작)
        t2.join();

        System.out.println("Total Bonus : " + bonus.getPoint()); // join()을 사용해 Total 정상 출력가능
    }
}

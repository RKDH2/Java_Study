package section5;

interface Play_1 {
    void game();
}

interface Play_2 {
    void music();
}

// 다중 상속
class PlayList implements Play_1, Play_2 {
    @Override
    public void game() {
        System.out.println("게임 영상 추가");
    }

    @Override
    public void music() {
        System.out.println("음악 영상 추가");
    }
}
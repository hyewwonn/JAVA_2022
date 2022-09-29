package thread;

class RTop implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i+"\t");

        }
    }
}

public class Runnable1Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        //1.인터페이스를 구현하는 클래스 객체 생성
        //RTop t = new RTop();
        //2.Runnable 인터페이스를 구현한 객체를 매개변수로 하는 스레드 클래스
        //객체 생성
        //Thread thd = new Thread(t);
        Thread thd = new Thread(new RTop());
        thd.start();
        System.out.println("프로그램 종료");
    }

}

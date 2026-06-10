package java_study.thread;

public class Thread_Main {
    public static void main(String[] args) {
        //익명 구현 객첸
//        Runnable r = new Runnable() {
//            public void run() {
//                System.out.println("띵");
//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {}
//            }
//        };

        //Runnable 인터페이스 구현체 사용
        //Runnable r = new Thread_Runnable();
        //Thread t = new Thread(r);

        //Thread 자식 클래스 객체 사용
        //Thread t = new Thread(new Thread_Task());
        //t.start();
    }
}

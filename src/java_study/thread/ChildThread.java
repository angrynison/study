package java_study.thread;

public class ChildThread extends  Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){}
        }
    }
}

package java_study.thread;

//Runnable 인터페이스를 구현한경우
public class RunnableInteface implements Runnable{

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

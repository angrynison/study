package java_study.thread;

//임계영역 지정 및 스케줄링 실험
public class SynchronizedMain {
    public static void main(String[] args) {

        SyncCalculator calculator = new SyncCalculator();
        SyncUser1 user1 = new SyncUser1(calculator);
        SyncUser2 user2 = new SyncUser2(calculator);

        user1.start();
        user2.start();


    }
}

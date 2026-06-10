package java_study.thread;

public class SyncUser1 extends Thread{

    private final SyncCalculator calculator;

    public SyncUser1(SyncCalculator calculator){
        this.setName("User1");
        this.calculator=calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(this);
    }
}

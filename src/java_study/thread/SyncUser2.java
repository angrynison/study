package java_study.thread;

public class SyncUser2 extends Thread{

    private final SyncCalculator calculator;

    public SyncUser2(SyncCalculator calculator){
        this.setName("User2");
        this.calculator=calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(this);
    }
}

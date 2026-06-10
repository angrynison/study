package java_study.thread;

public class SyncCalculator {

    private int memory;

    int getMemory() {
        return memory;
    }

//    public synchronized void setMemory(Thread thread, int memory) {
//
//        this.memory = memory;
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {}
//        System.out.println("Current Thread: " + thread.getName());
//        System.out.println("Current Memory: " + this.memory);
//    }

    //sync를 메소드에다가 걸면 해당 필드와 메소드가 잠금됨
    public void setMemory(Thread thread) {
        synchronized (this) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println("Current Thread: " + Thread.currentThread().getName() + "Current Memory: " + this.memory);
        }
    }

}

package java;

public class Calculator {

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

    public void setMemory(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println("Current Thread: " + Thread.currentThread().getName() + "Current Memory: " + this.memory);
        }
    }

}

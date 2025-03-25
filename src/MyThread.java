public class MyThread extends Thread{
    // Constructor of MyThread
    MyThread (String name){
        super(name); // Pass name to Thread class
    }

    // Factory method to create and start a thread
    public static MyThread createAndStart(String name){
        MyThread myThread = new MyThread(name);
        myThread.start();
        return myThread;
    }
    // Code to run when thread is called
    public void run(){
        System.out.println("Thread" + getName() + " is running");
        try{
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("Thread" + getName() + " count is " + count);
            }
        } catch (InterruptedException exception) {
            System.out.println("Thread" + getName() + " is interrupted");
        }
        System.out.println("Thread" + getName() + " is finished");
    }
}

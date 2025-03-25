public class ExtendThread {
    public static void main(String[] args) {
        MyThread myThread = MyThread.createAndStart("Child #1");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException exception){
                System.out.println("Main thread is interrupted");
            }
        }
        System.out.println("Main thread is finished");
    }
}
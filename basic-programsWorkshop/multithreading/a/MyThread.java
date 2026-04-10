package a;

public class MyThread extends Thread{
    public MyThread(int maxPriority) {
    }

    @Override
    public void run() {
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
    }
}

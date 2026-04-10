package a;

public class OtherThread extends Thread{
    public OtherThread(int minPriority) {
    }

    @Override
    public void run() {
        for(int i='a';i<='j';i++){
            System.out.println((char)i);
        }
    }
}

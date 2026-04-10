import a.MyThread;
import a.OtherThread;

public class Main{
    public static void main(String[] args){
        System.out.println("main starts");
        MyThread mt = new MyThread(Thread.MAX_PRIORITY);
        mt.setPriority(MyThread.MAX_PRIORITY);
       Thread tt = new Thread(new ThirdThread());
        OtherThread ot = new OtherThread(Thread.MIN_PRIORITY);
        ot.setPriority(OtherThread.MIN_PRIORITY);
        mt.start();
        ot.start();
        tt.start();
        StringBuffer sp1 = new StringBuffer("ABC");
        sp1.append("MNO");
        StringBuilder sp2 = new StringBuilder("CDE");
        sp2.append("EFG");

        System.out.println("main ends");
    }
}


import java.util.Scanner;
public class Rec {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=isArmstrong(n);
        if(n==x)
            System.out.println("isArmstrong");
}
static int isArmstrong(int n){
        if (n==0)
            return 0;
        int sum;
        int a=String.valueOf(n).length();
        int d=n%10;
        sum=(int) (Math.pow(d,a));
        return sum+isArmstrong(n/10);
}
}

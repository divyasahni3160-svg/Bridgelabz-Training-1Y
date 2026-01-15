import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter principal,rate and time in seperate lines");
double principal = sc.nextDouble();
double rate = sc.nextDouble();
double time = sc.nextDouble();
System.out.println((principal*rate*time)/100);
sc.close();
}
}
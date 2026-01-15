import java.util.Scanner;
public class UniFee1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("enter fee ,discount percentage in seperate lines");
int fee = sc.nextInt();
int discountPercent = sc.nextInt();
int discount = fee*discountPercent/100;
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
}
}

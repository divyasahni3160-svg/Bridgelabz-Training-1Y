import java.util.Scanner;
public class NaturalNumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int sum = 0;
if(x>0){
    sum = x * (x+1) / 2;
System.out.println("The sum of " + x + " natural numbers is " + sum);
}else{
System.out.println("The number " + x + " is not a natural number");}
}
}

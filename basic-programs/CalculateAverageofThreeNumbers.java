import java.util.Scanner;
public class CalculateAverageofThreeNumbers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3 numbers in seperate lines");
double principal = sc.nextDouble();
double rate = sc.nextDouble();
double time = sc.nextDouble();
System.out.println((principal+rate+time)/3);
sc.close();
}
}
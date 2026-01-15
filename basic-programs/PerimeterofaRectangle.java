import java.util.Scanner;
public class PerimeterofaRectangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length and breath in seperate lines");

double length = sc.nextDouble();
double breath = sc.nextDouble();
System.out.println(2*(length+breath));
sc.close();
}
}
import java.util.Scanner;
public class CelsiustoFahrenheitConversion{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter celsius");
double celsius = sc.nextDouble();

System.out.println((celsius * 9/5) + 32);
sc.close();
}
}
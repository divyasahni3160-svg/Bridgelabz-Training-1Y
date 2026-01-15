import java.util.Scanner;
public class ConvertKilometerstoMiles{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter value");
int r = sc.nextInt();
System.out.println(r* 0.621371);
sc.close();
}
}
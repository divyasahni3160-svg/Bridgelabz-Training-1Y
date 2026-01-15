import java.util.Scanner;
public class AreaofaCircle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius");
int radius = sc.nextInt();
System.out.println(Math.PI* radius*radius);
sc.close();
}
}
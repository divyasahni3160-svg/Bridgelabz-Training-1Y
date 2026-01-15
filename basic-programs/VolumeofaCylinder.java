import java.util.Scanner;
public class VolumeofaCylinder{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius and height in seperate lines");
int radius = sc.nextInt();
int height = sc.nextInt();
System.out.println(Math.PI* radius*radius*height);
sc.close();
}
}
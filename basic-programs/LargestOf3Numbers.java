import java.util.Scanner;
public class LargestOf3Numbers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();
if((x>y) && (x>z)){
System.out.println("Is the first number the largest? yes \nIs the second number the largest? no \nIs the third number the largest? no");
}else if((y>x) && (y>z)){
System.out.println("Is the first number the largest? no \nIs the second number the largest? yes \nIs the third number the largest? no");
}else if((z>x) && (z>y)){
System.out.println("Is the first number the largest? no \nIs the second number the largest? no \nIs the third number the largest? yes");
}
}
}


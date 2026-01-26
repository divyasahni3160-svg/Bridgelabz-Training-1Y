import java.util.Scanner;
public class SmallestOf3Numbers{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();
if((x<y) && (x<z)){
System.out.println("Is the first number the smallest? Yes");
}else{
System.out.println("Is the first number the smallest? No");}
}
}


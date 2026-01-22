import java.util.Scanner;
public class Operators1{
public static void main(String[] args){
  //5+5+7+7+8+8
  //5-5-5+5-6+6
int i = 0;
System.out.println("val:" + i);
i++;
System.out.println("val:" + i++);
System.out.println("val:" + i);
++i;
System.out.println("val:" + i++);
System.out.println("val:" + i++);
int z = i+ i++ + ++i + i + ++i + i++;
System.out.println(z);
int y = i- i++ - --i + i - ++i + i++;
System.out.println(y);
for(int x=0;x<10;x++){
    System.out.println("x:" + x);
}
int j=10;
while(j>0){
    System.out.println("j:" + j);
j--;
}
int k =10;
do{
    System.out.println("k:" + k);
	k--;
}while(k>0);
System.out.println("enter the value");
Scanner scanner = new Scanner(System.in);
int x = scanner.nextInt();
}
}

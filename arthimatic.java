import java.util.Scanner;
class task2{
public static void main( String[]arr){
Scanner ob=new Scanner(System.in); 
System.out.print("Enter x =");
int x=ob.nextInt();
System.out.print("Enter y =");
int y=ob.nextInt();
System.out.print("Enter z =");
int z=ob.nextInt();
int result=0;
result=((1/x)-((y*z)/x)+(1/y)+((x*y)/z));
System.out.println("the result =" + result);

}}
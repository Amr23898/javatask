import java.util.Scanner;
class task1{
public static void main( String[]arr){
System.out.println("Enter your numbers");
Scanner ob=new Scanner(System.in); 

int x=ob.nextInt();
int y=ob.nextInt();

int sum=0;
if(x<y){
System.out.println("numbers between " +  x + " and "+ y + "is");
for(int i=x;i<=y;i++){
sum=sum+i;
System.out.println(i);
}
System.out.println("Sumtion number=" +sum);
}

if(x>y){
System.out.println("numbers between " +  y + " and "+ x + "is");
for(int t=y;t<=x;t++){
sum=sum+t;
System.out.println(t);
}
System.out.println("Sumtion number=" +sum);
}
}}
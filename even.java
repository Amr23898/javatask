import java.util.Scanner;
class 	evenNum{
public static void main(String[]arr){
Scanner x=new Scanner(System.in);
System.out.println("Enter your num1 :");
int z=x.nextInt();
System.out.println("Enter your num2 :");
int y=x.nextInt();
System.out.println("number even is:");
if(z<y){
for(int i=z+1;i<y;i++){
if(i%2==0){
System.out.println(i);
}
}
}
if(y<z){
for(int i=y+1;i<z;i++){
if(i%2==0){
System.out.println(i);
}
}
}

}
}
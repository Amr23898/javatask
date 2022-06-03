import java.util.Scanner;
class factor
{
public static void main(String[]arr){
Scanner x=new Scanner(System.in);
System.out.println("Enter your num");
int z=x.nextInt();
int fact=1;
for(int i=1;i<=z;i++){
fact=fact*i;

}
System.out.println("!"+ z + "=" + fact);
}
}
import java.util.Scanner;

class fipuna {
    public static int fip(int n){
        if(n==0||n==1)
            return n;
        else {
         return fip(n-1)+fip(n-2);   
        }    
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
System.out.println("Enter your num");
       int num=s.nextInt();
        System.out.println( fip(num));        
    }
}


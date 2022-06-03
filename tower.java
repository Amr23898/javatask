import java.util.Scanner;
public class tower {
   
    public  static void movedisk(int num,char ch1,char ch2,char ch3){
        if(num==1)
            System.out.println("Move disk:"+num+" from "+ch1+" to "+ch2);
        else{
            movedisk(num-1,ch1,ch3,ch2);
            System.out.println("Move disk:"+num+" from "+ch1+" to "+ch2);
        movedisk(num-1,ch3,ch2,ch1);
        }
    }
    public static void main(String[] args) {
        Scanner x=new Scanner (System.in);
System.out.println("Enter your num shape:");
        int num=x.nextInt();
        System.out.println("the moves are");
        movedisk(num,'A','B','C');
        
    }
}

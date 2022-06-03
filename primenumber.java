import java.util.Scanner;
class numberBrim{
public static void main( String[]arr){
 int g;
        for (int x = 1; x <= 100; x++) {
          
            g = (int) Math.sqrt(x);
              boolean prime = true;
            for(int j=2;j<=g;j++)
                if(x%j==0){
                    prime=false;
                    break;
                }
 
            if (prime == true) {
                System.out.println(x);
            }
          

        }

}}
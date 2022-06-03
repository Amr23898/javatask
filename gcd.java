import java.util.Scanner;
public class gcd {
    
    public static int gcd1(int a,int b){
       
             return (b%a==0)?a:gcd1(b%a,a);
    }
    public static int gcd2(int a,int b){
        if(a<b){
        if(b==0){
            return a;
        }
        else{
            return gcd2(a%b,b%(a%b));
        }}
        else{
            if(b==0){
                return a;
            }
            else{
            return gcd2(b%a, a%(b%a));
    }}}
    
      public static int gcd3(int a,int b){
       
             int min=Math.min(a,b);
             for(int i=min;i>=1;i--){
                 if(a%i==0&&b%i==0)
                     return i;
             }
             return 1;
    }
      public static int gcd(int a,int b){
        
          if(a>b){
          if(b==0){
              return a;
          }
          else{
              int y=gcd(b,a%b);
          return gcd(y,b%y);
          }}
          else{
              System.out.println("Enter first num biger than secande");
          }
        return 1;
      }
   
    public static void main(String[] args) {
              
        
       System.out.println("gcd1(60,24) is:"+gcd1(60,24)); 
        System.out.println("gcd2(60,24) is:"+gcd2(60,24));
       char e;
        Scanner x=new Scanner(System.in);
        while(true){
        System.out.print("enter first num:");
        int num1=x.nextInt();
        System.out.print("enter secande num:");
               int num2=x.nextInt();
         System.out.println("gcd2("+num1+","+num2+")"+"is:"+gcd(num1,num2));
         System.out.println("If you return press y:");
         e=x.next().charAt(0);
	 if(e!='y')
		break;
    }

       }
     
}
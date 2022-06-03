
import java.util.Scanner;

 class Date {
    public static String getMonthName(int month){
        String monthName = null;
        switch(month){
            case 1 : 
                monthName="January";
                break;
                case 2 : 
                monthName="february";
                break;
                case 3 : 
                monthName="March";
                break;
                case 4 : 
                monthName="April";
                break;
                case 5 : 
                monthName="May";
                break;
                case 6 : 
                monthName="June";
                break;
                case 7 : 
                monthName="July";
                break;
                case 8 : 
                monthName="August";
                break;
                case 9 : 
                monthName="September";
                break;
                case 10 : 
                monthName="Octoper";
                break;
                case 11 : 
                monthName="November";
                break;
                case 12 : 
                monthName="December";
                break;
                default : 
                    System.out.println("not found");
                    break;
                    
    }
        return monthName;
    }
    
    public static boolean isLeapYear(int year){
        return year%400 == 0 ||(year%4 == 0 && year%100 != 0  );
    }
    
    public static int getNumberOfDaysInMonth(int year , int month){
        if(month==1 || month == 5 || month == 3 || month == 7 || month == 7 ||
                month == 8 || month == 10 || month == 12)
       return 31;  
       else if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
       else if (month == 2 )return isLeapYear(year)?29 : 28;
        
        
        return 0 ;
        
    }
    
    public static int getTotalNumberOfDays(int year , int month){
        int total =0 ;
        for(int i = 1800 ; i < year ;i++){
            if(isLeapYear(i)){
                total += 366;
            }
            else{
                total += 365;
            }
        }
        for (int i = 1 ; i < month ; i++){
        total += getNumberOfDaysInMonth(year , i);    
        }
        return total ;
    }
    
    public static int getStartDay(int year , int month){
    int startDay1800 = 3 ;
    int totalNumberOfDays = getTotalNumberOfDays(year, month);
    
    return (totalNumberOfDays + startDay1800)%7;
}
    
    public static void printMonthBody(int year , int month ){
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year , month);
        int i = 0 ;
          for  (i = 0 ; i < startDay ; i++){
           System.out.print("      ");
        }
       for(i = 1 ; i <= numberOfDaysInMonth ; i++){
           if(i < 10){
                       System.out.print("     "+i);
           }
           else{
                 System.out.print("    "+ i);
           }
           if((i + startDay)%7==0){
              System.out.println();
           }
       }
        System.out.println();
    }
    
    
    public static void printMonthTitle(int year , int month){
        System.out.println("    " + getMonthName(month) + " " + year);
        System.out.println("--------------------------------------------");
        System.out.println("   Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
    }

    public static void printMonth(int year , int month){
        printMonthTitle(year , month);
        printMonthBody(year , month);
    }
//public static void time(){
//java.util.Date wat=new java.util.Date();
//         java.text.SimpleDateFormat mydate = new java.text.SimpleDateFormat("dd/MM/yyyy || hh:m:ss a");
//      System.out.println(mydate.format(wat));
        

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Year : ");
        int year = in.nextInt();
        System.out.print("Enter Month : ");
        int month = in.nextInt();
        printMonth(year , month);
java.util.Date wat=new java.util.Date();
      java.text.SimpleDateFormat mydate = new java.text.SimpleDateFormat("d/MM/yyyy || hh:m:ss a");
      System.out.println("The Date of today & Time is now is:"+"["+mydate.format(wat)+"]");

    }
    
}

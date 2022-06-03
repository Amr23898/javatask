public class rectangle {
       private double  width=1;
        private double  length=1;
       private static String color= "white";
       public rectangle(){
           
       } 
        public rectangle(double wid,double len,String col){
           width=wid;
           length=len;
           color=col;
       } 
        public double getwidth(){
            return width;
        }
        public void setwidth(double wid){
            width=wid;
        } 
       public double getlength(){
            return length;
        }
        public void setlength(double len){
            length=len;
        } 
       public static String getcolor(){
            return color;
        }
        public static void setcolor(String col){
            color=col;
        } 
         public double area(){
            double area;
            area=width*length;
            return area;
        }
        public static void main(String[] args) {
        rectangle ob1=new rectangle();
       rectangle ob2=new rectangle();
            System.out.println("object1:");
             ob1.width=30;
            System.out.println("width:"+ob1.getwidth());
             ob1.length=10;
               System.out.println("length:"+ob1.getlength());
               ob1.setcolor("Red");
            System.out.println("color:"+ob1.getcolor()); 
            System.out.println("area of rectangle:"+ob1.area());
System.out.println("********************************************************");
            //**************************************
             System.out.println("object2:");
             ob2.width=40;
            System.out.println("width:"+ob2.getwidth());
             ob2.length=50;
               System.out.println("length:"+ob2.getlength());
               ob2.setcolor("Yellow");
            System.out.println("color:"+ob2.getcolor()); 
            System.out.println("area of rectangle:"+ob2.area());                      
}}


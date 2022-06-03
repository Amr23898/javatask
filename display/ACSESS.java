package display;
class function{
public static void pub(){
System.out.println("your in fun public");
}
private static void pri(){
System.out.println("your in fun pravite");
}
protected static void pro(){
System.out.println("your in fun protected");
}
 static void def(){
System.out.println("your in fun defulte");
}
public static void main(String[] args){
function fun1=new function();
fun1.pub();

}}
class disfun{
public static void main(String[] args){
function fun1=new function();
fun1.pub();
fun1.pri();
fun1.def();
fun1.pro();


}
}

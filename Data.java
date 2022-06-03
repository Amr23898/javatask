
 class SortedArray
{
  int [] a;
   static int nelment;
public SortedArray(int max)
 {
     a=new int [max];
     nelment=0;
 }
    
   void search(int searchKey){
        int i;
        for(i=0;i<a.length;i++)
        {
            if(searchKey==a[i]){
                System.out.println("elment is found");
                break;
            }
}
        if(i==a.length ) 
                System.out.println("elment is not found");  
    }
   //.............................................
public boolean delete(int value){
int i;
        for(i=0;i<a.length;i++)
        
            if(value==a[i])
               break;
           if(i== nelment) 
            return false;
else
for(int c=i;c<nelemnt;c++){
a[c]=a[c+1];
nelment--;
}
}
///............................
public static void insert(int value)
{
a[nelment]=value;
nelment++;
}
//......................
}
public class Data {
    public static void main(String[] args) {
        SortedArray a1;
      
   
        
       
        
       a1.insert(14);
       
    
    }
        
    }

    


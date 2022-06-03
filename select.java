 class selectionbyrecrsion {
    public static int select(int []arr,int x,int y){
           System.out.println("Sorted by selection");
              if(x==arr.length||y==arr.length){
                  return 0;
              }
            int min=arr[x];
            if (arr[y]<arr[x]){
                min=arr[y];
                arr[y]=arr[x];
                arr[x]=min;   
            }
            else
                min=arr[x];
               select(arr,x+1,y);    
       return select(arr,x,y+1);    
    }   
         public static void main(String[] args) {
       
             int arr[]={1,2,4,9,8,6,15,20,99,3,7}; 
         select(arr,0,1);
         
             for(int a:arr)
                 System.out.println(a);
                     
             
    }//end maim
       
                
        
    }
    


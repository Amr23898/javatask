 class randomint {
       public static int  randum(char ch1,char ch2){
        return (int)((int)ch1+Math.random()*(int)(ch1-ch2+1));
        
    }
   
        
     
    public static int getrandom(char ch1,char ch2){
      return (int)(ch1+Math.random()*(ch1-ch2+1));
  }
  
    public static void main(String[] args) {
        
        System.out.println(randum('a','z'));  
      System.out.println(randum('A','Z'));  
    
        
}        
       
    }

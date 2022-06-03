 class randomchar {
    public static char randum(char ch1,char ch2){
        return (char)(ch1+Math.random()*(ch1-ch2+1));
        
    }
  public static int getrandom(char ch1,char ch2){
      return (int)(ch1+Math.random()*(ch1-ch2+1));
  }
  
    public static void main(String[] args) {
        System.out.println(randum('a','z'));  
        
        
       
    }}

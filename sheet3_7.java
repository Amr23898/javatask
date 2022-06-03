class sheet3_7 {

    public static int add(int a, int b) {
        return a + b;
    }

    static int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int reslt = add(x, y);
        System.out.println("pass by value :" + reslt);
       //************************************************************
      int arr[] = {1,5,48,44,23,77,36,30,12,14};
   
        System.out.println("pass by referanc :"+sum(arr));
    }
}

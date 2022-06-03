import java.util.Scanner;
public class Binary {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner x = new Scanner(System.in);
        System.out.print("Enter your search num:");
        int searchkey = x.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            
         mid = (low + high) / 2;

         
            if (searchkey>mid) {
                low = mid + 1;
            }
            if (searchkey<mid) {
                high = mid - 1;
            }
   if (arr[mid] == searchkey) {
                System.out.println("found");
                break;
            }

        }
        System.out.println("not found");

    }

}

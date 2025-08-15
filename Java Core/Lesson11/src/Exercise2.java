import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == target){
                index = mid;
                break;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        int array[] = {1,2,3,4,6,7,9,11,12,14,15,16,17,19,33,34,43,45,55,66};
        int result = binarySearch(array, target);
        if(result != -1){
            System.out.println("Number " + target + " is found at index " + result + " in the array");
        } else {
            System.out.println("Cannot find the number " + target + " in the array");
        }
        scanner.close();
    }
}


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number array: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arrInts = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Element " + (i + 1) + " : ");
            arrInts[i] = scanner.nextInt();
        }
        scanner.nextLine();

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arrInts) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan ");
        }
        scanner.close();
    }
}
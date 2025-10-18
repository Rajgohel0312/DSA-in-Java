import java.util.*;

public class LargestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largestElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElem) {
                largestElem = arr[i];
            }
        }
        System.out.println("Largest Element in the array is: " + largestElem);
        sc.close();
    }
}
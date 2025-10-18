import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestElem = Integer.MIN_VALUE;

        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElem) {
                secLargest = largestElem;
                largestElem = arr[i];
            } else if (arr[i] > secLargest && secLargest != largestElem) {
                secLargest = arr[i];
            }
        }
        if (secLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println(secLargest);
        }
        sc.close();
    }
}
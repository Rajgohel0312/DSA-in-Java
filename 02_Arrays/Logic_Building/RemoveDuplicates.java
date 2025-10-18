import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // simple approach
        // int distinCount = 0;
        // for (int i = 0; i < arr.length - 1; i++) {
        // if (arr[i] != arr[i + 1]) {
        // distinCount++;
        // }
        // }
        // distinCount++;
        // System.out.println(distinCount);

        // Hashset Approach
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int distinCount = set.size();
        System.out.println(distinCount);
        sc.close();
    }
}
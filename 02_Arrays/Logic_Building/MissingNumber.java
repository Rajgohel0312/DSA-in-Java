import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int length = n +1;
        int totalSum = length *(length+1)/2;
        int sum=0;
        for(int i = 0;i<n;i++){
            sum+=arr[i];
        }
        int missingNumber = totalSum - sum;
        System.out.println(missingNumber);
        sc.close();
    }
}
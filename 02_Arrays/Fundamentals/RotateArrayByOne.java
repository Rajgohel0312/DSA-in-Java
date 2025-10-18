import java.util.*;

public class RotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int storedNum = arr[0];
        int[] newArr = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        newArr[newArr.length - 1] = storedNum;
        System.out.println(Arrays.toString(newArr));
    }
}
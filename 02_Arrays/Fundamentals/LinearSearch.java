import java.util.*;

class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be enter in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you need to search");
        int targetElem = sc.nextInt();
        int index = -1;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == targetElem) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
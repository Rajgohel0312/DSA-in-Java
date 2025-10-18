import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        // charAt

        for (int i = 0; i < name.length(); i++) {
            // System.out.println(name.charAt(i));
        }

        // // comapre string
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
    }
}

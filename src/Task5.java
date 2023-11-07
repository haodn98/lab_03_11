import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string \n");
        str1 = sc.nextLine().toLowerCase();
        boolean isfinished = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                isfinished = false;
                break;
            }
        }
        if (isfinished) {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Its not palindrome");
        }
    }
}


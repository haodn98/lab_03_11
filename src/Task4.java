import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string \n");
        str1 = sc.nextLine();
        System.out.println("Enter second string \n");
        str2 = sc.nextLine();
        String concatenate12 = str1 + str2;
        String concatenate21 = str2.concat(str1);
        System.out.println("If concatenated strings equal:  "+ concatenate21.equals(concatenate12) );

    }
}

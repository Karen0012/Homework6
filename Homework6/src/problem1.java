import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str = "Intro to Java";
        if (str.length() - 1 >= k) {
            char ch = str.charAt(k);
            System.out.println("Character " + k + " index is " + ch);
        } else {
            System.out.println("Out of bounds");
        }
    }
}





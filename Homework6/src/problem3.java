import java.util.Scanner;

public class problem3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int i;
        int begin = 0;
        int end = n.length() - 1;
        int middle = (begin + end) / 2;
        for (i = begin; i <= middle; i++) {
            if (n.charAt(begin) == n.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        if (i == middle + 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}

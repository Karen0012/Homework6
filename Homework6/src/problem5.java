import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        String j = scanner.nextLine();
        if (checkRotation(i, j)) {
            System.out.println("Correct");
        } else {
            System.out.println("Not rotated");
        }
    }

    public static boolean checkRotation(String i, String j) {
        if (i.length() != j.length()) {
            return false;
        }
        String concatenated = i + i;
        if (concatenated.indexOf(j) != -1) {
            return true;
        } else {
            return false;
        }

    }
}



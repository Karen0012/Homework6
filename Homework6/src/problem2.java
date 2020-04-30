import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String i = scanner.nextLine();
        int j = i.length();
        System.out.println(i.replace(" ", "").length());
    }
}

import java.util.Scanner;

public class Problem4 {
    static String Rotate(String str, int o) {
        String m = str.substring(o) + str.substring(0, o);
        return m;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(Rotate(i, n));
    }
}





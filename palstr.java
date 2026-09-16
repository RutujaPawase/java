import java.util.Scanner;

public class palstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        String or = s;
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("string Palindron " + rev);
        } else {
            System.out.println(" string not palindrom " + rev);
        }
    }
}

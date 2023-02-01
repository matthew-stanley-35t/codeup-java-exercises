import java.util.Objects;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String badges = "We don't need no stinkin badges";
        System.out.printf("%s %n", badges);
        badges = "Badges?!, We dont need no stinkin badges";
        System.out.println(badges);

        String s = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(s);
        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);
        String back = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(back);
    }
}
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "I am a stick!";
//        System.out.println(myString);
//
//        long myNumber = 123;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

//        System.out.println(x);
//        System.out.println(y);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately " + "%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value");
        int userInput = scanner.nextInt();

        System.out.println("Enter three words:");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

//        System.out.println("Enter a sentence");
//        String userSentence = scanner.nextLine();
        //scanner.nextLine();

        System.out.println("Enter the Length and Width of your room");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float area = length*width;
        float perim = 2*length + 2*width;
        System.out.println("The area of your room is: " + area);
        System.out.println("The perimeter length of your room is: " + perim);


        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);
        System.out.println(userInput);
//        System.out.println(userSentence);


    }
}

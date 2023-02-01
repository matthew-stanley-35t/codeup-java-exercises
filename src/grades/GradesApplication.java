package grades;

import Utils.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> gitStudentName = new HashMap<>();

        Student John = new Student("John Spartan");
        John.addGrade(100);
        John.addGrade(99);
        John.addGrade(97);

        Student Frank = new Student("Frank Smith");
        Frank.addGrade(81);
        Frank.addGrade(97);
        Frank.addGrade(84);

        Student Seau = new Student("Junior Seau");
        Seau.addGrade(80);
        Seau.addGrade(80);
        Seau.addGrade(75);

        Student Justin = new Student("Justin Herbert");
        Justin.addGrade(100);
        Justin.addGrade(100);
        Justin.addGrade(100);

        Student Tony = new Student("Tony The Tiger");
        Tony.addGrade(100);
        Tony.addGrade(90);
        Tony.addGrade(95);




        //the following is a step to put these into key value pairs.
        gitStudentName.put("MasterChief117", John);
        gitStudentName.put("FrankTheFox123", Frank);
        gitStudentName.put("SayOw55", Seau);
        gitStudentName.put("HerbieGardens10", Justin);
        gitStudentName.put("FrostedFlakes111", Tony);


        //stick the scanner in here
        Scanner scanner = new Scanner(System.in);



        String tryAgain = "";


        do{
            System.out.println("Here are the github names of students: ");
            System.out.println(gitStudentName.keySet());
            System.out.println("What student would you like to see more information on?");
            String userPick = scanner.next();

            if (userPick.equalsIgnoreCase("EdwardScissorHands111")) {

                System.out.println("Name: "+ gitStudentName.get("EdwardScissorHands111").getName() + "--" + "Github Username: EdwardScissorHands111");
                System.out.println("Current average grade: "+ gitStudentName.get("EdwardScissorHands111").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Achilles987")) {

                System.out.println("Name: " + gitStudentName.get("Achilles987").getName() + "--" + "Github Username: Achilles987");
                System.out.println("Current average grade: "+ gitStudentName.get("Achilles987").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Moonwalker78")) {
                System.out.println("Name: "+ gitStudentName.get("Moonwalker78").getName() + "--" + "Github Username: Moonwalker78");
                System.out.println("Current average grade: "+ gitStudentName.get("Moonwalker78").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("AirJordan48")) {
                System.out.println("Name: "+ gitStudentName.get("AirJordan48").getName() + "--" + "Github Username: AirJordan48");
                System.out.println("Current average grade: "+ gitStudentName.get("AirJordan48").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Birdman54")) {
                System.out.println("Name: "+ gitStudentName.get("Birdman54").getName() + "--" + "Github Username: Birdman54");
                System.out.println("Current average grade: "+ gitStudentName.get("Birdman54").getGradeAverage());
            } else {
                scanner.next();
                System.out.println("Error, there is no user with this name");
            }
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = scanner.next();


        } while (tryAgain.equalsIgnoreCase("y"));
        System.out.println("Laterz");


    }
}
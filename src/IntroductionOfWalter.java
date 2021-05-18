
//Now I'm going to allow the ability for the user to input into the console
import java.util.Scanner;


//This class is basically a typical class that would output HelloWorld but with added fields and properties
public class IntroductionOfWalter {

//    Created a property
    int waltersFavoriteNumber = 308;

//    Created a property that is string
    String waltersFirstName = "Walter";

    String waltersLastName = "Smith";


    String nickName = "WaltWalt";

    public static void main(String[] args){

        System.out.println("Hello, Walter! You are now an Alumni of Codeup!");


        String nickName = "WaltWalt";
        System.out.printf("Some of my family members on my mom's side call me %s. I still respond to that nickname", nickName);

//        I have instantiate a new object from the scanner class which was imported to this java class
        Scanner userInput = new Scanner(System.in);

    }

}

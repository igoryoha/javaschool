package week1;
import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cm number to convert: ");
        double mynumber = scanner.nextDouble();
        System.out.println("converted inch : " + mynumber*2.54);

        if (mynumber % 2 == 0)
        {
            System.out.println(mynumber + " is even");
        } else  {
            if (mynumber % 2 !=0) {

                System.out.println(mynumber + " not even");
            } else
                System.out.println("something else");

        }
        double pow=3;
        System.out.println("3x " + Math.pow(mynumber, 1 / pow));
        //System.out.println("Enter number to convert");
        //String input = System.console().readLine();
        //    String name;
        /*    if (args.length==0) {
                name="World";
            } else  {
                name=args[0];
            }
            System.out.printf("Hello, %s!\n", name);*/


    }
}

package week1;
import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cm number to convert: ");
        double mynumber = scanner.nextDouble();
        System.out.println("converted inch : " + mynumber*2.54);

        if (mynumber % 2 == 0) // Hint by Eugene System.out.println(mynumber + (mynumber % 2 == 0 ? " is even" : "not even"));
        {
            System.out.println(mynumber + " is even");
        } else  {
            if (mynumber % 2 !=0) {

                System.out.println(mynumber + " not even");
            } else
                System.out.println("something else");

        }
        double pow=3;
        double powResult = Math.pow(mynumber, 1 / pow);
        System.out.println("3x " + powResult);
        if ( Math.pow(powResult, pow) == mynumber) {
            System.out.println(mynumber + " is 3x power of " + powResult);
        }
        else
            System.out.println(mynumber + " is not int power");
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




// TRASH

/*package week1;
import java.util.Scanner;

  //  class FirstLesson {
// 15.02.2018 primer so static i peremennimi
        private Integer myVar ; //esli ubratj default zna4enie, to v lesson3.printMyVar(); v zavisimosti ot tipa budet 0
        // esli budet Integer to default budet 'null' t.k. Integer eto klass i dlja lubogo klassa default budet 'null'

        private final static int DEFAULT_VALUE = 100; // public final static - mozhno budet ispoljzovatj i v drugom klasse
                                                        //private - vnutri klassa i stati4nih metodov?

        public static void main(String[] args) {
            FirstLesson lesson = new FirstLesson();
            FirstLesson lesson2 = new FirstLesson();
            FirstLesson lesson3 = new FirstLesson();

            lesson.setMyVar(99);
            lesson2.setMyVar(88);

            lesson.printMyVar();
            lesson2.printMyVar();
            lesson3.printMyVar();
        }

        private void setMyVar(int i) {
            myVar = i;
        }

        private void printMyVar() {
            System.out.println(myVar);
        }

        public void getNewNumber(int d) throws NegativeNumberException {
            if (d < 0) {
                throw new NegativeNumberException("Negative numbers are restricted!");
            }
        }

        public class NegativeNumberException extends Exception {
            public NegativeNumberException(){};

            public NegativeNumberException(String message) {
                super(message);
            }
        }

    }



    /*
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
            System.out.printf("Hello, %s!\n", name);


    }
}
*/
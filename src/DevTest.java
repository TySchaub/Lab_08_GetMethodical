import java.util.Scanner;

/**
 * DevTest class to test input methods
 * @author tyschaub schaubtj@mail.uc.edu
 */
public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
 /*       String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name);

        // 2nd test for library
        name = SafeInput.getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name);

        int age = getInt(in, "Enter your age: ");
        System.out.println("Your age is " + age);

        double salary = getDouble(in, "Enter your salary: ");
        System.out.println("Your salary is " + salary);

        int favNum = getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);
        System.out.println("Your favorite number is " + favNum);

        double price = SafeInput.getRangedDouble(in, "Enter a price between 5.00 and 10.00: ", 5.00, 10.00);
        System.out.println("The price is " + price);

        boolean confirm = SafeInput.getYNConfirm(in, "Are you sure you want to quit?");
        System.out.println("You said " + confirm);

        String email = SafeInput.getRegExString(in, "Enter your email address ", "^[u\\w.]+@[\\w.]+$");
        System.out.println("Your email is " + email);
*/

    }
    // Method Definitions go here

    /**
     * Gets a non-zero-length string from the user.
     * Use: String name = getNonZeroLenString(pipe, prompt)
     * @param pipe - Scanner object to read from
     * @param prompt - Prompt to display to the user
     * @return - a non-empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do {
            System.out.print(prompt);
            retString = pipe.nextLine();
            if (retString.isEmpty())
            {
                System.out.println("You must enter at least one character. Please try again.");
            }
        } while (retString.isEmpty());
        return retString;
    }

    /**
     * get any integer from the user.
     * @param pipe - Scanner to read from
     * @param prompt - Prompt to display to the user
     * @return - any integer
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. Please try again.");
            }
        } while (!done);
        return retInt;
    }

    /**
     * get any double from the user.
     * @param pipe - Scanner to read from
     * @param prompt - Prompt to display to the user
     * @return - any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double. Please try again.");
            }
        } while (!done);
        return retVal;
    }

    /**
     * gets a double within the range from the user
     * @param pipe scanner to read from
     * @param prompt prompt to display to the user
     * @param low lower bound
     * @param high upper bound
     * @return int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + " [" + low + ", " + high + "] : ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal < low || retVal > high)
                {
                    System.out.println("You must enter an integer between " + low + " and " + high + ". Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. Please try again.");
            }
        } while (!done);
        return retVal;
    }

    /**
     * gets a double within the range from the user
     * @param pipe scanner to read from
     * @param prompt prompt to display to the user
     * @param low lower bound
     * @param high upper bound
     * @return double
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + " [" + low + ", " + high + "] : ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal < low || retVal > high)
                {
                    System.out.println("You must enter an integer between " + low + " and " + high + ". Please try again.");
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer. Please try again.");
            }
        } while (!done);
        return retVal;
    }

    /**
     * get a yes/no confirmation from the user.
     * @param pipe - Scanner to read from
     * @param prompt - Prompt to display to the user
     * @return - true if they said yes, false if they said no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print(prompt + " (Y/N) : ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter Y or N. Please try again.");
            }
        } while (!done);
        return retVal;
    }

    /**
     * get a string that matches the given regular expression.
     * @param pipe scanner to read from
     * @param prompt prompt to display to the user
     * @param regex regular expression to match
     * @return - string that matches the given regular expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regex)
    {
        String retString = "";
        boolean done = false;

        do {
            System.out.print(prompt + "[" + regex + "] :");
            retString = pipe.nextLine();
            if (retString.matches(regex))
            {
                done = true;
            }
            else
            {
                System.out.println("You must enter a string that matches the regular expression " + regex + ". Please try again.");
            }
        } while (!done);
        return retString;
    }
}

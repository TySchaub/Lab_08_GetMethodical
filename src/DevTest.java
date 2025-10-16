import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name);

        // 2nd test for library
        name = SafeInput.getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello, " + name);
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
}
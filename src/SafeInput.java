import java.util.Scanner;

public class SafeInput
{
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

import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCID = "";
        String menu = "";

        SSN = SafeInput.getRegExString(in,"What Is your ssn ###-##-#### ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You entered " + SSN);
        UCID = SafeInput.getRegExString(in,"What Is your UC M Number? M##### ", "(M|m)\\d{5}");
        System.out.println("You entered " + UCID);
        menu = SafeInput.getRegExString(in,"Which option would you like to select? ^[OoSsVvQq]$", "^[OoSsVvQq]$");
        System.out.println("You selected " + menu);
    }
}
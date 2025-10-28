import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;


        year = SafeInput.getRangedInt(in, "What year were you born? ", 1950, 2010);
        month = SafeInput.getRangedInt(in, "What month were you born in? ", 1, 12);
        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            day = SafeInput.getRangedInt(in,"What day were you born on? ", 1, 30);
        }
        else if (month == 2)
        {
            day = SafeInput.getRangedInt(in,"What day were you born on? ", 1, 28);
        }
        else
        {
            day = SafeInput.getRangedInt(in,"What day were you born on? ", 1, 31);
        }
        hour = SafeInput.getRangedInt(in,"What hour were you born on? ", 1, 24);
        minute = SafeInput.getRangedInt(in, "What minute were you born on? ", 1, 60);


        System.out.println("You were born in " +year + " The month you were born in was " +
                month + " The day you were born on was " + day + " The hour you were born on was " + hour + " The minute was " + minute);

    }


}

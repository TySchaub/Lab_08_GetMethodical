import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        double subtotal = 0;
        double newItem = 0;
        boolean done = false;

        System.out.println("Welcome to the ten dollar store!");
        do {
            newItem = SafeInput.getRangedDouble(in, "Add the price of your item", 0.50, 10.00);
            subtotal += newItem;
            System.out.println("Your subtotal is $" + subtotal);
            done = SafeInput.getYNConfirm(in, "Are you done with your order? ");
        }while (!done);
    }
}

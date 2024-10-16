import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double shipCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = .02;
        String trash = "" ;


        System.out.print("Enter the price of an item: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the buffer

            if(itemPrice <= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else // have to pay shipping
            {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;

            }
            // displays results
            System.out.println("Shipping costs are: " + shipCost);
            System.out.println("Total cost are: " + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("'" + trash + "' is not a valid number.");
            System.out.println("Run the program again with correct imput (a number)");
        }
    }
}

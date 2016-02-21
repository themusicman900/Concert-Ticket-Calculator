/**
 * Setting the seating type
 * @author nick
 */
import java.text.DecimalFormat;

public class SeatType {
    
        public static void main(String[] args)
    {
            //Step 1
        String inputStr;
        double TicketA;
        double TicketB;
        double TicketC;
        int noOfTicketASold;
        int noOfTicketBSold;
        int noOfTicketCSold;


        movieName = JOptionPane.showInputDialog
                          ("Enter the movie name");                 //Step 2

        inputStr = JOptionPane.showInputDialog
                    ("Enter the price of an adult ticket");         //Step 3
        adultTicketPrice = Double.parseDouble(inputStr);            //Step 4

        inputStr = JOptionPane.showInputDialog
                    ("Enter the price of a child ticket");          //Step 5
        childTicketPrice = Double.parseDouble(inputStr);            //Step 6

        inputStr = JOptionPane.showInputDialog
                    ("Enter number of adult tickets sold");         //Step 7
        noOfAdultTicketsSold = Integer.parseInt(inputStr);          //Step 8

        inputStr = JOptionPane.showInputDialog
                    ("Enter number of child tickets sold");         //Step 9
        noOfChildTicketsSold = Integer.parseInt(inputStr);          //Step 10

        inputStr = JOptionPane.showInputDialog
                    ("Enter the percentage of donation");           //Step 11


    }
}

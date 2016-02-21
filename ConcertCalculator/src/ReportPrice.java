/**
 * Setting the ticket price
 * @author nick
 */
import java.text.DecimalFormat;

public class ReportPrice {
    
    
    public static void main(String[] args)
    {
            //Step 1
        String outputStr;
        double percentDonation;
        double grossAmount;
        double amountDonated;
        double netSaleAmount;

        DecimalFormat twoDigits = new DecimalFormat("0.00");        //Step 2

        percentDonation = Double.parseDouble(inputStr);             //Step 3

        grossAmount = adultTicketPrice * noOfAdultTicketsSold +
                         childTicketPrice * noOfChildTicketsSold;   //Step 4

        amountDonated = grossAmount * percentDonation / 100;        //Step 5
        netSaleAmount = grossAmount - amountDonated;                //Step 6

        outputStr = "Movie Name: " + movieName + "\n"
                    + "Number of Tickets Sold: "
                      + (noOfAdultTicketsSold +
                       noOfChildTicketsSold) + "\n"
                      + "Gross Amount: $"
                    + twoDigits.format(grossAmount) + "\n"
                    + "Percentage of Gross Amount Donated: "
                    + twoDigits.format(percentDonation) + "%\n"
                    + "Amount Donated: $"
                    + twoDigits.format(amountDonated) + "\n"
                    + "Net Sale: $"
                    + twoDigits.format(netSaleAmount);              //Step 7

      TicketForm.showMessageDialog(null, outputStr,
                        "Theater Sales Data",
                        TicketForm.INFORMATION_MESSAGE);           //Step 8
      System.exit(0);                                               //Step 9
    }
}
}
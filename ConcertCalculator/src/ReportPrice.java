
import java.util.ArrayList;


/**
 * Setting the ticket price
 *
 * @author Nicholas Bollong
 */

public class ReportPrice {

    private TicketForm ticketForm = null;

    public ReportPrice(TicketForm ticketForm) {
        this.ticketForm = ticketForm;
    }

    public String getReport() {
        
        
        
        // setting up my seat types and setting up their prices
        String output;
        
        ConcertSeats row1 = new ConcertSeats("Row A", Integer.valueOf(ticketForm.getTxtNum1().getText()), Double.valueOf(ticketForm.getTxtNum2().getText()));
        ConcertSeats row2 = new ConcertSeats("Row B", Integer.valueOf(ticketForm.getTxtNum3().getText()), Double.valueOf(ticketForm.getTxtNum4().getText()));
        ConcertSeats row3 = new ConcertSeats("Row C", Integer.valueOf(ticketForm.getTxtNum5().getText()), Double.valueOf(ticketForm.getTxtNum6().getText()));
        
        // multiplying the num of tickets and the price of tickets to get total for that row 
        Double row1Total = row1.getNum() * row1.getCost();
        Double row2Total = row2.getNum() * row2.getCost();
        Double row3Total = row3.getNum() * row3.getCost();
        
        // add the totals of each row to get the grand total of all the ticket
        Double grandTotal = row1Total + row2Total + row3Total;
        
        //setting the output info for the txt output in the ticketform
        output ="        Tickets Sold"  + "     Price" +"      Total" + "\n";
        output = output + "        ------------" + "     -----" + "      -----" + "\n";
        output = output + row1.getType() + "    " + row1.getNum() + "               " + row1.getCost() + "       $" + row1Total + "\n";
        output = output + row2.getType() + "    " + row2.getNum() + "               " + row2.getCost() + "       $" + row2Total + "\n";
        output = output + row3.getType() + "    " + row3.getNum() + "               " + row3.getCost() + "       $" + row3Total + "\n";
        output = output + " " + "\n";
        output = output + "Total Sales: $" + grandTotal;
        return output;
        
        
    }

}

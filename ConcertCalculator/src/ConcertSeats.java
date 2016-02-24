/**
 * My objects that will be used for the ReportPrice class
 * @author Nicholas Bollong
 */
/** This will setup what the objects are going to be called */
public class ConcertSeats {
    private final String type;
    private final Double cost;
    private final Integer num;
    
    // this will be what type of object they are
    public ConcertSeats(String type, Integer num, Double cost) {
        this.type = type;
        this.cost = cost;
        this.num = num;
    }
    
    // the methods for the each of the objects
    public String getType() {
        return type;
    }
 
    public Double getCost() {
        return cost;
    }
 
    public Integer getNum() {
        return num;
    }
    
}

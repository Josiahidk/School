public class airline_ticket {

    //attributes
    private String destination, passengerName;
    private double cost;


    //constructor
   public airline_ticket(String passName, String dest, double c){
    passengerName = passName;    
    destination = dest;
        cost = c;
   }

   //get method or accessor
   public String getPassengerName() {
    return passengerName;
   }
   public double getCost() {
    return cost;
   }

   public String getDestination(){
    return destination;
   }
   //set method mutator
   public void setCost(double c){
        cost = c;
   }

   public void setDestination(String dest){
    destination = dest;
}

    public void setPassengerName(String passName){
        passengerName = passName;
    }

    public String toString(){
        return "Passenger " + passengerName + "\nDestination: " + destination + "\nCost: $" + cost + "\n";
    }
}

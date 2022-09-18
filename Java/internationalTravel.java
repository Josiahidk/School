public class internationalTravel {
    public static void main(String[] args) {
        //Create objects
        airline_ticket t1 = new airline_ticket("Canada", 4500, "John Smith");
        airline_ticket t2 = new airline_ticket("Mexico", 3850, "William Christie");

        //change price
        t1.setCost(4200);

        //display t1 object
        System.out.println("\n"+t1.toString());

        double totalcost = t1.getCost() + t2.getCost();
        System.out.println("Total cost of the two tickets: " + totalcost);
    }
}

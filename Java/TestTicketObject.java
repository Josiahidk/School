import java.util.Scanner;

public class TestTicketObject {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
/*
        //declare array of objects
        airline_ticket [] ticketObj = new airline_ticket[4];
        
        //initialize array objects individually
        ticketObj[0] = new airline_ticket("Barbados", 3575.00, "John Doe");
        ticketObj[1] = new airline_ticket("Canada", 6500.00, "Peter Smith");
        ticketObj[2] = new airline_ticket("Cancun", 7500.00, "Tom Fred");
        ticketObj[3] = new airline_ticket("Trinidad", 1500.00, "Johnny Smith");
*/

/*
        //initialize using initializer list - Alternative way to populate
        airline_ticket[] ticketObj =  {
           new airline_ticket("Barbados", 3575.00, "John Doe"),
           new airline_ticket("Canada", 6500.00, "Peter Smith"),
           new airline_ticket("Cancun", 7500.00, "Tom Fred"),
           new airline_ticket("Trinidad", 1500.00, "Johnny Smith")
        };
        */
        //initialize using user input - Alternative way to populate
        airline_ticket [] ticketObj = new airline_ticket[4];
        String desti, name;
        double price = 0;

        for (int i = 0; i < ticketObj.length; i++) {

            System.out.println("Enter Name:");
            name = input.nextLine();
            System.out.println("Enter Destination:");
            desti = input.nextLine();

            if(desti.equals("Canada")) price = 3500;
            else if(desti.equals("US")) price = 10000;
            else if(desti.equals("Trinidad")) price = 500;
            else if(desti.equals("California")) price = 1000;

            ticketObj[i] = new airline_ticket(name, desti, price);
            System.out.println(price);
        }



        //process array of objects
        //display objects
        
        for (int i = 0; i < ticketObj.length; i++) System.out.println("\n" + ticketObj[i].toString());
        

        //change destination
        ticketObj[1].setDestination("Trinidad");


        //display object with change
        System.out.println("Updated: \n" + ticketObj[1].toString());




    }//end main
}//end class

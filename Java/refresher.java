import java.util.Scanner;
public class refresher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lunchMoney[] = new double[5];


        double totalMoney = 0;
        int over = 0;

        for (var i = 0; i < lunchMoney.length; i++) {
            //prompt
            System.out.println("Enter cost of lunch today: ");

            lunchMoney[i] = input.nextDouble();

            //input
            totalMoney += lunchMoney[i];

            //processing
            if(lunchMoney[i] > 40) over++;
            
        }

        //Output
        System.out.println("Total money spent on lunch: " + totalMoney);

        if(totalMoney > 200)
            System.out.println("Weekly lunch allowance exceeded: " + totalMoney);

        
        System.out.println("No. of days lunch exceeded $40: " + over);

        input.close();
    }
    //End main
}
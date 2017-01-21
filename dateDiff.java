import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Java App takes in two different Dates from the user and finds the difference between the two dates.
 */
public class dateDiff {
    public static void main(String args[]) throws Exception {
        //Accepts user input in certain format.
        System.out.println("Enter two dates, Earliest year first,  in yyyy/MM/dd format: ");
        Scanner reader = new Scanner(System.in);
        String one = reader.nextLine();
        String two = reader.nextLine();

        //Takes input data and iterates through the string in specific format.
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date d1 = format.parse(one);
        Date d2 = format.parse(two);

        //Calculates the difference between the dates
        long difference = d2.getTime() - d1.getTime();
        long diff = d1.getTime() - d2.getTime();

        //Makes sure that the answer does not come out to negative number.
        if(difference/difference == -1) {
            System.out.println("The difference between the two dates are: " + (diff* -1) / 86400000+ " days");
        }
        else{
            System.out.println("The difference between the two dates are: " + difference / 86400000 + " days");
        }

    }
}
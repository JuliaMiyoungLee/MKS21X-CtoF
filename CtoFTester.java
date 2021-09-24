/*I would need the parameters that give the starting degrees value and then one that indicates whether that value is in F or C.
The degrees would be a double and whether the value is F or C I would make a string.
I would prompt the person to type either "F" or "C" depending on whether its Farenheit or celcius
I would have the functions return a double and then round the double later when I print it*/
import java.util.Scanner;

public class CtoFTester {

  public static void main(String[] args){
    double degrees;
    Scanner d = new Scanner(System.in);
    System.out.print("How many degrees is it?");
    degrees = d.nextDouble();
    d.nextLine();
    String unit;
    Scanner u = new Scanner(System.in);
    System.out.print("What are the units? Type F for Farenheit and C for Celcius.");
    unit = u.nextLine();
    if (unit == "C") {
      System.out.printf("%.1f C = %.1f F", degrees, degrees);
    } else {
      System.out.printf("%.1f F = %.1f C", degrees, degrees);
    }
  }
}
/* celsiusToFahrenheit()
double farenheit;
farenheit = (celcius * (9.0/5.0)) + 32;
fahrenheitToCelsius() */

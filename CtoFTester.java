/*I would need the parameters that give the starting degrees value and then one that indicates whether that value is in F or C.
The degrees would be a double and whether the value is F or C I would make a string.
I would prompt the person to type either "F" or "C" depending on whether its Fahrenheit or celcius
I would have the functions return a double and then round the double later when I print it*/
/*I actually ran into some problems when trying to use the string input. For now I'm going to compromise with having the input with scanner be
an int instead of a string or char, but I'll go back to this.*/
import java.util.Scanner;

public class CtoFTester {

  public static double celsiusToFahrenheit(double degrees) {
    double converted = (degrees * (9.0/5.0)) + 32;
    return converted;
  }

  public static double   fahrenheitToCelsius(double degrees) {
    double converted = ((degrees-32.0) * (5.0/9.0));
    return converted;
  }

  public static void main(String[] args){
    double degrees;
    Scanner d = new Scanner(System.in);
    System.out.println("How many degrees is it?");
    degrees = d.nextDouble();
    d.nextLine();
    String unit;
    Scanner u = new Scanner(System.in);
    System.out.println("What are the units? Type F or C.");
    unit = u.nextLine();
    if (unit.equals("C")) {
      double converted = celsiusToFahrenheit(degrees);
      System.out.printf("%.1f C = %.1f F", degrees, converted);
    } else if (unit.equals("F")) {
      double converted = fahrenheitToCelsius(degrees);
      System.out.printf("%.1f F = %.1f C", degrees, converted);
    }
  }
}

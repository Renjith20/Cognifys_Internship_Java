
import java.util.Scanner;

public class temperature_Converter {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the temperature : ");
            float temp = sc.nextFloat();
            System.out.print("Enter the unit of the temperature 'F' for Fahrenheit & 'C' for Celsius : ");
            char unit = sc.next().toUpperCase().charAt(0);

            switch(unit){
                case 'C' :
                    float fahrenheit = (temp * 9 / 5) + 32 ;
                    System.out.print("Celsius -> Fahrenheit temperature : " +fahrenheit);
                    break;
                case 'F' :
                    float celsius = (temp - 32) * 5 / 9;
                    System.out.print("Fahrenheit -> Celsius temperature : " +celsius);
                    break;
                default: System.out.println("Enter a valid input");
            }
        }
    }


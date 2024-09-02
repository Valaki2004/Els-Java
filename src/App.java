import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception 
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sugár: ");
    String radiusstr = scanner.nextLine();
    Double radius = Double.parseDouble(radiusstr);
    
    System.out.print("Magasság: ");
    String heightstr = scanner.nextLine();
    Double height = Double.parseDouble(heightstr);

    Double eredmeny = (1.0/3.0) * radius * height;
    Double eredmenyketto = (1.0/3.0) * Math.pow(radius,2) * Math.PI * height;

    System.out.println("Kúp IDK: "  + eredmeny); 
    System.out.println("Kúp térfogata: "  + eredmenyketto);   

    scanner.close();

    }
}

















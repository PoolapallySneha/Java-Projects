import java.util.Scanner;

public class TotalSolarEnergy {
    
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double total = morningEnergy + eveningEnergy;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter morning energy generated (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy generated (kWh): ");
        double evening = sc.nextDouble();

        
        double totalEnergy = calculateTotalEnergy(morning, evening);

        
        System.out.println("Total Energy Generated (kWh): " + totalEnergy);

        sc.close();
    }
}
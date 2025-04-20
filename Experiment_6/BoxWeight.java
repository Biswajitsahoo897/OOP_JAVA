import java.util.Scanner;
class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double calculateVolume() {
        return width * height * depth;
    }
}

class Boxweight extends Box {
    double weight;

    Boxweight(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }

    double calculateShippingCost(double distance, double costPerKm) {
        return distance * calculateVolume() * costPerKm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter box dimensions (width height depth):");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        
        System.out.println("Enter box weight:");
        double wt = sc.nextDouble();
        
        System.out.println("Enter distance (km):");
        double dist = sc.nextDouble();
        
        System.out.println("Enter cost per km:");
        double costPerKm = sc.nextDouble();
        
        Boxweight bw = new Boxweight(w, h, d, wt);
        System.out.println("Volume: " + bw.calculateVolume());
        System.out.println("Shipping cost: " + bw.calculateShippingCost(dist, costPerKm));
        sc.close();
    }
}

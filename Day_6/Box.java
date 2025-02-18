
// Q1 
// A class 'Box' which contains methods and other details(width, height, depth) to calculate 
// volume. 
// Another class ‘Boxweight’ contains method for finding cost for shipping the box using weight 
// of the box (formula to find cost of shipping= distance in km * volume * cost per km)  
// Take cost per KM by the user. 
// WAP to find the volume of box and cost to ship using a single object 

package Day_6;

import java.util.Scanner;


public class Box {
    double width, height,depth;
    
    Box(double width,double height,double depth){
        this.depth=depth;
        this.height=height;
        this.width=width;
    }
    double getVolume(){
        return depth*height*width;

    }
}
class Boxweight extends Box{
    double distance;
    Boxweight(double width,double height,double depth,double distance){
        super(width,height,depth);
        this.distance=distance;
    }
    double costPerKm;
    double costOfShipping(double costPerKm){
        return costPerKm*getVolume()*distance;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        Boxweight obj_1=new Boxweight(89, 62.74, 18.3, 90);
        System.out.println("Enter the cost per km:");
        obj_1.costPerKm=sc.nextDouble();
        System.out.println("Volume:"+obj_1.getVolume());
        System.out.println("Cost of Shipping:"+obj_1.costOfShipping(7.5));
        sc.close();
    }

}

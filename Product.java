package Day_4;
import java.util.Scanner;
public class Product
{
    int productID;
    Double price;
    String productName;
    int quantityInStock;
    // this is a constructor 
    public Product(String productName,double price, int productID,int quantityInStock){
        this.price=price;
        this.productID=productID;
        this.productName=productName;
        this.quantityInStock=quantityInStock;
    }

    void applyDiscount(double discountpercent,int id){
        if(discountpercent>100||discountpercent<0){
            System.out.println("Inavalid check your parameter!!!");
            return;
        }
        price-=price*(discountpercent/100);
        System.out.println("Updated price on "+productName+ "\nYou got it :"+price);
        return;
    }


    void display(){
        System.out.println();
        System.out.println("Displaying the details of the Product");
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
    public static void main(String[] args) {
        // Product obj_1=new Product();
        // Product obj_2=new Product();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Product name:");
        String Name=sc.nextLine();

        System.out.println("Enter productID:");
        int productID=sc.nextInt();

        System.out.println("Enter the price:");
        double price=sc.nextDouble();

        System.out.println("Enter Quantity :");
        int quant=sc.nextInt();
        
        Product pro_1=new Product(Name, price, productID, quant);
        pro_1.display();
        pro_1.applyDiscount(34,productID);


    }
}

//  Design a class called Product to represent items on an e-commerce site. The 
// class should include fields for productName, productID, price, and 
// quantityInStock.
//   How would you implement a m
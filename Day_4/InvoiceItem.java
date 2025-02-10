
class InvoiceItem {
    String id, description;
    int quantity;
    double unitPrice;

    InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    double getTotalPrice() {
        return quantity * unitPrice;
    }

    double applyDiscount(double discountPercentage) {
        return getTotalPrice() - (getTotalPrice() * discountPercentage / 100);
    }

    double applyTax(double taxPercentage) {
        return applyDiscount(10) + (applyDiscount(10) * taxPercentage / 100); // Assuming 10% discount
    }

    void displayInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Price: $" + getTotalPrice());
        System.out.println("Price after Discount (10%): $" + applyDiscount(10));
        System.out.println("Final Price after Tax (5%): $" + applyTax(5));
    }

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("A101", "Laptop", 2, 50000);
        item.displayInvoice();
    }
}

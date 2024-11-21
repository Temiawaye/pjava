import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String customerName = shop.nextLine();

        System.out.println("Enter Product");
        String Product = shop.nextLine();

        System.out.println("Enter Price");
        int price = shop.nextInt();

        System.out.println("Enter Qty");
        int Qty = shop.nextInt();

        System.out.println("RECEIPT");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order: " + Product);
        System.out.println("Quantity: " + Qty);
        System.out.println("Price: " + price);
        System.out.println(Qty * price);


    }
}
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner shop = new Scanner(System.in);

        System.out.print("Enter Product:");
        String Product = shop.nextLine();
        System.out.print("Enter Price:");
        int price = shop.nextInt();
        System.out.print("Number of Available Products:");
        int numofProducts = shop.nextInt();
        shop.nextLine(); // Consume newline character
        int x = numofProducts;

        for (int i = 0; i < x; i++) {

            // int t = numofProducts - Qty;
            System.out.print("Enter Customer " + (i + 1) + " Name:"  );
            String customerName = shop.nextLine();

            System.out.println("Description:");
            String description = shop.nextLine();

            System.out.print("Enter Qty:");
            int Qty = shop.nextInt();

            System.out.println("-----------------------------------------------");

            System.out.println("RECEIPT FOR CUSTOMER " + (i + 1));
            System.out.println("Customer Name: " + customerName);
            System.out.println("Order: " + Product);
            System.out.println("Description: " + description);
            System.out.println("Quantity: " + Qty);
            System.out.println("Price: " + price);
            System.out.println("Total: " + Qty * price);
            System.out.println("-----------------------------------------------");
            
            int productLeft = numofProducts - Qty;
            int y = productLeft;
            System.out.println("Nmmber of " + Product + "left: " + productLeft);
            shop.nextLine();
            
            if (productLeft == 0) {
                System.out.println("Out of stock for " + Product);
                break;
            }
        }

        // System.out.println("Enter Customer Name");
        // String customerName = shop.nextLine();

        // System.out.println("Enter Product");
        // String Product = shop.nextLine();

        // System.out.println("Enter Price");
        // int price = shop.nextInt();

        // System.out.println("Enter Qty");
        // int Qty = shop.nextInt();

        // System.out.println("RECEIPT");
        // System.out.println("Customer Name: " + customerName);
        // System.out.println("Order: " + Product);
        // System.out.println("Quantity: " + Qty);
        // System.out.println("Price: " + price);
        // System.out.println(Qty * price);


    }
}
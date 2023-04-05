import stores.*;
import java.util.*;

public class Demo{
    public static void main(String[] args) 
    {
        ArrayList<stock> items = new ArrayList<stock>();
        items.add(new stock(1, "Laptop", 10, 20.0));
        items.add(new stock(2, "Mouse", 20, 30.0));
        items.add(new stock(3, "Keyboard", 30, 40.0));

        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\nCurrent Stock:");
            for (stock item : items) 
            {
                System.out.println(item);
            }

            System.out.print("\nEnter the item No to Add stock, or 0 to Exit:");
            int item_no = scanner.nextInt();
            if (item_no == 0) 
            {
                break;
            }

            stock item = items.stream().filter(i -> i.getItem_no() == item_no).findFirst().orElse(null);
            if (item == null)
            {
                System.out.println("Invalid item No.");
            } 
          else 
            {
                System.out.print("\n\nEnter the Quantity to Add:");
                int qty = scanner.nextInt();
                item.setStock_available(item.getStock_available() + qty);
                System.out.println("Stock Added Successfully.");
            }
        }
    }
}

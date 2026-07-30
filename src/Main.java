
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> inventory = new ArrayList<>();

        while (true) {

            System.out.println("\n========== Inventory Registry ==========");
            System.out.println("1. Add Item");
            System.out.println("2. View Inventory");
            System.out.println("3. Search Item");
            System.out.println("4. Remove Item");
            System.out.println("5. Sort Inventory");
            System.out.println("6. Count Items");
            System.out.println("7. Clear Inventory");
            System.out.println("8. Exit");

            System.out.print("\nChoose an option : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("How many items do you want to add? ");

                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        System.out.print("Enter item " + (i + 1) + " : ");

                        String item = sc.nextLine();

                        inventory.add(item);

                    }

                    System.out.println("Items added successfully.");

                    break;

                case 2:

                    if (inventory.isEmpty()) {

                        System.out.println("Inventory is empty.");

                    } else {

                        System.out.println("\nInventory:");

                        for (int i = 0; i < inventory.size(); i++) {

                            System.out.println((i + 1) + ". " + inventory.get(i));

                        }

                    }

                    break;

                case 3:

                    System.out.print("Enter item name : ");

                    String search = sc.nextLine();

                    if (inventory.contains(search)) {

                        System.out.println(search + " found.");

                    } else {

                        System.out.println(search + " not found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter item to remove : ");

                    String remove = sc.nextLine();

                    if (inventory.remove(remove)) {

                        System.out.println("Item removed.");

                    } else {

                        System.out.println("Item not found.");

                    }

                    break;

                case 5:

                    Collections.sort(inventory);

                    System.out.println("Inventory sorted.");

                    break;

                case 6:

                    System.out.println("Total Items : " + inventory.size());

                    break;

                case 7:

                    inventory.clear();

                    System.out.println("Inventory cleared.");

                    break;

                case 8:

                    System.out.println("Thank you for using Inventory Registry.");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid option.");

            }

        }

    }

}

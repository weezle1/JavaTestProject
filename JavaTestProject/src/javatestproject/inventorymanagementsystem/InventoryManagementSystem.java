package javatestproject.inventorymanagementsystem;

import java.util.Scanner;

public class InventoryManagementSystem {
	private int itemCount;
	private String[] itemName;
	private int[] itemQuantity;
	private double[] itemPrice;
	
	public InventoryManagementSystem() {
		this.itemCount = 0;
		this.itemName = new String[100];
		this.itemQuantity = new int[100];
		this.itemPrice = new double[100];
	}
	
	public void addItem(String name, int quantity, double price) {
		this.itemName[this.itemCount] = name;
		this.itemQuantity[this.itemCount] = quantity;
		this.itemPrice[this.itemCount] = price;
		this.itemCount++;
	}
	
	public void updateQuantity(String name, int quantity) {
		for(int i = 0; i < this.itemCount; i++) {
			if(itemName[i].equals(name)) {
				this.itemQuantity[i] += quantity;
			}
		}
	}
	
	public void displayInventory() {
		System.out.println("Item Name\tQuantity\tPrice");
		for(int i = 0; i < this.itemCount; i++) {
			System.out.println(this.itemName[i] + "\t\t" + this.itemQuantity[i] + "\t\t" + this.itemPrice[i]);
		}
	}
	
   public static void main(String[] args) {
	      InventoryManagementSystem ims = new InventoryManagementSystem();
	      Scanner sc = new Scanner(System.in);
	      while (true) {
	         System.out.println("1. Add Item");
	         System.out.println("2. Update Quantity");
	         System.out.println("3. Display Inventory");
	         System.out.println("4. Exit");
	         System.out.print("Enter your choice: ");
	         int choice = sc.nextInt();
	         sc.nextLine();
	         if (choice == 1) {
	            System.out.print("Enter item name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter item quantity: ");
	            int quantity = sc.nextInt();
	            System.out.print("Enter item price: ");
	            double price = sc.nextDouble();
	            ims.addItem(name, quantity, price);
	         } else if (choice == 2) {
	            System.out.print("Enter item name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter quantity to update: ");
	            int quantity = sc.nextInt();
	            ims.updateQuantity(name, quantity);
	         } else if (choice == 3) {
	            ims.displayInventory();
	         } else if (choice == 4) {
	            break;
	         }
	      }
	   }
}

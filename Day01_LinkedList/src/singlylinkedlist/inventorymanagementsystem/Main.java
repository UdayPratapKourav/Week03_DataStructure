package singlylinkedlist.inventorymanagementsystem;

public class Main {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();
        inventory.addItem(1, "Item A", 10, 50.0, "end");
        inventory.addItem(2, "Item B", 5, 30.0, "beginning");
        inventory.addItem(3, "Item C", 8, 20.0, "end");
        inventory.displayInventory();
        inventory.updateQuantity(1, 15);
        inventory.searchItem(2);
        System.out.println("Total Inventory Value: " + inventory.calculateTotalValue());
        inventory.removeItem(3);
        inventory.displayInventory();
    }
}




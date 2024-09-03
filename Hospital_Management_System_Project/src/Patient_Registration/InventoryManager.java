package Patient_Registration;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager
{
	 private Map<String, InventoryItem> inventoryDatabase = new HashMap<>();

	    public void addItem(InventoryItem item) {
	        inventoryDatabase.put(item.getItemId(), item);
	    }

	    public InventoryItem getItem(String itemId) {
	        return inventoryDatabase.get(itemId);
	    }

	    public void updateItem(InventoryItem item) {
	        inventoryDatabase.put(item.getItemId(), item);
	    }

	    public void removeItem(String itemId) {
	        inventoryDatabase.remove(itemId);
	    }
}

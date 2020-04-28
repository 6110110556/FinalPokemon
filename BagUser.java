import java.util.ArrayList;

public class BagUser {

    private int fullBag;
    private ArrayList<Item> items;
    

    public BagUser() {

        items = new ArrayList<Item>();
        this.fullBag = 50;

    }
    
    public boolean addItem(Item item) {

        if(items.size() <= fullBag) {
            items.add(item);
            return true;
        }
        else {
            return false;
        }
    }

    public int inputCountItem(String itemName){

        int count = 0;
        for(int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            if(item.getName().equals(itemName)){
                count++;
            }
        }
        return count;

    }

}
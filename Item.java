import java.util.ArrayList;

public class Item {

    private String nameItem_Item;
    private int numItem_Item;

    public Item(String nameItem, int numItem) {
        this.nameItem_Item = nameItem;
        this.numItem_Item = numItem; 
    }

 /*
    public void setName(String nameItem) {
        this.nameItem_Item = nameItem; 
    }
*/

    public String getName() {
        return this.nameItem_Item;
    }

}
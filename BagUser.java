import java.util.ArrayList;

public class BagUser {

    private int fullBag;
    private ArrayList<Item> items;
    private ArrayList<Pokemon> pokedex;
    

    public BagUser() {
        pokedex = new ArrayList<Pokemon>();
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
            if(item.getNameItem().equals(itemName)){
                count++;
            }
        }
        return count;

    }

    public int findItem(String NameItem) {

        for (int i = 0; i < this.items.size(); i++) {
            Item item = items.get(i);
            if (item.getNameItem().equals(NameItem)) {
                return i;
            }
        } 
        return -1;

    }

    public void removeItem(int index){
        if(index >= 0 && index <= items.size()){
            items.remove(index);
        }
         
    }

    public boolean addPokedex(Pokemon pokemon) {

        if(pokedex.size() <= fullBag) {
            pokedex.add(pokemon);
            return true;
        }
        else {
            return false;
        }
    }

    public int inputCountPokedex(String namePokemon){

        int count = 0;
        for(int i = 0; i < pokedex.size(); i++){
            Pokemon pokemons = pokedex.get(i);
            if(pokemons.getNamePokemon().equals(namePokemon)){
                count++;
            }
        }
        return count;

    }

    public void removePokemon(int index){
        if(index >= 0 && index <= pokedex.size()){
            pokedex.remove(index);
        }
         
    }

    public ArrayList<Item> getItems() {
        return  items;
    }
    

}
import java.util.ArrayList;

public class TreasuryItem {
    
    private int rateEffectItem;
    private DataUser data;

    private Item itemMixBerry_TreasuryItem;
    private Item itemBerry_TreasuryItem;
    private Item itemPotionHP_TreasuryItem;
    private Item itemPotionMP_TreasuryItem;

    private Item itemPokemonRankA_Card_TreasuryItem;
    private Item itemPokemonRankB_Card_TreasuryItem;
    private Item itemPokemonRankC_Card_TreasuryItem;
    private Item itemPokemonRankD_Card_TreasuryItem;


    private String nameItemMixBerry_TreasuryItem;
    private String nameItemBerry_TreasuryItem;
    private String nameItemPotionHP_TreasuryItem;
    private String nameItemPotionMP_TreasuryItem;
    private int pokeBall;

    private String nameItemPokemonRankA_Card_TreasuryItem;
    private String nameItemPokemonRankB_Card_TreasuryItem;
    private String nameItemPokemonRankC_Card_TreasuryItem;
    private String nameItemPokemonRankD_Card_TreasuryItem;

    public TreasuryItem(DataUser data) {
        this.rateEffectItem = 20;
        this.nameItemMixBerry_TreasuryItem = "MixBerry";
        this.nameItemBerry_TreasuryItem = "Berry";
        this.nameItemPotionHP_TreasuryItem = "PotionHP";
        this.nameItemPotionMP_TreasuryItem = "PotionMP";
        this.pokeBall = data.getPokeBall();
        this.nameItemPokemonRankA_Card_TreasuryItem = "PokemonRankA_Card";
        this.nameItemPokemonRankB_Card_TreasuryItem = "PokemonRankB_Card";
        this.nameItemPokemonRankC_Card_TreasuryItem = "PokemonRankC_Card";
        this.nameItemPokemonRankD_Card_TreasuryItem = "PokemonRankD_Card";

        itemMixBerry_TreasuryItem = new Item(nameItemMixBerry_TreasuryItem, data.getMixBerry());
        itemBerry_TreasuryItem = new Item(nameItemBerry_TreasuryItem, data.getBerry());
        itemPotionHP_TreasuryItem = new Item(nameItemPotionHP_TreasuryItem, data.getPotionHP());
        itemPotionMP_TreasuryItem = new Item(nameItemPotionMP_TreasuryItem, data.getPotionMP());

        itemPokemonRankA_Card_TreasuryItem = new Item(nameItemPokemonRankA_Card_TreasuryItem, data.getCard_P1());
        itemPokemonRankB_Card_TreasuryItem = new Item(nameItemPokemonRankB_Card_TreasuryItem, data.getCard_P2());
        itemPokemonRankC_Card_TreasuryItem= new Item(nameItemPokemonRankC_Card_TreasuryItem, data.getCard_P3());
        itemPokemonRankD_Card_TreasuryItem= new Item(nameItemPokemonRankD_Card_TreasuryItem, data.getCard_P4());


    }

    public void effectPotionHP(DataUser data) {

        int potionHP = data.getPotionHP() - 1;
        int maxHP = data.getMaxHP();
        int HP = data.getHP() + data.getPower()*2;

        data.setPotionHP(potionHP);

        if(HP >= maxHP) {
            data.setHP(maxHP);
        }
        else {
            data.setHP(HP);
        }

    }

    public void effectPotionMP(DataUser data) {

        int potionMP = data.getPotionMP() - 1;
        int maxMP = data.getMaxMP();
        int MP = data.getMP() + (int)(data.getPower()*2.5);

        data.setPotionMP(potionMP);
        if(MP >= maxMP) {
            data.setMP(maxMP);
        }
        else {
            data.setMP(MP);
        }


    }

    public void effectBerry(DataUser data) {
        // UpgratePower
        int berry = data.getBerry() - 1;
        int power = (int)(data.getPower()) + (int)(rateEffectItem*2);
        data.setPower(power);
        data.setBerry(berry);


    }

    public void effectMixBerry(DataUser data) {
        //UpgratePower
        int mixBerry = data.getMixBerry() - 1;
        int power = (int)(data.getPower()) + (int)(rateEffectItem*3);
        data.setPower(power);
        data.setMixBerry(mixBerry);
    }

    public Item getItemBerry() {
        return itemBerry_TreasuryItem;

    }

    public Item getItemMixBerry() {
        return itemMixBerry_TreasuryItem;

    }

    public Item getItemPotionHP() {
        return itemPotionHP_TreasuryItem;

    }

    public Item getItemPotionMP() {
        return itemPotionMP_TreasuryItem;

    }

    public Item getItemPokemonRankA_Card() {
        return itemPokemonRankA_Card_TreasuryItem;

    }

    public Item getItemPokemonRankB_Card() {
        return itemPokemonRankB_Card_TreasuryItem;

    }

    public Item getItemPokemonRankC_Card() {
        return itemPokemonRankC_Card_TreasuryItem;

    }

    public Item getItemPokemonRankD_Card() {
        return itemPokemonRankD_Card_TreasuryItem;

    }

    public int getPokeBall() {
        return pokeBall;
    }





}
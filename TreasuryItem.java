import java.util.ArrayList;

public class TreasuryItem {
    
    private int rateEffectItem;
    private DataUser data;

    private Item item01_TreasuryItem;
    private Item item02_TreasuryItem;
    private Item item03_TreasuryItem;
    private Item item04_TreasuryItem;
    private Item item05_TreasuryItem;
    private Item item06_TreasuryItem;
    private Item item07_TreasuryItem;
    private Item item08_TreasuryItem;
    private Item item09_TreasuryItem;


    private String nameItem01_TreasuryItem;
    private String nameItem02_TreasuryItem;
    private String nameItem03_TreasuryItem;
    private String nameItem04_TreasuryItem;
    private String nameItem05_TreasuryItem;
    private String nameItem06_TreasuryItem;
    private String nameItem07_TreasuryItem;
    private String nameItem08_TreasuryItem;
    private String nameItem09_TreasuryItem;

    public TreasuryItem() {
        data = new DataUser();
        this.rateEffectItem = 20;
        this.nameItem01_TreasuryItem = "MixBerry";
        this.nameItem02_TreasuryItem = "Berry";
        this.nameItem03_TreasuryItem = "PotionHP";
        this.nameItem04_TreasuryItem = "PotionMP";
        this.nameItem05_TreasuryItem = "PokeBall";
        this.nameItem06_TreasuryItem = "PokemonRankA_Card";
        this.nameItem07_TreasuryItem = "PokemonRankB_Card";
        this.nameItem08_TreasuryItem = "PokemonRankC_Card";
        this.nameItem09_TreasuryItem = "PokemonRankD_Card";

        item01_TreasuryItem = new Item(nameItem01_TreasuryItem, data.getMixBerry());
        item02_TreasuryItem = new Item(nameItem02_TreasuryItem, data.getBerry());
        item03_TreasuryItem = new Item(nameItem03_TreasuryItem, data.getPotionHP());
        item04_TreasuryItem = new Item(nameItem04_TreasuryItem, data.getPotionMP());
        item05_TreasuryItem = new Item(nameItem05_TreasuryItem, data.getPokeBall());
        item06_TreasuryItem = new Item(nameItem06_TreasuryItem, data.getCard_P1());
        item07_TreasuryItem = new Item(nameItem07_TreasuryItem, data.getCard_P2());
        item08_TreasuryItem = new Item(nameItem08_TreasuryItem, data.getCard_P3());
        item09_TreasuryItem = new Item(nameItem09_TreasuryItem, data.getCard_P4());


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

    public Item getItem01() {
        return item01_TreasuryItem;
    }

    public Item getItem02() {
        return item02_TreasuryItem;
    }

    public Item getItem03() {
        return item03_TreasuryItem;
    }

    public Item getItem04() {
        return item04_TreasuryItem;
    }

    public Item getItem05() {
        return item05_TreasuryItem;
    }

    public Item getItem06() {
        return item06_TreasuryItem;
    }

    public Item getItem07() {
        return item07_TreasuryItem;
    }

    public Item getItem08() {
        return item08_TreasuryItem;
    }

    public Item getItem09() {
        return item09_TreasuryItem;
    }






}
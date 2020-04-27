
public class DataStart {

    private int HP_DataStart;
    private int ATK_DataStart;
    private int MP_DataStart;
    private int EXP_DataStart;
    private int level_DataStart;
    private int power_DataStart;
    private int stamina_DataStart;

    
    private int pokeBall_DataStart;
    private int mixBerry_DataStart;
    private int berry_DataStart;
    private int potionHP_DataStart;
    private int potionMP_DataStart;
    private int card_P1_DataStart;
    private int card_P2_DataStart;
    private int card_P3_DataStart;
    private int card_P4_DataStart;


    public void statusStart() {
        this.power_DataStart = (int)(((double)Math.random())*50+100);
        this.level_DataStart = 1;
        this.stamina_DataStart = 5;
        this.HP_DataStart = (int)(this.power_DataStart*0.5+500);
        this.MP_DataStart = (int)(this.power_DataStart*0.2+200);
        this.ATK_DataStart = (int)(this.power_DataStart*0.3+100);
        this.EXP_DataStart = 0;
/*
        //GUIPlace
        this.pokeBall_DataStart = 10;
        this.mixBerry_DataStart = 1;
        this.berry_DataStart = 1;
        this.potionHP_DataStart = 1;
        this.potionMP_DataStart = 1;
        this.card_P1_DataStart = 0;
        this.card_P2_DataStart = 0;
        this.card_P3_DataStart = 0;
        this.card_P4_DataStart = 0;
*/
    } 

    public void catch_it() {
        
        this.pokeBall_DataStart = 10;
        this.mixBerry_DataStart = 1;
        this.berry_DataStart = 1;
        this.potionHP_DataStart = 1;
        this.potionMP_DataStart = 1;
        this.card_P1_DataStart = 0;
        this.card_P2_DataStart = 0;
        this.card_P3_DataStart = 0;
        this.card_P4_DataStart = 0;

    }

    
    public int getHP() {
        return this.HP_DataStart ;

    }

    public int getATK() {
        return this.ATK_DataStart ;

    }

    public int getEXP() {
        return this.EXP_DataStart;

    }

    public int getpower() {
        return this.power_DataStart;

    }

    public int getMP() {
        return this.MP_DataStart;
    }

    public int getLevel() {
        return this.level_DataStart;
    }

    public int getStamina() {
        return this.stamina_DataStart;
    }
    
    public int getPokeBall() {
        return this.pokeBall_DataStart;
    }

    public int getMixBerry() {
        return this.mixBerry_DataStart;
    }

    public int getBerry() {
        return this.berry_DataStart;
    }

    public int getPotionHP() {
        return this.potionHP_DataStart;
    }

    public int getPotionMP() {
        return this.potionMP_DataStart;
    }

    public int getCard_P1() {
        return this.card_P1_DataStart;
    }

    public int getCard_P2() {
        return this.card_P2_DataStart;
    }

    public int getCard_P3() {
        return this.card_P3_DataStart;
    }

    public int getCard_P4() {
        return this.card_P4_DataStart;
    }


}
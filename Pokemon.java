import java.util.Scanner;

import javax.swing.*;


public abstract class Pokemon{
    Scanner sc = new Scanner(System.in);

    //Attribuite
    private String name;
        //w = Ways
    //private String w1;
        // hp = Health Point, mp = Mana Point
    private int power, level, stamina, HP, MP, ATK;



    //DefaultConstructure
    public Pokemon(){
        this.stamina =20;
        this.level = 1;
    }



    // Method

        //----Behevier----
            //Set

    public void setName() {
        //System.out.print("\n\n\t\t Enter Your name Pokemon Signature : ");
        this.name = sc.nextLine();
        //System.out.print("\n\n\n\n\n");

    }

    public void setStatus(int power) {

        this.HP = (int)(this.power*0.5+500);
        this.MP = (int)(this.power*0.2+200);
        this.ATK = (int)(this.power*0.3+100);

    }

            //Get
    public String getNamePokemon(){
        return name;

    }


        
/*
    public int levelUp(int level){

    }

    public int pSleep(){

        return this.stamina = maxStamina;
    }
*/

        //All Display
/*
    public void displayStatus(){
         System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                            +"\n\t\t  Your Pokemon Name is "+this.name
                            +"\n\t\t    Level : "+this.level
                            +"\n\t\t    HP : "+this.hp
                            +"\n\t\t    MP : "+this.mp
                            +"\n\t\t    Power : "+this.power
                            +"\n\t\t    Stamina : "+this.stamina
                            +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public void displayFaceGame(){
        System.out.print("\n\t ************************************************************"
                            +"\n\t\t ===== WELLCOM TO POKEMONNI GAME =====");
    }

    public String displayWayToFunction(){
        System.out.print("\n\n\t ############################################################"
                        +"\n\t\t PokeHouse:(1)"
                        +"\n\t\t Go to Forest [CoE Garden]:(2)"
                        +"\n\t\t Show Your Pokemon Status:(3)"
                        +"\n\t\t Quit Game:(E)"
                        +"\n\n\t\t your ans : ");
        this.w1 = sc.nextLine();
        System.out.print("\n\n ############################################################\n\n\n\n\n");
        return this.w1;

    }

    // SystemAnalysis

    public void quitGame(){
        System.out.print("\n\t\t------------------------------------End Game------------------------------------"
                            +"\n\n\t\t\t\t To Player : Get to Read a Book Pai!!! ");
    }
*/
    

}
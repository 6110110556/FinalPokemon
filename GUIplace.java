import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIplace extends JFrame {
/*
    public int mixBerry_GUIPlace;
    public int berry_GUIPlace;
    public int potionHP_GUIPlace;
    public int potionMP_GUIPlace;
    public int rateRandom_GUIPlace;
    public int pokeBall_GUIPlace;
    public int card_P1_GUIPlace;
    public int card_P2_GUIPlace;
    public int card_P3_GUIPlace;
    public int card_P4_GUIPlace;
*/
    private int mixBerry_GUIplace;
    private int berry_GUIplace;
    private int potionHP_GUIplace;
    private int potionMP_GUIplace;
    private int rateRandom_GUIplace;
    private int pokeBall_GUIplace;
    private int card_P1_GUIplace;
    private int card_P2_GUIplace;
    private int card_P3_GUIplace;
    private int card_P4_GUIplace;
    private DataUser data;
    private BagUser bag;



    public GUIplace(DataUser data) {
       // data = new DataUser();
        TreasuryItem item = new TreasuryItem(data);
        this.mixBerry_GUIplace = item.getItemMixBerry().getNumItem();
       // System.out.print("**********"+this.mixBerry_GUIPlace);
        this.berry_GUIplace = item.getItemBerry().getNumItem();
        this.potionHP_GUIplace = item.getItemPotionHP().getNumItem();
        this.potionMP_GUIplace = item.getItemPotionMP().getNumItem();
        this.pokeBall_GUIplace = item.getPokeBall();
        this.card_P1_GUIplace = item.getItemPokemonRankA_Card().getNumItem();
        this.card_P2_GUIplace = item.getItemPokemonRankB_Card().getNumItem();
        this.card_P3_GUIplace = item.getItemPokemonRankC_Card().getNumItem();
        this.card_P4_GUIplace = item.getItemPokemonRankD_Card().getNumItem();


        // User
       // new UserData()
        
        // input Image
        ImageIcon imgPlace1 = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIplace\\placeS.PNG");
        ImageIcon imgPlace2 = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIplace\\placeA.PNG");
        ImageIcon imgPlace3 = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIplace\\placeB.JPG");
        ImageIcon imgPlace4 = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIplace\\placeC.JPG");
        ImageIcon imgBackGround = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\GUIplace\\imgPlaceGround02.PNG");

        JPanel plate1Panel = new JPanel();
        //plate1Panel.setLayout(new GridLayout(2, 2));
        plate1Panel.setLayout(null);
        
        JLabel placeLabel_1 = new JLabel("", imgPlace1, JLabel.CENTER);
        JLabel placeLabel_2 = new JLabel("", imgPlace2, JLabel.CENTER);
        JLabel placeLabel_3 = new JLabel("", imgPlace3, JLabel.CENTER);
        JLabel placeLabel_4 = new JLabel("", imgPlace4, JLabel.CENTER);
        JLabel backGroundLabel = new JLabel("", imgBackGround, JLabel.CENTER);

        JButton catchButton_1 = new JButton("Forest");
        JButton catchButton_2 = new JButton("SeaPalce");
        JButton catchButton_3 = new JButton("Ocean");
        JButton catchButton_4 = new JButton("PokeCapital");
        JButton backButton = new JButton("Back");

        JOptionPane youGet = new JOptionPane();


        catchButton_1.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        catchButton_2.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        catchButton_3.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        catchButton_4.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));
        backButton.setFont(new Font("Cunia", Font.TRUETYPE_FONT, 16));

        catchButton_1.setBackground(new Color(219, 135, 50));
        catchButton_2.setBackground(new Color(219, 135, 50));
        catchButton_3.setBackground(new Color(219, 135, 50));
        catchButton_4.setBackground(new Color(219, 135, 50));
        backButton.setBackground(new Color(219, 135, 50));

        catchButton_1.setBounds(120, 290, 150, 40);
        catchButton_2.setBounds(650, 290, 150, 40);
        catchButton_3.setBounds(120, 610, 150, 40);
        catchButton_4.setBounds(650, 610, 150, 40);
        backButton.setBounds(830, 680, 150, 40);


        backGroundLabel.setBounds(0, 0, 1024, 768);
        backGroundLabel.setLayout(null);
        placeLabel_1.setBounds(20, 30, 400, 225);
        placeLabel_2.setBounds(540, 30, 400, 250);
        placeLabel_3.setBounds(20, 360, 400, 225);
        placeLabel_4.setBounds(540, 360, 400, 240);
        

        plate1Panel.setBackground(new Color(158, 113, 0));
        //plate1Panel.setBackground(Color.GRAY);
        plate1Panel.add(catchButton_1);
        plate1Panel.add(catchButton_2);
        plate1Panel.add(catchButton_3);
        plate1Panel.add(catchButton_4);
        plate1Panel.add(backButton);
        
        plate1Panel.add(placeLabel_1);
        plate1Panel.add(placeLabel_2);
        plate1Panel.add(placeLabel_3);
        plate1Panel.add(placeLabel_4);
        plate1Panel.add(backGroundLabel);
        add(plate1Panel);

        if(data.getPokeBall() <= 1){
            
            catchButton_1.setEnabled(false);
            catchButton_2.setEnabled(false);
            catchButton_3.setEnabled(false);
            catchButton_4.setEnabled(false);
            JOptionPane.showMessageDialog(youGet, "Your PokeBall is Empty", "You Get it!", JOptionPane.INFORMATION_MESSAGE);
            new GUImenu(data);

        }
        

        catchButton_1.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent catch_it ) {
                
                if(data.getPokeBall() <= 1){
            
                    catchButton_1.setEnabled(false);
                    catchButton_2.setEnabled(false);
                    catchButton_3.setEnabled(false);
                    catchButton_4.setEnabled(false);
                    JOptionPane.showMessageDialog(youGet, "Your PokeBall is Empty", "You Get it!", JOptionPane.INFORMATION_MESSAGE);
                    new GUImenu(data);
        
                }

                pokeBall_GUIplace -= 1;
                data.setPokeBall(pokeBall_GUIplace);
                rateRandom_GUIplace = (int)(((double)Math.random())*100);
                
                if(rateRandom_GUIplace <= 40) {
                    potionHP_GUIplace += 1;
                    data.setPotionHP(potionHP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 60) {
                    potionMP_GUIplace += 1;
                    data.setPotionMP(potionMP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 80) {
                    berry_GUIplace += 1;
                    data.setBerry(berry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 90) {
                    mixBerry_GUIplace += 1;
                    data.setMixBerry(mixBerry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 100) {
                    card_P1_GUIplace += 1;
                    data.setCard_P1(card_P1_GUIplace);

                }

                JOptionPane.showMessageDialog(youGet, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Pokeball "+data.getPokeBall()
                +"\n    Berry : "+data.getBerry()
                +"\n    MixBerry : "+data.getMixBerry()
                +"\n    PokemonS_Card : "+data.getCard_P1()
                +"\n    PokemonA_Card : "+data.getCard_P2()
                +"\n    PokemonB_Card : "+data.getCard_P3()
                +"\n    PokemonC_Card : "+data.getCard_P4()
                +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You Get it!", JOptionPane.INFORMATION_MESSAGE);

               // JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
                //new GUIuserReceive(data);
/*
                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+data.getPokeBall()
                +"\n\t\t    Berry : "+data.getBerry()
                +"\n\t\t    MixBerry : "+data.getMixBerry()
                +"\n\t\t    PokemonS_Card : "+data.getCard_P1()
                +"\n\t\t    PokemonA_Card : "+data.getCard_P2()
                +"\n\t\t    PokemonB_Card : "+data.getCard_P3()
                +"\n\t\t    PokemonC_Card : "+data.getCard_P4()
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

         */

            }
        });

        catchButton_2.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent catch_it ) {
                
                if(data.getPokeBall() <= 1){
            
                    catchButton_1.setEnabled(false);
                    catchButton_2.setEnabled(false);
                    catchButton_3.setEnabled(false);
                    catchButton_4.setEnabled(false);
                    JOptionPane.showMessageDialog(youGet, "Your PokeBall is Empty", "You Get it!", JOptionPane.INFORMATION_MESSAGE);
                    new GUImenu(data);
        
                }

                pokeBall_GUIplace -= 1;
                data.setPokeBall(pokeBall_GUIplace);
                rateRandom_GUIplace = (int)(((double)Math.random())*100);
                
                if(rateRandom_GUIplace <= 40) {
                    potionHP_GUIplace += 1;
                    data.setPotionHP(potionHP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 60) {
                    potionMP_GUIplace += 1;
                    data.setPotionMP(potionMP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 80) {
                    berry_GUIplace += 1;
                    data.setBerry(berry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 90) {
                    mixBerry_GUIplace += 1;
                    data.setMixBerry(mixBerry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 100) {
                    card_P1_GUIplace += 1;
                    data.setCard_P2(card_P2_GUIplace);

                }
/*
                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+data.getPokeBall()
                +"\n\t\t    Berry : "+data.getBerry()
                +"\n\t\t    MixBerry : "+data.getMixBerry()
                +"\n\t\t    PokemonS_Card : "+data.getCard_P1()
                +"\n\t\t    PokemonA_Card : "+data.getCard_P2()
                +"\n\t\t    PokemonB_Card : "+data.getCard_P3()
                +"\n\t\t    PokemonC_Card : "+data.getCard_P4()
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
                
*/              //new GUIuserReceive(data);
                JOptionPane.showMessageDialog(youGet, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Pokeball "+data.getPokeBall()
                +"\n    Berry : "+data.getBerry()
                +"\n    MixBerry : "+data.getMixBerry()
                +"\n    PokemonS_Card : "+data.getCard_P1()
                +"\n    PokemonA_Card : "+data.getCard_P2()
                +"\n    PokemonB_Card : "+data.getCard_P3()
                +"\n    PokemonC_Card : "+data.getCard_P4()
                +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You Get it!", JOptionPane.INFORMATION_MESSAGE);


            }
        });

        catchButton_3.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent catch_it ) {
                
                if(data.getPokeBall() <= 1){
            
                    catchButton_1.setEnabled(false);
                    catchButton_2.setEnabled(false);
                    catchButton_3.setEnabled(false);
                    catchButton_4.setEnabled(false);
                    JOptionPane.showMessageDialog(youGet, "Your PokeBall is Empty", "You Get it!", JOptionPane.INFORMATION_MESSAGE);
                    new GUImenu(data);
        
                }

                pokeBall_GUIplace -= 1;
                data.setPokeBall(pokeBall_GUIplace);
                rateRandom_GUIplace = (int)(((double)Math.random())*100);
                
                if(rateRandom_GUIplace <= 40) {
                    potionHP_GUIplace += 1;
                    data.setPotionHP(potionHP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 60) {
                    potionMP_GUIplace += 1;
                    data.setPotionMP(potionMP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 80) {
                    berry_GUIplace += 1;
                    data.setBerry(berry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 90) {
                    mixBerry_GUIplace += 1;
                    data.setMixBerry(mixBerry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 100) {
                    card_P1_GUIplace += 1;
                    data.setCard_P1(card_P3_GUIplace);

                }
/*
                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+data.getPokeBall()
                +"\n\t\t    Berry : "+data.getBerry()
                +"\n\t\t    MixBerry : "+data.getMixBerry()
                +"\n\t\t    PokemonS_Card : "+data.getCard_P1()
                +"\n\t\t    PokemonA_Card : "+data.getCard_P2()
                +"\n\t\t    PokemonB_Card : "+data.getCard_P3()
                +"\n\t\t    PokemonC_Card : "+data.getCard_P4()
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");*/
                //new GUIuserReceive(data);
                JOptionPane.showMessageDialog(youGet, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Pokeball "+data.getPokeBall()
                +"\n    Berry : "+data.getBerry()
                +"\n    MixBerry : "+data.getMixBerry()
                +"\n    PokemonS_Card : "+data.getCard_P1()
                +"\n    PokemonA_Card : "+data.getCard_P2()
                +"\n    PokemonB_Card : "+data.getCard_P3()
                +"\n    PokemonC_Card : "+data.getCard_P4()
                +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You Get it!", JOptionPane.INFORMATION_MESSAGE);

         

            }
        });

        catchButton_4.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent catch_it ) {
                
                if(data.getPokeBall() <= 1){
            
                catchButton_1.setEnabled(false);
                catchButton_2.setEnabled(false);
                catchButton_3.setEnabled(false);
                catchButton_4.setEnabled(false);
                JOptionPane.showMessageDialog(youGet, "Your PokeBall is Empty", "You Get it!", JOptionPane.INFORMATION_MESSAGE);
                new GUImenu(data);

                }

                pokeBall_GUIplace -= 1;
                data.setPokeBall(pokeBall_GUIplace);
                rateRandom_GUIplace = (int)(((double)Math.random())*100);
                
                if(rateRandom_GUIplace <= 40) {
                    potionHP_GUIplace += 1;
                    data.setPotionHP(potionHP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 60) {
                    potionMP_GUIplace += 1;
                    data.setPotionMP(potionMP_GUIplace);

                }
                else if(rateRandom_GUIplace <= 80) {
                    berry_GUIplace += 1;
                    data.setBerry(berry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 90) {
                    mixBerry_GUIplace += 1;
                    data.setMixBerry(mixBerry_GUIplace);

                }
                else if(rateRandom_GUIplace <= 100) {
                    card_P1_GUIplace += 1;
                    data.setCard_P1(card_P4_GUIplace);

                }
/*
                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+data.getPokeBall()
                +"\n\t\t    Berry : "+data.getBerry()
                +"\n\t\t    MixBerry : "+data.getMixBerry()
                +"\n\t\t    PokemonS_Card : "+data.getCard_P1()
                +"\n\t\t    PokemonA_Card : "+data.getCard_P2()
                +"\n\t\t    PokemonB_Card : "+data.getCard_P3()
                +"\n\t\t    PokemonC_Card : "+data.getCard_P4()
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
*/
                //new GUIuserReceive(data);
                JOptionPane.showMessageDialog(youGet, "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n    Pokeball "+data.getPokeBall()
                +"\n    Berry : "+data.getBerry()
                +"\n    MixBerry : "+data.getMixBerry()
                +"\n    PokemonS_Card : "+data.getCard_P1()
                +"\n    PokemonA_Card : "+data.getCard_P2()
                +"\n    PokemonB_Card : "+data.getCard_P3()
                +"\n    PokemonC_Card : "+data.getCard_P4()
                +"\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n", "You Get it!", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        backButton.addActionListener((ActionEvent e) -> {
            dispose();
            new GUImenu(data);
        });

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }


}
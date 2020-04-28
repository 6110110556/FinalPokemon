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


    public GUIplace() {
        DataUser data = new DataUser();
        this.mixBerry_GUIplace = data.getMixBerry();
       // System.out.print("**********"+this.mixBerry_GUIPlace);
        this.berry_GUIplace = data.getBerry();
        this.potionHP_GUIplace = data.getPotionHP();
        this.potionMP_GUIplace = data.getPotionMP();
        this.pokeBall_GUIplace = data.getPokeBall();
        this.card_P1_GUIplace = data.getCard_P1();
        this.card_P2_GUIplace = data.getCard_P2();
        this.card_P3_GUIplace = data.getCard_P3();
        this.card_P4_GUIplace = data.getCard_P4();

        // User
       // new UserData()
        
        // input Image
        ImageIcon imgPlace1 = new ImageIcon("C:\\Users\\User\\Desktop\\Y2\\Term2\\FinalPokemon\\Pokemon\\Picture\\MainImg\\test_1.JPG");

        JPanel plate1Panel = new JPanel();
        plate1Panel.setLayout(new GridLayout(2, 2));
        
        JLabel placeLabel_1 = new JLabel("", imgPlace1, JLabel.CENTER);
        JLabel placeLabel_2 = new JLabel("", imgPlace1, JLabel.CENTER);
        JLabel placeLabel_3 = new JLabel("", imgPlace1, JLabel.CENTER);
        JLabel placeLabel_4 = new JLabel("", imgPlace1, JLabel.CENTER);


        JButton catchButton_1 = new JButton("NamePlace1");
        JButton catchButton_2 = new JButton("NamePlace2");
        JButton catchButton_3 = new JButton("NamePlace3");
        JButton catchButton_4 = new JButton("NamePlace4");
        catchButton_1.setSize(100, 50);

        if(pokeBall_GUIplace <= 1){
            catchButton_1.setEnabled(false);
        }

       
        placeLabel_1.add(catchButton_1, JButton.CENTER);
        placeLabel_2.add(catchButton_2, JButton.CENTER);
        placeLabel_3.add(catchButton_3, JButton.CENTER);
        placeLabel_4.add(catchButton_4, JButton.CENTER);

        
        plate1Panel.add(placeLabel_1);
        plate1Panel.add(placeLabel_2);
        plate1Panel.add(placeLabel_3);
        plate1Panel.add(placeLabel_4);

        add(plate1Panel);

        catchButton_1.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent catch_it ) {
                
                if(pokeBall_GUIplace <= 1){
                    catchButton_1.setEnabled(false);
                }

                pokeBall_GUIplace -= 1;
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

/*
                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+pokeBall_GUIPlace
                +"\n\t\t    Berry : "+berry_GUIPlace
                +"\n\t\t    MixBerry : "+mixBerry_GUIPlace
                +"\n\t\t    Card_P1 : "+card_P1_GUIPlace
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");*/

         

            }
        });

        setBounds(200, 20, 1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }


}
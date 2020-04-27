import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIPlace extends JFrame {
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
    private int mixBerry_GUIPlace;
    private int berry_GUIPlace;
    private int potionHP_GUIPlace;
    private int potionMP_GUIPlace;
    private int rateRandom_GUIPlace;
    private int pokeBall_GUIPlace;
    private int card_P1_GUIPlace;
    private int card_P2_GUIPlace;
    private int card_P3_GUIPlace;
    private int card_P4_GUIPlace;


    public GUIPlace() {
        DataStart data = new DataStart();
        data.catch_it();
        this.mixBerry_GUIPlace = data.getMixBerry();
       // System.out.print("**********"+this.mixBerry_GUIPlace);
        this.berry_GUIPlace = data.getBerry();
        this.potionHP_GUIPlace = data.getPotionHP();
        this.potionMP_GUIPlace = data.getPotionMP();
        this.pokeBall_GUIPlace = data.getPokeBall();
        this.card_P1_GUIPlace = data.getCard_P1();
        this.card_P2_GUIPlace = data.getCard_P2();
        this.card_P3_GUIPlace = data.getCard_P3();
        this.card_P4_GUIPlace = data.getCard_P4();
        
        // input Image
        ImageIcon imgPlace1 = new ImageIcon("C:\\Users\\User\\Desktop\\ปี2\\เทอม 2\\FinalPokemon\\Pokemon\\Picture\\MainImg\\test_1.JPG");

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
                
                if(pokeBall_GUIPlace <= 1){
                    catchButton_1.setEnabled(false);
                }

                pokeBall_GUIPlace -= 1;
                rateRandom_GUIPlace = (int)(((double)Math.random())*100);
                
                if(rateRandom_GUIPlace <= 40) {
                    potionHP_GUIPlace += 1;

                }
                else if(rateRandom_GUIPlace <= 60) {
                    potionMP_GUIPlace += 1;

                }
                else if(rateRandom_GUIPlace <= 70) {
                    mixBerry_GUIPlace += 1;

                }
                else if(rateRandom_GUIPlace <= 90) {
                    berry_GUIPlace += 1;
                }
                else if(rateRandom_GUIPlace <= 100) {
                    card_P1_GUIPlace += 1;
                }

                System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                +"\n\t\t  Pokeball "+pokeBall_GUIPlace
                +"\n\t\t    Berry : "+berry_GUIPlace
                +"\n\t\t    MixBerry : "+mixBerry_GUIPlace
                +"\n\t\t    Card_P1 : "+card_P1_GUIPlace
                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
         

            }
        });

        setSize(1024, 768);
        setResizable(false);
        setVisible(true);

    }


}
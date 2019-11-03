import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Main {
    private JTextField JTF1;
    private JTextField JTF2;
    private JTextField JTF3;

    public static void main(String[] args) {
        // Creating an object with buttons added as binary sequences to a class variable of type int
        testingBits tB = new testingBits();
        tB.setAvailable(3, true);
        tB.setAvailable(5, true);
        tB.setAvailable(1, true);
        tB.setAvailable(2, true);

        // Given the class variable value generated above, get available buttons
        tB.getAvailable();

        int[] testlist = new int[]{
                1,
                2,
                3
        };
        for (int value : testlist) {
            System.out.println(value);
        }
        int iq = 17;
        String intelligenceLevel = iq > 140 ? "Smart" : "Stupid";
        System.out.println(intelligenceLevel);

        int mat[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int[] r : mat){
            for (int c : r){
                System.out.print(c + " ");
            }
            System.out.println(' ');
        }
        JFrame JF = new JFrame("The title bar");
        JF.setLayout(new FlowLayout());
        JLabel JL = new JLabel("Where is this?");
        JL.setToolTipText("Still nuthing?");
        JTextField JTF1 = new JTextField("First column", 10);
        JTextField JTF2 = new JTextField("Second column", 10);
        JTextField JTF3 = new JTextField("Third column", 20);
        JPasswordField JPF = new JPasswordField("Password");
        MyHandler MH = new MyHandler();
        JTF1.addActionListener(MH);
        JTF2.addActionListener(MH);
        JTF3.addActionListener(MH);

        JF.add(JTF1);
        JF.add(JTF2);
        JF.add(JTF3);
        JF.add(JPF);
        JF.add(JL);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setSize(275, 180);
        JF.setVisible(true);

    }
    private class MyHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            String string = "";
            /*
            if (event.getSource() == JTF1)
                string = String.format("field 1: %s", event.getActionCommand());
            else if(event.getSource() == JTF2)
                string = String.format("field 2: %s", event.getActionCommand());
            else if(event.getSource() == JTF3)
                string = String.format("field 3: %s", event.getActionCommand());

             */
        }
    }
}
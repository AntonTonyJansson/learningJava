import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class testingGUI extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public testingGUI() {
        // PHYSICAL CONTENT
        super("The title");
        setLayout(new FlowLayout());
        textField1 = new JTextField("text one");
        add(textField1);
        textField2 = new JTextField("text two");
        add(textField2);
        textField3 = new JTextField("text three");
        textField3.setEditable(false);
        add(textField3);
        passwordField = new JPasswordField("password");
        add(passwordField);

        // LOGICAL CONTENT
        ActionHandler actionHandler1 = new ActionHandler();
        textField1.addActionListener(actionHandler1);
        textField2.addActionListener(actionHandler1);
        textField3.addActionListener(actionHandler1);
        passwordField.addActionListener(actionHandler1);

        // WINDOW SETTINGS
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 100);
        setVisible(true);

    }
    private class ActionHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            String string = "";
                if (event.getSource() == textField1)
                    string = String.format("field 1: %s", event.getActionCommand());
                else if(event.getSource() == textField2)
                    string = String.format("field 2: %s", event.getActionCommand());
                else if(event.getSource() == textField3)
                    string = String.format("field 3: %s", event.getActionCommand());

                JOptionPane.showMessageDialog(null, string);
        }
    }
}

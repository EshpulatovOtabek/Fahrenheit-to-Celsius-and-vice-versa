import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Convert extends JFrame implements ActionListener {

    JPanel panell = new JPanel();
    static JLabel result = new JLabel();
    double input;
    String stringInput = "";
    JButton button;
    JTextField textField;
    JLabel label1;
    JRadioButton F;
    JRadioButton C;


    Convert() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Converter");
        this.setLayout(null);
        this.setSize(400, 400);
        this.setResizable(false);

        F = new JRadioButton("Fahrenheit -> Celsius");
        F.setFont(new Font("Consolas", Font.BOLD, 12));
        C = new JRadioButton("Celsius -> Fahrenheit ");
        C.setFont(new Font("Consolas", Font.BOLD, 12));

        F.setFocusable(false);
        F.setBounds(20, 0, 170, 30);
        C.setFocusable(false);
        C.setBounds(20, 25, 170, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(F);
        group.add(C);

        textField = new JTextField(" ");
        textField.setBounds(220, 105, 150, 30);
        textField.setFont(new Font("Consolas", Font.BOLD, 20));
        textField.addActionListener(this);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(20, 100, 225, 40);
        label.setFont(new Font("Consolas", Font.BOLD, 23));

        button = new JButton("Convert");
        button.setFont(new Font("Consolas", Font.BOLD, 20));
        button.setLayout(new BorderLayout(0, 30));
        button.setBounds(120, 170, 150, 35);
        button.setFocusable(false);
        button.addActionListener(this);

        label1 = new JLabel("Result: ");
        label1.setBounds(20, 250, 120, 30);
        label1.setFont(new Font("Consolas", Font.BOLD, 15));

        panell.setBounds(150,250, 150,40);
        panell.add(result);

        this.add(F);
        this.add(C);
        this.add(label);
        this.add(textField);
        this.add(button);
        this.add(label1);

        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        stringInput = textField.getText();
        input = Double.parseDouble(stringInput);

        if (F.isSelected() && (!stringInput.equals(""))) {

try {

    input = (Double.parseDouble(stringInput) - 32) / 1.8;

    result.setText("" + input);
    result.setFont(new Font("Consolas", Font.BOLD, 15));
    result.setBounds(150, 250, 250, 30);
    panell.add(result);
    this.add(panell);

    System.out.println(input); }

catch (Exception exception) {

   exception.fillInStackTrace();

}

        } else if(C.isSelected() && (!stringInput.equals(""))){
            try {

                input = (Double.parseDouble(stringInput) * 1.8) + 32;

                result.setText("" + input);
                result.setFont(new Font("Consolas", Font.BOLD,  15));
                result.setBounds(150, 250, 250, 30);
                panell.add(result);

                this.add(panell); }

            catch (Exception exception){
                exception.fillInStackTrace();
            }

            System.out.println(input);

        }
    }
}



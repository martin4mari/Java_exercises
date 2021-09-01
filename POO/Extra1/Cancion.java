/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes
 */
package Extra1;

import java.awt.HeadlessException;
import javax.swing.*;
import java.awt.event.*;

public class Cancion extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;

    public Cancion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Mensaje :");
        label1.setBounds(15, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);

        boton1 = new JButton("Ok");
        boton1.setBounds(10,60,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {

            String cadena = textField1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public static void main(String[] args) {
        Cancion c = new Cancion();
        c.setBounds(0, 0, 300, 150);
        c.setVisible(true);
        c.setLocationRelativeTo(null);

    }

}

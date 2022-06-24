package Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class AccionBoton implements ActionListener, ItemListener {

    JButton enviarB;

    JComboBox comboB;

    JTextField nombreB;
    JTextField apellidoPB;
    JTextField apellidoMB;

    JLabel resultadonombreB;
    JLabel resultadoMayorB;
    JLabel resultadoEdad;

    public AccionBoton(JTextField nombre, JTextField apellidoP, JTextField apellidoM, JComboBox combo1, JButton enviar, JLabel resultadonombre, JLabel resultadoMayor, JLabel resultadoEdad) {

        this.nombreB = nombre;
        this.apellidoPB = apellidoP;
        this.apellidoMB= apellidoM;

        this.resultadonombreB = resultadonombre;
        this.resultadoMayorB = resultadoMayor;
        this.resultadoEdad = resultadoEdad;

        this.enviarB = enviar;
        this.comboB = combo1;

        enviarB.addActionListener(this);
        comboB.addItemListener(this);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboB){
            Object edad = comboB.getSelectedItem();
            int i = (int) edad;
            int total = 2022 - i;

            if (total >= 18){
                resultadoMayorB.setText("Tu edad es de: "+total+" y eres mayor de edad");
                resultadoEdad.setText("Tu edad es de: "+total+" años");
            }
            else {
                resultadoMayorB.setText("Tu edad es de: "+total+" y eres menor de edad");
                resultadoEdad.setText("Tu edad es de: "+total+" años");
            }



        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == enviarB ){
            resultadonombreB.setText("Tu Nombre completo es: "+nombreB.getText()+" "+apellidoPB.getText()+
                    " "+apellidoMB.getText());
            resultadonombreB.setVisible(true);
            resultadoMayorB.setVisible(true);
            resultadoEdad.setVisible(true);



         }
    }
}

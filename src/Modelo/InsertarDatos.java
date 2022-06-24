package Modelo;

import javax.swing.*;

public class InsertarDatos {


    public JComboBox InsertarCombo(JComboBox combo) {

        for (int i = 1985; i <2022 ; i++) {

            combo.addItem(i);

        }


        return combo;
    }
}

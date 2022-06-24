package Vista;

import javax.swing.*;

public class Ventana extends JFrame {

    //Constructor
    public Ventana(){
        this.setSize(500,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Calcular Operacion");
        this.setVisible(true);

        colocarPanel();
    }

    //Colocamos en el panel
    public void colocarPanel(){
        Panel instancia = new Panel();

        this.setContentPane(instancia);
    }



}

package Vista;



import Controlador.AccionBoton;
import Modelo.InsertarDatos;

import javax.swing.*;

public class Panel extends JPanel {

    //Componentes

    JButton enviar;

    JComboBox combo1;

    JTextField nombre;
    JTextField apellidoP;
    JTextField apellidoM;

    JLabel etiquetaNombre;
    JLabel etiquetaApellidoP;
    JLabel etiquetaApellidoM;

    JLabel ingresa;
    JLabel resultadonombre;
    JLabel resultadoMayor;
    JLabel resultadoEdad;

    //Constructor
    public Panel(){
        this.setLayout(null);

        //Creamos metodos
        crearEtiqueta();
        crearCombo();
        crearBoton();

    }

    private void crearEtiqueta() {

        nombre = new JTextField();
        apellidoP = new JTextField();
        apellidoM = new JTextField();

        ingresa= new JLabel();
        resultadonombre = new JLabel();
        resultadoMayor = new JLabel();
        resultadoEdad = new JLabel();


        etiquetaNombre = new JLabel("Nombre");
        etiquetaApellidoP = new JLabel("ApellidoP");
        etiquetaApellidoM = new JLabel("ApellidoM");
        ingresa = new JLabel("Año de nacimineto");

        etiquetaNombre.setBounds(90,60,90,20);
        etiquetaApellidoP.setBounds(90,100,90,20);
        etiquetaApellidoM.setBounds(90,140,90,20);
        ingresa.setBounds(90,180,140,20);

        resultadonombre.setBounds(90,350,400,30);
        resultadoMayor.setBounds(90,400,400,30);
        resultadoEdad.setBounds(90,450,200,30);
        resultadonombre.setVisible(false);
        resultadoMayor.setVisible(false);
        resultadoEdad.setVisible(false);

        nombre.setBounds(150,60,150,30);
        apellidoP.setBounds(150,100,150,30);
        apellidoM.setBounds(150,140,150,30);


        this.add(etiquetaNombre);
        this.add(etiquetaApellidoP);
        this.add(etiquetaApellidoM);

        this.add(resultadonombre);
        this.add(resultadoMayor);
        this.add(resultadoEdad);

        this.add(nombre);
        this.add(apellidoP);
        this.add(apellidoM);


    }
    private void crearCombo(){
         combo1 = new JComboBox();

         combo1.setBounds(150,180,140,20);

         combo1 = new InsertarDatos().InsertarCombo(combo1);


         this.add(combo1);


    }
    private void crearBoton(){

        enviar = new JButton("Enviar");


        enviar.setBounds(150,230,130,30);


        this.add(enviar);

        AccionBoton instancai = new AccionBoton(nombre,apellidoP,apellidoM,combo1,enviar,resultadonombre,resultadoMayor,resultadoEdad);


    }
}

package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //---------------
    // Atributos
    // --------------
    public JButton btTenico;
    public JButton btJugador;
    public JButton btInformacion;
    public JButton btSalir;

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelOperaciones()
    {
        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.green);

        //crear y agregar boton hallar
        btTenico = new JButton("Tecnico");
        btTenico.setBounds(30,40,120,30);
        this.add(btTenico);
        btTenico.setActionCommand("tecnico");
        btTenico.setEnabled(false);

        // crear y agregar boton borrar
        btJugador = new JButton("Jugador");
        btJugador.setBounds(180,40,100,30);
        this.add(btJugador);
        btJugador.setActionCommand("jugador");
        btJugador.setEnabled(false);

        btInformacion = new JButton("Informacion");
        btInformacion.setBounds(300,40,130,30);
        this.add(btInformacion);
        btInformacion.setActionCommand("informacion");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(460,40,100,30);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);
    }

    public void activarBotones()
    {
        btTenico.setEnabled(true);
        btJugador.setEnabled(true);
    }
}
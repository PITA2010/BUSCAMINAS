
package buscaminaspita;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Boton extends JButton implements ActionListener {
    public Boton (int posx ,int posy,int ancho,int alto ){
        setBounds(posx,posy,ancho,alto);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        setBackground(Color.orange);
        
    }
}

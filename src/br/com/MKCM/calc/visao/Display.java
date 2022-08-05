package br.com.MKCM.calc.visao;

import br.com.MKCM.calc.modelo.Memoria;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private final JLabel label;

    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("couruer", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

        add(label);
    }

}

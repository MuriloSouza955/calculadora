package br.com.MKCM.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Teclado extends JPanel {

    public Teclado() {
        setLayout(new GridLayout(5, 4));

        Color COR_CINZA_ESCURO = new Color(68, 68, 68);
        Color COR_LARANJA = new Color(242, 163, 60);
        Color COR_CINZA_CLARO = new Color(99, 99, 99);

        add(new Botao("AC", COR_CINZA_ESCURO));
        add(new Botao("+/-", COR_CINZA_ESCURO));
        add(new Botao("%", COR_CINZA_ESCURO));
        add(new Botao("/", COR_LARANJA));

        add(new Botao("7", COR_CINZA_CLARO));
        add(new Botao("8", COR_CINZA_CLARO));
        add(new Botao("9", COR_CINZA_CLARO));
        add(new Botao("*", COR_LARANJA));

        add(new Botao("7", COR_CINZA_CLARO));
        add(new Botao("8", COR_CINZA_CLARO));
        add(new Botao("9", COR_CINZA_CLARO));
        add(new Botao("*", COR_LARANJA));

        add(new Botao("7", COR_CINZA_CLARO));
        add(new Botao("8", COR_CINZA_CLARO));
        add(new Botao("9", COR_CINZA_CLARO));
        add(new Botao("*", COR_LARANJA));
    }
}

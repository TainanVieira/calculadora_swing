import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcula {
    private JPanel panelmain;
    private JTextField resultado;
    private JButton btn02;
    private JButton btn01;
    private JButton btn04;
    private JButton Limpar;
    private JButton btn07;
    private JButton btn05;
    private JButton btn08;
    private JButton btn0;
    private JButton btn03;
    private JButton btn06;
    private JButton btn09;
    private JButton btnigual;
    private JButton btnsomar;
    private JButton btnsubtrair;
    private JButton btnmultiplicar;
    private JButton btndividir;


    private String operação;
    private int primeiroValor;
    private int segundoValor;


    public calcula() {
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText() + "1");

            }
        });
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText() + "2");

            }
        });
        btn03.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "3");
            }
        });
        btn04.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "4");
            }
        });
        btn05.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "5");
            }
        });
        btn06.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "6");
            }
        });
        btn07.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "7");
            }
        });
        btn08.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "8");
            }
        });
        btn09.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "9");
            }
        });
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText(resultado.getText() + "0");
            }
        });

        btnsomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroValor = Integer.parseInt(resultado.getText());
                operação = "+";
                resultado.setText("");
            }
        });
        btnsubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroValor = Integer.parseInt(resultado.getText());
                operação = "-";
                resultado.setText("");
            }
        });
        btnmultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroValor = Integer.parseInt(resultado.getText());
                operação = "*";
                resultado.setText("");
            }
        });
        btndividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroValor = Integer.parseInt(resultado.getText());
                operação = "/";
                resultado.setText("");
            }
        });

        btnigual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundoValor = Integer.parseInt(resultado.getText());

                if (operação.equals("+")) {
                    resultado.setText(String.valueOf(primeiroValor + segundoValor));

                } else if (operação.equals("-")) {
                    resultado.setText(String.valueOf(primeiroValor - segundoValor));
                } else if (operação.equals("*")) {
                    resultado.setText(String.valueOf(primeiroValor * segundoValor));
                } else if (operação.equals("/")) {
                    resultado.setText(String.valueOf(primeiroValor / segundoValor));
                }
            }

        });
        Limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("");
                primeiroValor = 0;
                segundoValor = 0;
                operação = "";
            }
        });

    }
        public static void main (String[]args){
            JFrame frame = new JFrame("Minha Calculadora");
            frame.setContentPane(new calcula().panelmain);
            frame.setSize(400, 400);
            frame.setVisible(true);
        }

}
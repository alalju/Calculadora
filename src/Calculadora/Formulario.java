package Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    Operaciones op=new Operaciones();

    private JPanel contenedor;
    private JPanel pantalla;
    private JPanel botones;
    private JLabel operaciones;
    private JLabel valores;


    //Botones de numeros 1-9
    private JButton b7;
    private JButton b4;
    private JButton b1;
    private JButton b8;
    private JButton b5;
    private JButton b2;
    private JButton b0;
    private JButton b9;
    private JButton b3;
    private JButton b6;
    private JButton bPunto;

    //limpir o borrar en consola
    private JButton bLimpiar;


    //Operadores
    private JButton bDivision;
    private JButton bSuma;
    private JButton bResta;
    private JButton bMult;
    private JButton bIgual;

    //Variables donde se almacenaran los operandos
    private String num1=null,num2=null;

    //variable donde se guarda el resultdo de las operaciones
    private String resultado,valor,cadena;
    private int opc=0;//Guarda la operacion que se realizara

    public Formulario(){
        ActionListener listenervalores = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(valores.getText()=="Error"){
                    valores.setText("");
                }
                String num1= valores.getText()+ ((JButton)e.getSource()).getText();;
                valores.setText(num1);
            }
        };
        b0.addActionListener(listenervalores);
        b1.addActionListener(listenervalores);
        b2.addActionListener(listenervalores);
        b3.addActionListener(listenervalores);
        b4.addActionListener(listenervalores);
        b5.addActionListener(listenervalores);
        b6.addActionListener(listenervalores);
        b7.addActionListener(listenervalores);
        b8.addActionListener(listenervalores);
        b9.addActionListener(listenervalores);
        bPunto.addActionListener(listenervalores);
        bSuma.addActionListener(listenervalores);
        bResta.addActionListener(listenervalores);
        bDivision.addActionListener(listenervalores);
        bMult.addActionListener(listenervalores);
        //Listener que mostrar los numeros a operar
        ActionListener listenerOperaciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operaciones.getText()=="Error"){
                    operaciones.setText("");
                }
                String num1= operaciones.getText()+ ((JButton)e.getSource()).getText();;
                operaciones.setText(num1);
            }
        };
        //Solo mostara los numero
        b0.addActionListener(listenerOperaciones);
        b1.addActionListener(listenerOperaciones);
        b2.addActionListener(listenerOperaciones);
        b3.addActionListener(listenerOperaciones);
        b4.addActionListener(listenerOperaciones);
        b5.addActionListener(listenerOperaciones);
        b6.addActionListener(listenerOperaciones);
        b7.addActionListener(listenerOperaciones);
        b8.addActionListener(listenerOperaciones);
        b9.addActionListener(listenerOperaciones);
        bPunto.addActionListener(listenerOperaciones);

        //



        bLimpiar.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1="";
                num2="";
                operaciones.setText("");
                valores.setText(" ");

            }
        });

        bSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= operaciones.getText();
                operaciones.setText("");
                opc=1;

            }
        });
        bResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    num1= operaciones.getText();
                    operaciones.setText("");
                    opc=2;


            }
        });
        bMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= operaciones.getText();
                operaciones.setText("");
                opc=3;

            }
        });
        bDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1= operaciones.getText();
                operaciones.setText("");
                opc=4;


            }
        });
        bIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opc!=0){
                    num2= operaciones.getText();
                    if (!num2.isEmpty() && num1.isEmpty()){
                        num1="0.0";
                        String resultado=op.determinar(num1,num2,opc);
                        operaciones.setText(String.valueOf(resultado));

                    }else if(num2.isEmpty() && !num1.isEmpty()){
                        num2="0.0";
                        String resultado=op.determinar(num1,num2,opc);
                        operaciones.setText(String.valueOf(resultado));

                    }else if(!num1.isEmpty() && !num2.isEmpty()) {
                        String resultado = op.determinar(num1, num2, opc);
                        operaciones.setText(String.valueOf(resultado));

                    } else{
                        operaciones.setText("Error");
                        num1="";
                        num2="";
                    }
                    opc=0;
                }else {
                    String resultado = op.determinar(num1);
                }
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setContentPane(new Formulario().contenedor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

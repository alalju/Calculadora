package Calculadora;

public class Operaciones {
    private float numero1;
    private float numero2;
    private String resultado;


    public Operaciones(){

    }

    public String determinar(String num1,String num2, int opc){
        numero1=Float.parseFloat(num1);
        numero2=Float.parseFloat(num2);

        switch (opc){
            case 1:
                resultado=Suma.sumar(numero1,numero2);
                break;
            case 2:
                resultado=Resta.restar(numero1,numero2);
                break;
            case 3:
                resultado=Multiplicacion.multiplicar(numero1,numero2);
                break;
            case 4:
                resultado=Division.dividir(numero1,numero2);
                break;
            default:
                break;
        }
        return resultado;
    }
    public String determinar(String num1){
        return resultado=num1;
    }


}

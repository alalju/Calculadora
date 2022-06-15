package Calculadora;

public class Suma {
    private String resultado;
    private static float res;

    public static String sumar(float n1, float n2){
        res=(n1+n2);
        return  String.valueOf(res);
    }


}
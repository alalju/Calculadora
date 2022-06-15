package Calculadora;

public class Resta {
    private  String resultado;
    private static float res;

    public Resta(){

    }
    public static String restar(float n1, float n2){
        res=(n1-n2);
        return  String.valueOf(res);
    }


}

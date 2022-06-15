package Calculadora;

public class Division {
    private static float res;
    private static String resultado;

    public static String dividir(float n1,float n2){
        if(n2 != 0.0){
            res=(n1/n2);
        }else{
            return  resultado="Error";
        }
        return  String.valueOf(res);
    }

}

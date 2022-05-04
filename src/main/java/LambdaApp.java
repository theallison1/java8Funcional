import java.util.*;

public class LambdaApp {

    public void ordenar(){
        List<String> lista = new ArrayList<String>();
        lista.add("mito");
        lista.add("code");
        lista.add("mitocode");

        Collections.sort(lista,(String x, String y)-> x.compareTo(y));
        for (String elemento : lista){
            System.out.println(elemento);
        }
    }
    public void calcularPromedio(double a,double b){
        Operacion operacion=(double n1,double n2)->(n1+n2)/2;
        System.out.println( operacion.calcularPromedio(a,b));


    }





    public static void main(String[] args) {

        LambdaApp app= new LambdaApp();
        app.ordenar();
        app.calcularPromedio(2,3);
    }
}

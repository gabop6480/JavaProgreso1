public class Esfero {
    String tipo;
    String color;
    Double altura; //Con double en mayuscula, se requiere poner siempre un numero double= 10.2, y nunca un entero
    double punta;

    public void detallesfero(){
        System.out.println("tipo = " + tipo);
        System.out.println("color = " + color);
        System.out.println("altura = " + altura);
        System.out.println("punta = " + punta);
    }
}
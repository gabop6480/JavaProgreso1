public class Automovil { //Es una clase
    String color;       //Se coloca siempre el tipo de dato y luego la subclase o atributo
    String modelo;      //soutv para printf
    String marca;
    double cilindraje;

    public String detalleauto(){
        StringBuilder sb=new StringBuilder();  //Crea una clase dentro de un metodo, StringBuilde concatena en una linea
        sb.append("La marca del auto es: "+ this.marca+ " ");
        sb.append("Modelo del auto es: "+ this.modelo+ " ");
        sb.append("Color del auto es: "+ this.color+ " ");
        sb.append("Cilindraje del auto es: "+ this.cilindraje+ " ");
        return sb.toString();
    }
}

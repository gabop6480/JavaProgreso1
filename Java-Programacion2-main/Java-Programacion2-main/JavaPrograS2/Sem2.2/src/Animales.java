public class Animales {
    String color;
    int patas;
    String genero;
    String raza;
    public String caracteristicas() {
        StringBuilder sb = new StringBuilder();
        sb.append("La raza del animal es: " + raza +"\n");
        sb.append("El genero del animal es: " + genero +"\n");
        sb.append("El color del animal es: " +color +"\n");
        sb.append("La cantidad de patas del animal es: "+ patas +"\n");

        return sb.toString();
    }
}

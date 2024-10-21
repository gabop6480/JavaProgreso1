public class Animales {
    private String color;
    private int patas;
    private String genero;
    private String raza;

    StringBuilder sb= new StringBuilder();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String caracteristicas(){
        sb.append("La raza del animal es: "+this.raza+"\n");
        sb.append("El color del animal es: "+this.color+"\n");
        sb.append("El genero del animal es: "+this.genero+"\n");
        sb.append("La cantidad de patas del animal es: "+this.patas+"\n");
        return sb.toString();
    }


}

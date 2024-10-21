public class Futbolistas {
    //Atributos
    private String posicion;
    private int edad;
    private int numero;
    private double altura;
    //Constructores

    public Futbolistas() {
    }

    public Futbolistas(String posicion, int edad, int numero) {
        this.posicion = posicion;
        this.edad = edad;
        this.numero = numero;
    }
    public Futbolistas(String posicion, int edad, int numero, double altura) {
        this(posicion,edad,numero);
        this.altura=altura;
        }

    //Getter & Setter

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodos
    public String detalleFutbolista() {
        StringBuilder sb=new StringBuilder();
        sb.append("La posicion del jugador es: " + this.posicion + "\n");
        sb.append("La edad del jugador es: "+ this.edad+"\n");
        sb.append("El numero de camiseta del jugador es: "+this.numero+"\n");
        sb.append("La altura del jugador es: "+this.altura+"\n");
        return sb.toString();
    }
}


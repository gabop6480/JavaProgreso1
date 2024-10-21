public class Automovil { //Es una clase
    private String color;       //Se coloca siempre el tipo de dato y luego la subclase o atributo
    private String modelo;      //soutv para printf
    private String marca;       //En ningun programa, no se debe ver ningun atributo, siempre mediante un metodo
    private double cilindraje;
    private float consumo=40;
    //Si los atributos son privados, entonces los metodos son publicos
    //Despues de los atributos debe ir los CONSTRUCTORES
    //Luego Getter y Setter (leer escribir)


    public String getColor() {      //Getter lee un valor asignado
        return color;
    }

    public void setColor(String color) {    //Setter asigna el valor
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public String detalleAuto(){        //Color azul indica que se está usando el molde en un objeto especifico, haciendo lo que el metodo pida
        String dv= "La marca es -> "+this.getMarca() + "\n"+ //metodos se declara con la segunda letra en mayuscula
                "El modelo es -> "+ this.getModelo()+"\n"+
                "El color es -> "+this.color+"\n"+
                "El cilindraje es -> "+this.cilindraje+"\n";
                        //This toma el atributo de la clase, si no toma del metodo
        return dv;
    }
    public String acelerar(){  //El color negro indica el molde, la clase es el molde (ejemplo)

        return "El auto marca "+this.marca+" Esta acelerando";
    }

    public String frenar(int kmph){
        return "El auto modelo "+this.modelo+" Esta frenando a -> "+kmph;
    }

    public float capacidadTanque(int cap, float porConsumo){ //Cuando hay 2 o mas metodos con el mismo nombre, pero reciben distintos parametros se llama "Sobrecarga de Metodos", tambien se aplica en el constructor
        float cm=consumo/(cap*porConsumo);
        return cm;
    }

    public float capacidadTanque(int cap, int porConsumo){   //Se aplica el Polimorfismo, el mismo metodo pero hace distintas cosas
        float cm=(cap*(porConsumo/100));                    //El encapsulamiento dice que: no sabe a que metodo va a ir, solo recibe, procesa y devuelve
        return cm;
    }
}
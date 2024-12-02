package udla.gpalacios.poointabs.imprenta.modelo;

//Con "extends" se hace la heredacion
public class Informe extends Hoja{

    private String autor;
    private String revisor;
    //Super==superclase, hereda contenido de los atributos de la clase principal
    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor=autor;
        this.revisor=revisor;

    }
    //Si hay un constructor que recibe por lo menos un parametro, en la subclase hay que escribir el mismo constructor
    //Cuando se hereda de una clase abstracta, hay que implementar los metodos
    @Override
    public String imprimir() {
        return "Informe escrito por: "+this.autor+
                "Revisado por: "+this.revisor+
                "\n"+this.contenido;
    }
}

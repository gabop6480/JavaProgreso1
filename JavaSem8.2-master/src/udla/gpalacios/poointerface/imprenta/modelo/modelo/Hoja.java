package udla.gpalacios.poointerface.imprenta.modelo.modelo;
//Se puede poner abstract antes de public o despues de public, pero recomendado antes de public
//Una clase abstracto puede tener metodos no abstractos, pero no viceversa, osea en una clase no abstracta no se puede colocar metodos abstractos, ya que el metodo abstracto vuelve abstracta a la clase
abstract public class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    //metodo abstracto, no se pone cuerpo ({})
    abstract public String imprimir();

}

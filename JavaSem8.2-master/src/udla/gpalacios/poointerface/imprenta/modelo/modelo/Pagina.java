package udla.gpalacios.poointerface.imprenta.modelo.modelo;

import udla.gpalacios.poointerface.imprenta.modelo.modelo.Hoja;

public class Pagina extends Hoja implements Imprimible{
    //Constructor

    public Pagina(String contenido) {
        super(contenido);
    }
}

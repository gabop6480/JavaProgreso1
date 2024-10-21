
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();  //Instancia la clase con un objeto, Orden: Clase+nombre+=+new+Constructor
        //El constructor es el unico metodo que tiene el mismo nombre de la clase, con Mayuscula
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3.5);
        System.out.println("bmw.getMarca() = " + bmw.getMarca());



        System.out.println("bmw = " + bmw.acelerar());
        System.out.println("bmw = " + bmw.frenar(50));
        System.out.println("bmw.capacidadTanque(40,0.7f) = " + bmw.capacidadTanque(40, 70));
        System.out.println("bmw.capacidadTanque(50,.7f) = " + bmw.capacidadTanque(40, .7f));
        Automovil auto = new Automovil(); //Asi se llama a una clase
        /*auto.cilindraje = 1.5; //Objetos se declaran con minuscula, clases con mayuscula
        auto.color = "Rojo";
        auto.marca = "Toyota";
        auto.modelo = "Yaris";
        System.out.println(auto.detalleauto());*/

        Esfero esf = new Esfero();
        esf.color = "Rojo";
        esf.tipo = "Boton";
        esf.altura = 10.0;
        esf.punta = 5;
        esf.detallesfero();

    }
}
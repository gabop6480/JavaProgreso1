//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();
        bmw.marca="BMW"; //atributos del objeto
        bmw.color="Negro";
        bmw.modelo="i320";
        bmw.cilindraje=3.5;
        System.out.println(bmw.detalleauto()); //De esta manera se tiene que usar el sout solo una vez
        Automovil auto = new Automovil(); //Asi se llama a una clase
        auto.cilindraje=1.5; //Objetos se declaran con minuscula, clases con mayuscula
        auto.color="Rojo";
        auto.marca="Toyota";
        auto.modelo="Yaris";
        System.out.println(auto.detalleauto());

        Esfero esf=new Esfero();
        esf.color="Rojo";
        esf.tipo="Boton";
        esf.altura = 10.0;
        esf.punta=5;
        esf.detallesfero();

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Animales dog = new Animales();
        dog.raza="Golden Retriever";
        dog.color="Naranja";
        dog.genero="Macho";
        dog.patas=4;
        System.out.println(dog.caracteristicas());
Animales cat = new Animales();
        cat.raza="Siames";
        cat.color="Cafe y negro";
        cat.genero="Hembra";
        cat.patas=4;
        System.out.println(cat.caracteristicas());
Animales hrs = new Animales();
        hrs.raza="Frison";
        hrs.color="Negro";
        hrs.genero="Macho";
        hrs.patas=4;
        System.out.println(hrs.caracteristicas());
Animales cow = new Animales();
        cow.raza="Busa";
        cow.color="Cafe";
        cow.genero="Hembra";
        cow.patas=4;
        System.out.println(cow.caracteristicas());
    }
}
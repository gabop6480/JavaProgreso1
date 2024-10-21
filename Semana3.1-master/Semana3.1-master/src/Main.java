public class Main {
    public static void main(String[] args) {
        Animales dog = new Animales();
        dog.setRaza("Golden Retriever");
        dog.setColor("Naranja");
        dog.setGenero("Macho");
        dog.setPatas(4);
        System.out.println(dog.caracteristicas());
        Animales cat = new Animales();
        cat.setRaza("Siames");
        cat.setColor("Cafe y Negro");
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
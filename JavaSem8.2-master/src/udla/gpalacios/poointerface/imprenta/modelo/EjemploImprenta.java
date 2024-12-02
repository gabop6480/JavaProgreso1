package udla.gpalacios.poointerface.imprenta.modelo;

import udla.gpalacios.poointerface.imprenta.modelo.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv =new Curriculo("Juan Gallo", "Ing. Sistemas","Resumen Laboral...");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollador FullStack");
        cv.experiencia("Angular");

        Libro libro=new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elementos Reusables POO", Genero.PROGRAMACION);
        libro.addPagina();
        Informe informe=new Informe("Autor: "+"JuanJoseJoaquin ","Revisor"+"MartinMiguelMorales ","Contenido: "+"Estudio Microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}

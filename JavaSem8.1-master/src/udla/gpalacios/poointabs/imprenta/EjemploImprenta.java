package udla.gpalacios.poointabs.imprenta;

import udla.gpalacios.poointabs.imprenta.modelo.Curriculo;
import udla.gpalacios.poointabs.imprenta.modelo.Hoja;
import udla.gpalacios.poointabs.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv =new Curriculo("Juan Gallo", "Ing. Sistemas","Resumen Laboral...");
        cv.experiencia("Java");
        cv.experiencia("Oracle DBA");
        cv.experiencia("SpringBoot Framework");
        cv.experiencia("Desarrollador FullStack");
        cv.experiencia("Angular");
        Informe informe=new Informe("Autor: "+"JuanJoseJoaquin ","Revisor"+"MartinMiguelMorales ","Contenido: "+"Estudio Microservicios");
        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprime){
        System.out.println(imprime.imprimir());
    }
}

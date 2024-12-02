package udla.gpalacios.poointabs.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

//Da error ya que se esta heredando de una clase abstracta, para lo que se necesita implementar metodo y constructor
public class Curriculo extends Hoja{
    private String persona;
    private String carrera;
    private List<String> experiencia;  //List<>==
    
    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.carrera=carrera;
        this.persona=persona;
        this.experiencia=new ArrayList<>();
    }

    public Curriculo experiencia(String exp){ 
        experiencia.add(exp);
        return this;
    };
    
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n").append("Resumen: ").append(this.contenido).append("\n").append("Profesion: ").append(this.carrera).append("\n").append("Experiencia: ").append(this.experiencia);
        for (String exp:this.experiencia){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }

}

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Estudiante est=new Estudiante();
    Notas not=new Notas();
    Universidad u=new Universidad();
    Materia mat=new Materia();

    String nom=JOptionPane.showInputDialog(null, "Ingrese el nombre");
    est.getNombre(nom);
    /*Scanner sc=new Scanner(System.in);
    String Universidad=sc.nextLine();
    float n1=sc.nextFloat();        Metodo para lectura de datos
    */
    }
}
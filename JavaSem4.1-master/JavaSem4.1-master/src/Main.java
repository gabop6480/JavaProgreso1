import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Futbolistas messi = new Futbolistas("Delantero", 35, 10);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Para leer datos ingresados

        String var1=JOptionPane.showInputDialog("Posicion: ");
        JOptionPane.showMessageDialog(null,var1);
        messi.setPosicion(var1);
        System.out.println(var1);

        int var2=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        System.out.println("Edad: ");
        //var2=Integer.parseInt(br.readLine()); //Para transformar datos a String --- x=TipoDeDato.parseTipoDeDatoAcortado(FuncionQueLeeDatos);
        System.out.println("");
        messi.setEdad(var2);
        System.out.println(var2);

        int var3;
        System.out.println("Número de camiseta");
        var3=Integer.parseInt(br.readLine());
        messi.setNumero(var3);
        System.out.println(var3);

    }
}
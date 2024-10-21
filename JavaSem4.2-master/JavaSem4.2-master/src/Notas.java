public class Notas {
    private double notasPP;
    private double notasSP;
    private double notasTP;
    private double promedio;

    public double getNotasPP() {
        return notasPP;
    }

    public void setNotasPP(double notasPP) {
        this.notasPP = notasPP;
    }

    public double getNotasSP() {
        return notasSP;
    }

    public void setNotasSP(double notasSP) {
        this.notasSP = notasSP;
    }

    public double getNotasTP() {
        return notasTP;
    }

    public void setNotasTP(double notasTP) {
        this.notasTP = notasTP;
    }


    public double promedioNotas(){
        promedio=(notasPP*.25)+(notasSP*.35)+(notasTP*.40);
        return promedio;
    }
}

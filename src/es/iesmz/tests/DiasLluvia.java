package es.iesmz.tests;

public class DiasLluvia {
    private boolean [][] diasLluvia;

    public DiasLluvia(boolean haLlovido) {
        this.diasLluvia = new boolean[12][31];
    }

    private boolean registroDia(int dia, int mes, boolean lluvia){
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("La fecha es incorrecta.");
            return false;
        } else {
            diasLluvia[mes - 1][dia - 1] = lluvia;
            return true;
        }
    }
}

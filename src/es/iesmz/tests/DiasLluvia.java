package es.iesmz.tests;

public class DiasLluvia {
    private boolean [][] diasLluvia;

    public DiasLluvia() {
        this.diasLluvia = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia){
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("La fecha es incorrecta.");
            return false;
        } else {
            diasLluvia[mes - 1][dia - 1] = lluvia;
            return true;
        }
    }

    public boolean consultarDia(int dia, int mes){
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31){
            System.out.println("La fecha es incorrecta.");
            return false;
        } else {
            return diasLluvia[mes - 1][dia - 1];
        }
    }

    public int contarDiasLluviosos(){
        int cont = 0;

        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]){
                    cont++;
                }
            }
        }
        return cont;
    }

    public int trimestreLluvioso(){
        int cont1 = 0, cont2 = 0, cont3 = 0,cont4 = 0;

        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[0][j]){
                    cont1++;
                } else if (diasLluvia[1][j]){
                    cont1++;
                } else if (diasLluvia[2][j]){
                    cont1++;
                } else if (diasLluvia[3][j]){
                    cont2++;
                } else if (diasLluvia[4][j]){
                    cont2++;
                } else if (diasLluvia[5][j]){
                    cont2++;
                } else if (diasLluvia[6][j]){
                    cont3++;
                } else if (diasLluvia[7][j]){
                    cont3++;
                } else if (diasLluvia[8][j]) {
                    cont3++;
                }else if (diasLluvia[9][j]){
                    cont4++;
                } else if (diasLluvia[10][j]){
                    cont4++;
                } else {
                    cont4++;
                }
            }
        }

        if (cont1 > cont2 && cont1 > cont3 && cont1 > cont4){
            return 1;
        } else if (cont2 > cont3 && cont2 > cont4){
            return 2;
        } else if (cont3 > cont4){
            return 3;
        } else {
            return 4;
        }
    }

    public int primerDiaLluvioso() {
        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[i].length; j++) {
                if (diasLluvia[i][j]) {
                    int diaDelAnyo = j + 1;
                    for (int k = 0; k < i; k++) {
                        diaDelAnyo += diasEnMes(k);
                    }
                    return diaDelAnyo;
                }
            }
        }
        return -1;
    }

    private int diasEnMes(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes];
    }

}

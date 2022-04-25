import java.util.*;
import java.lang.*;

/*0001 -> Adicao
  0011 -> Subtracao
  0111 -> Multiplicacao
  1111 -> Divisao*/

public class ula {

    String r1;
    String r2;
    String resultado = new String();

    int i = 0;
    int j = 0;

    public ula() {

    }

    public String soma(String r1, String r2) {

        char Carin;
        char Carout;
        Carin = '0';
        Carout = '0';
        resultado = "";

        System.out.println("R1-> " + r1+"("+Integer.parseInt(r1,2)+")");
        System.out.println("R2-> " + r2+"("+Integer.parseInt(r2,2)+")");

        for (i = r1.length() - 1; i >= 0; i--) {
            if ((r1.charAt(i) == '0') && (r2.charAt(i) == '0') && (Carin == '0')) {
                resultado = '0' + resultado;
                Carout = '0';
                Carin = Carout;
            } else if ((r1.charAt(i) == '0') && (r2.charAt(i) == '1') && (Carin == '0')) {
                resultado = '1' + resultado;
                Carout = '0';
                Carin = Carout;
            } else if ((r1.charAt(i) == '0') && (r2.charAt(i) == '1') && (Carin == '1')) {
                resultado = '0' + resultado;
                Carout = '1';
                Carin = Carout;
            } else if ((r1.charAt(i) == '1') && (r2.charAt(i) == '0') && (Carin == '0')) {
                resultado = '1' + resultado;
                Carout = '0';
                Carin = Carout;
            } else if ((r1.charAt(i) == '1') && (r2.charAt(i) == '0') && (Carin == '1')) {
                resultado = '0' + resultado;
                Carout = 1;
                Carin = Carout;
            } else if ((r1.charAt(i) == '1') && (r2.charAt(i) == '1') && (Carin == '0')) {
                resultado = '0' + resultado;
                Carout = 1;
                Carin = Carout;
                System.out.println("sexto if -> " + resultado);
            } else if ((r1.charAt(i) == '1') && (r2.charAt(i) == '1') && (Carin == '1')) {
                resultado = '1' + resultado;
                Carout = 1;
                Carin = Carout;
            } else if ((r1.charAt(i) == '1') && (r2.charAt(i) == '1') && (Carin == '1') && ((i == '0') || (i == '1'))) {
                resultado = '1' + resultado;
                Carout = 1;
                Carin = Carout;
                if (Carout == 1) {
                    System.out.println("Ocorreu overflow -> BIT IGNORADO : CAROUT -> " + Carout);
                }
            }

        }
        System.out.println("RESULTADO DA SOMA BINÁRIO-> " + resultado);
        System.out.println("RESULTADO DA SOMA DECIMAL-> " + Integer.parseInt(resultado, 2));
        return resultado;
    }

    public String sub(String r1, String r2) {

        int resultado;

        System.out.println("R1-> " + r1+"("+Integer.parseInt(r1,2)+")");
        System.out.println("R2-> " + r2+"("+Integer.parseInt(r2,2)+")");

        int n1 = Integer.parseInt(r1, 2);
        int n2 = Integer.parseInt(r2, 2);

        resultado = n1 - n2;

        String resp = Integer.toBinaryString(resultado);

        System.out.println("RESULTADO DA SUBTRACAO BINÁRIO-> " + resp);
        System.out.println("RESULTADO DA SUBTRACAO DECIMAL-> " + resultado);
        return resp;
    }

    public String mult(String r1, String r2) {

        /*
         * Eax = r1 + '0'
         * aux = soma(aux,eax);
         * Toda vez que for 0 -> Linha "ignorada"
         * Toda vez que for 1 repete o de cima -> r1 com o zero
         */

        String resp = new String();
        String zeros = "000000";
        String reg = "";

        System.out.println("R1-> " + r1+"("+Integer.parseInt(r1,2)+")");
        System.out.println("R2-> " + r2+"("+Integer.parseInt(r2,2)+")");

        if (r2.charAt(5) == '1') {
            resp = r1;
        } else if (r2.charAt(5) == '0') {
            resp = zeros;
        }

        for (int i=4; i>=0; i--) {
            if (r2.charAt(i) == '1') {
                reg = r1 + '0';
                resp = soma(resp, reg);
            } else if (r2.charAt(i) == '0') {
                reg = zeros + '0';
                resp = soma(resp, zeros);
            }
        }

        System.out.println("RESULTADO DA MULTIPLICACAO BINÁRIO-> " + Integer.parseInt(resp, 2));
        System.out.println("RESULTADO DA MULTIPLICACAO DECIMAL-> " + resp);
        return resp;
    }

    public String div(String r1, String r2) {
        int resultado = 0;

        System.out.println("R1-> " + r1 +"("+Integer.parseInt(r1,2)+")");
        System.out.println("R2-> " + r2 +"("+Integer.parseInt(r2,2)+")");

        int n1 = Integer.parseInt(r1, 2);
        int n2 = Integer.parseInt(r2, 2);
        if (n1 > n2) {
            resultado = n1 / n2;
        } else {
            System.out.println("Divisao vai dar zero, pois numero menor em cima");
        }

        String resp = Integer.toBinaryString(resultado);

        System.out.println("RESULTADO DA DIVISAO BINÁRIO-> " + resp);
        System.out.println("RESULTADO DA DIVISAO DECIMAL-> " + resultado);
        return resp;
    }

    public String complementoDeDois(String reg) {
        // String complemento;
        String comp = new String();
        // comp.length() = reg.length();
        int j;
        for (i = 5; i >= 0; i--) {
            comp = reg.charAt(i) + comp;
            if (reg.charAt(i) == '1') {
                for (j = (i - 1); j >= 0; j--) {
                    if (reg.charAt(j) == '1') {
                        comp = '0' + comp;
                    } else if (reg.charAt(j) == '0') {
                        comp = '1' + comp;
                    }
                    // reg.charAt(j) = (!reg.charAt(j));
                    // comp.charAt(j) = reg.charAt(j);
                }
            }
            // comp = reg.charAt(i);
        }
        return comp;
    }

    public static void main(String[] args) {
        ula teste = new ula();
        String r1 = "000100";
        String r2 = "000010";

        teste.soma(r1, r2);
        teste.sub(r1, r2);
        teste.div(r1, r2);
        teste.mult(r1, r2);
    }
}

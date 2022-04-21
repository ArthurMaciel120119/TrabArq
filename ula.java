import java.util.*;
import java.lang.*;

public class ula {
    private String[] opcode;
    private String[] reg;
    private String[] instrucao;

    String[] r1;
    String[] r2;
    String[] resultado;
    int i = 0;

    public String[] soma(String[] r1, String[] r2) {
        String res;
        String aux;
        int Carin = 0;
        System.out.println("Entrando na soma ");
        mesmoTamanho(r1, r2);
        for (i = (r1.length - 1); i > 0; i--) {
            res = (r1[i] ^ r2[i]);
            if (res == "0") {
                Carin = 1;
            } else {
                Carin = 0;
            }
            aux = (res ^ Carin);
            if (r1[i] ^ r2[i] ^ Carin == 1) {
                System.out.println("overflow ativado! Binario sobrando ignorado");
            }
            resultado[i] = aux;
            System.out.println("Binario mais a esquerda -> " + resultado[0]);
        }

        return resultado;
    }

    public String[] sub(String[] r1,String[] r2){
        int i;
        System.out.println("Entrando na subtracao ");
        for(i=(r1.length()-1);i>0;i--){
            r1^r2^Carin;
        }

        return resultado;
    }

    public String[] mult(String[] r1, String[] r2) {
        System.out.println("Entrando na multiplicacao ");
        return resultado;
    }

    public String[] div(String[] r1, String[] r2) {
        System.out.println("Entrando na  divisao ");
        return resultado;

    }

    public String[] complementoDeDois(String[] reg) {
        String[] complemento;
        int j;
        for (i = reg.length; i > 0; i--) {
            if (reg[i] == "1") {
                for (j = i - 1; j > 0; j--) {
                    reg[j] = (!reg[j]);
                    complemento[j] = reg[j];
                }
            }
            complemento[i] = reg[i];
        }
        return complemento;
    }

    public String[] mesmoTamanho(String[] r1, String[] r2) {
        String[] igualado;
        return igualado;
    }

    public String[] binarioNegativo(String[] reg) {
        String[] negativo;
        return negativo;
    }

}

public static void main(String[] args) {
    
}
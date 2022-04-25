import java.util.*;
import java.io.*;

public class registradores {

    private String palavra;
    private String endereco;
    private String opcode;

    public String marbusca(String endereco) {
        String endmar;
        registradores mar = new registradores();
        endmar = mar.pcbusca(endereco);
        System.out.println("MAR recebendo instrucao de PC e enviando para memoria no Ciclo de Busca");
        System.out.println("INSTRUCAO -> " + endmar);
        System.out.println(endmar);
        return endmar;
    }

    public String mbrbusca(String dado,String dado2) {
        System.out.println("MBR recebe dado lido pela Memoria e envia o cod. op. para IR no Ciclo de Busca");
        return opcode;
    }

    public String irbusca(String palavra) {
        String opcode = new String();
        int i;

        for (i = 0; i<4; i++) {
            opcode = opcode+palavra.charAt(i);
        }
        System.out.println("IR recebe o cod. op. e armazena no Ciclo de Busca");
        System.out.println("OPCODE -> " + opcode);
        return opcode;
    }


    public String ac(String resultado) {
        int i;
        String acumulador = new String();
        for (i = 0; i < resultado.length(); i++) {
            acumulador = resultado.charAt(i) + acumulador;
        }
        System.out.println("Acumulador recebendo o valor -> " + acumulador);
        return acumulador;
    }

    public String pcbusca(String endereco) {
        int cont = 0;
        if (cont == 0) {
            System.out.println("Instrucao no Ciclo de Busca");
            cont++;
        }
        return endereco;
    }

    public int pcexecucao(String endereco) {
        int cont = 0;
        for (int i = 0; i < 2; i++) {
            if (cont == 0) {
                System.out.println("Instrucao sendo Executada");
                cont++;
            } else if (cont >= 1) {
                System.out.println("Proxima instrucao sendo Executada");
            }
        }
        return cont;
    }

    public String irexecucao(String palavra){
        System.out.println("IR sendo decodificado no Ciclo de Execucao");
        for (int i = 0; i < 3; i++) {
            opcode = opcode + palavra.charAt(i);
        }
        return opcode;
    }
    /*
     * public void mq(){
     * 
     * }
     */
}

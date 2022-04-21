public class registradores {

    private String[] palavra;

    public String[] marbusca(String[] endereco) {
        String[] endmar;
        registradores mar = new registradores();
        endmar = mar.pcbusca(endereco);
        System.out.println("MAR recebendo instrucao de PC e enviando para memoria no Ciclo de Busca");
        System.out.println("INSTRUCAO -> " + endmar);
        System.out.println(endmar);
        return endmar;
    }

    public void mbrbusca(String[] dado) {
        System.out.println("MBR recebe dado lido pela Memoria e envia o cod. op. para IR no Ciclo de Busca");
    }

    public String[] irbusca(String[] palavra) {
        String[] opcode;
        int i;

        for (i = 0; i < 3; i++) {
            opcode[i] = palavra[i];
        }
        System.out.println("IR recebe o cod. op. e armazena no Ciclo de Busca");
        System.out.println("OPCODE -> " + opcode);
        return opcode;
    }

    public void ibr() {

    }

    public String[] ac(ula resultado) {
        int i;
        String[] acumulador;
        for (i = 0; i < resultado.length; i++) {
            acumulador[i] = resultado[i];
        }

        return acumulador;

    }

    public String[] pcbusca(String[] endereco) {
        System.out.println("Manda o endereco para MAR no Ciclo de Busca");
        return endereco;
    }

    public void pcbusca2(String[] endereco) {
        System.out.println("Aponta para prox instrucao e finaliza o Ciclo de Busca");
    }

    /*
     * public void mq(){
     * 
     * }
     */
}

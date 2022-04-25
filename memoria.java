public class memoria {
    private String[] memoria;
    private String dado;

    public String lerEndereco(String palavra) {
        int i=0;
        System.out.println("Memoria lendo instrucao e guardando no Ciclo de busca e enviando o dado para MBR");
        memoria = new String[32];
        memoria[i] = palavra;
        i++;
        return palavra;
    }
}

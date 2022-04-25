import java.util.*;
import java.time.*;

public class main {

    public static void main(String[] args){
        String opcode = new String();
        String r1 = new String();
        String r2 = new String();
        String resultado = new String();

        int i;

        ula teste = new ula();
        registradores uc = new registradores();
        memoria memoria = new memoria();
        String endereco = "00001";
        int cont=0;
        int Clock[];


    
        //ula ula = new ula();

        Scanner sc = new Scanner(System.in);
        System.out.println("OPERACOES DE ACORDO COM OPCODE : ");
        System.out.println("[0001] : Adicao ");     
        System.out.println("[0011] : Subtracao ");     
        System.out.println("[0111] : Multiplicao ");     
        System.out.println("[1111] : Divisao ");  
        System.out.println("Digite a palavra desejada : (OPCODE)(R1)(R2)");
        
        String palavra = sc.nextLine(); 

        System.out.println("CICLO DE BUSCA");
        uc.pcbusca(endereco);
        System.out.println("PIPELINE CLOCK 0-> Endereco para memoria / Registrador PCBUSCA -> "+uc.pcbusca(endereco));
        uc.marbusca(endereco);
        cont++;
        System.out.println("PIPELINE CLOCK 1-> Buscando dado Registrador MARBUSCA -> "+uc.marbusca(endereco));
        memoria.lerEndereco(endereco);
        cont++;
        System.out.println("PIPELINE CLOCK 2-> Passando dado para execucao / Memoria na busca -> "+memoria.lerEndereco(endereco));
        uc.mbrbusca(r1,r2);
        cont++;
        System.out.println("PIPELINE CLOCK 3-> Busca opcode / Registrador MBRBUSCA -> "+uc.mbrbusca(r1,r2));
        uc.irbusca(palavra);
        cont++;
        System.out.println("PIPELINE CLOCK 4-> Guardando Opcode / Registrador IRBUSCA -> "+uc.irbusca(palavra));
        cont++;

        System.out.println("CICLO DE EXECUCAO");
        uc.pcexecucao(endereco);
        cont++;
        System.out.println("PIPELINE CLOCK 5-> Instrucao sendo executada e prox instrucao sendo lida / Registrador PCEXECUCAO -> "+uc.pcexecucao(endereco));
        uc.irexecucao(palavra);
        cont++;
        System.out.println("PIPELINE CLOCK 6-> Opcode sendo lido para execucao / Registrador  IREXECUCAO -> "+uc.irexecucao(palavra));

        for(i=0;i<4;i++){
            opcode = opcode + palavra.charAt(i);
        }
        for(i=4;i<10;i++){
            r1 = r1 + palavra.charAt(i);
        }
        for(i=10;i<16;i++){
            r2 = r2 + palavra.charAt(i);
        }

        if(opcode == "0001"){
            System.out.println("Entrando na soma : ");
            teste.complementoDeDois(r1);
            teste.complementoDeDois(r2);
            teste.soma(r1, r2);
            resultado = teste.soma(r1, r2);
            System.out.println("Resultado da soma : "+ resultado);
            uc.ac(resultado);
            System.out.println("PIPELINE CLOCK 7-> Soma sendo executada e acumulador recebendo valor /REG AC-> "+uc.ac(resultado));
            cont++;
        }else if(opcode == "0011"){
            System.out.println("Entrando na subtracao : ");
            teste.sub(r1, r2);
            resultado = teste.sub(r1, r2);
            System.out.println("Resultado da subtracao : "+resultado);
            System.out.println("PIPELINE CLOCK 7-> Subtracao sendo executada e acumulador recebendo valor/ REG AC-> "+uc.ac(resultado));
            uc.ac(resultado);
            cont++;
        }else if(opcode == "0111"){
            System.out.println("Entrando na multiplicacao : ");
            teste.mult(r1, r2);
            resultado = teste.mult(r1, r2);
            uc.ac(resultado);
            System.out.println("PIPELINE CLOCK 7-> Multiplicacao sendo executada e acumulador recebendo valor /REG AC-> "+uc.ac(resultado));
            cont++;
        }else if(opcode == "1111"){
            System.out.println("Entrando na divisao : ");
            teste.div(r1, r2);
            resultado = teste.div(r1, r2);
            uc.ac(resultado);
            System.out.println("PIPELINE CLOCK 7-> Divisao sendo executada e acumulador recebendo valor /REG AC-> "+uc.ac(resultado));
            cont++;
        }
    
        sc.close(); 

        System.out.println();
    }
    
}

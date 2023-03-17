package listadevetores;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class ListaDeVetores {

    public static void ex01() {
        int[] num = new int[6];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o número 1");
        num[0] = sc.nextInt();
        
        System.out.println("Entre com o número 2");
        num[1] = sc.nextInt();
        
        System.out.println("Entre com o número 3");
        num[2] = sc.nextInt();
        
        System.out.println("Entre com o número 4");
        num[3] = sc.nextInt();
        
        System.out.println("Entre com o número 5");
        num[4] = sc.nextInt();
        
        System.out.println("Entre com o número 6");
        num[5] = sc.nextInt();
        
        System.out.println("Os valores lidos são: "+num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);
    }
    
    public static void ex02() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }
    
    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }
    
    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");
        
        int i = 0;
        while( i < 6){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(vet[i]%2 ==0)i++;
            else System.out.println("Erro, número ímpar.");
        }

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }
    
    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");
        
        int i = 0;
        while( i < 6){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            i++;
        }

        System.out.println("Os valores lidos são: ");
        for (i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
        
        Arrays.sort(vet);
        
        System.out.printf("O maior valor é: %d:\n",vet[vet.length -1]);
        System.out.printf("O menor valor é: %d:\n",vet[0]);
        float media = 0;
        for(int j : vet) media += j; 
        media /= 6;
        System.out.printf("A média valor é: %f:\n",media);
    }
    
    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        float[] aux;
        System.out.println("<< Listando um vetor >>");
        
        int i = 0;
        while( i < 6){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            i++;
        }

        System.out.println("Os valores lidos são: ");
        for (i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
        
        aux = mediaExe06(vet);
        
        System.out.printf("\nO maior valor é: %d:\n",vet[(int) aux[0]]);
        System.out.printf("O menor valor é: %d:\n",vet[(int) aux[1]]);
        System.out.printf("A média valor é: %f:\n",aux[2]);
    }
    
    public static float[] mediaExe06(int[] vet){//result [0] é o indice do maior valor, [1] menor, [2] o valor da média
        float[] result = new float[3];  
        float media = 0, maior = 0, menor = 0;
        
        for(int i = 0; i < vet.length; i++){
            if(maior < vet[i]){
                result[0] = i;
                maior = vet[i];
            }
            if(menor > vet[i]){
                result[1] = i;
                menor = vet[i];
            }
        }
        
        for(int j : vet) media += j; 
        
        result[2]  = media / vet.length;  
        
        return result;
    }
    
    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];

        System.out.println("<<Normalizando as notas>>");
        
        int i = 0;
        while( i < vet.length){
            System.out.printf("Entre com a nota do aluno %d: ",i+1);
            vet[i] = sc.nextInt();
            i++;
        }
        
        i = 0;
        while(i < vet.length){
            vet[i] *=2;
            if(vet[i] > 100) vet[i] = 100;
            i++;
        }
        
        System.out.println("Notas normalizadas: ");
        
        i = 0;
        while(i < vet.length){
            System.out.printf("A nota do aluno %d é %d\n",i,vet[i]);
            i++;
        }
    }
    
    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        float[] aux;
        
        System.out.println("<< Média e desvio-padrão >>");
        
        int i = 0;
        while( i < vet.length){
            System.out.printf("Digite o valor %d: ",i+1);
            vet[i] = sc.nextInt();
            i++;
        }
        
        aux = mediaAritimetica(vet);
        
        System.out.printf("A média é %.2f e o desvio-padrão é %.2f",aux[0],aux[1]);
    }
    
    public static float[] mediaAritimetica(int[] vet){//result [0] o valor da média, [1] desvio
        float[] result = new float[2];  
        float media = 0;
        
        for(int j : vet)
            media += j; 
        
        result[0]  = media / vet.length;  
        
        for(int i : vet)
            result[1] += i+result[0];
        
        result[1] /= vet.length;
        
        result[1] = (float) Math.sqrt(result[1]);
        
        return result;
    }
    
    public static void ex09() {
        
        Scanner sc = new Scanner(System.in);
        int[] alunos = new int[100];
        float aux;
        int qnt = 0;
        
        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        System.out.println("\nEntre com o número de alunos: ");
        qnt = sc.nextInt();
        
        if(qnt > 100){
            System.out.println("Erro, valor muito alto!");
            System.out.println("\nEntre com o número de alunos: ");
            qnt = sc.nextInt();
        }
        else{
            for (int i = 0; i < qnt; i++){
                System.out.printf("\nDigite a nota do aluno %d: ",i+1);
                alunos[i] = sc.nextInt();
            }
        
            System.out.println("\nRelatório de Notas\n");
            for (int i = 0; i < qnt; i++)
                System.out.printf("\nA nota do aluno %d é: %d",i+1, alunos[i]);
        
            aux = mediaEx09(alunos, qnt);
            System.out.println("\nA média da turma é: "+aux);
        }
        
    }
    
    public static float mediaEx09(int[] vet, int limit){
        float result = 0;
        
        for(int j = 0; j < limit; j++) result += vet[j]; 
        
        result  /= limit;  
        
        return result;
    }
    
    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3], B = new int[3];
        
        System.out.println("<< Subtração de vetores >>");
        
        for(int i = 0; i < A.length; i++){
            System.out.printf("\nDigite o valor %d de A: ",i+1);
            A[i] = sc.nextInt();
        }
        
        for(int i = 0; i < B.length; i++){
            System.out.printf("\nDigite o valor %d de B: ",i+1);
            B[i] = sc.nextInt();
        }
        
        System.out.printf("O vetor C, definido como C = A-B é (");
        
        for(int i = 0; i < A.length; i++)
            System.out.printf(" %d ",A[i]-B[i]);
        
        System.out.printf(")");
    }
    
    public static void ex11() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5], v1 = new int[5], v2 = new int[5];
        
        System.out.println("<< Pares e Ímpares >>");
        
        for(int i = 0; i < v.length; i++){
            System.out.printf("\nDigite o valor %d: ", i+1);
            v[i] = sc.nextInt();
        }
        
        for(int i = 0; i < v.length; i++)
            if( v[i]%2 == 0) {
                v2[i] = i;
                v1[i] = -1;
            }
            else{
                v1[i] = i;
                v2[i] = -1;
            }
        
        System.out.println("\nÍmpares: ");
        for(int i : v1) if(i != -1) System.out.printf(" %d",i);
        
        System.out.println("\nPares: ");
        for(int i : v2) if(i != -1) System.out.printf(" %d",i);
            
    }
    
    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int[] cores = new int[4];
        float[] aux;
        String[] nomeCores = {"Verde", "Azul", "Amarela", "Vermelha"};
        
        System.out.println("<< Probabilidades >>");
        System.out.println("\nDigite a quantidade de bolinhas\n");
        
        for(int i = 0; i < cores.length; i++){
            System.out.println(nomeCores[i]+": ");
            cores[i] = sc.nextInt();
        }
        
        aux = probabilidades(cores);
        
        System.out.println("\nProbabilidades\n");
        
        for(int i = 0; i < nomeCores.length; i++)
            System.out.printf("\n%s : %.2f",nomeCores[i],aux[i+1]);
    }
    
    public static float[] probabilidades(int[] cores){
        float[] calculo = new float[5];
        calculo[0] = 0;
        
        for(int i : cores) calculo[0] += i;
        
        for(int i = 0; i < cores.length; i++)
            calculo[i+1] = (cores[i]/calculo[0])*100;
        
        return calculo;
    }
    
    public static void ex13() {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        
        System.out.println("<< Zerando negativos >>");
        
        for(int i = 0; i < v.length; i++){
            System.out.printf("\nEntre com o número %d: ", i+1);
            v[i] = sc.nextInt();
            if(v[i] < 0) v[i] = 0;
        }
        
        System.out.printf("\nZerando os negativos, obtém-se: ");
        for(int i : v) System.out.printf(" %d",i);
    }
    
    public static void ex14() {
        System.out.println("<< Universidade X >>");
        
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10000];
        String[] classeSocial = new String[10000];
        float[] CRA = new float[10000];
        int qnt;
        
        System.out.println("Quantos alunos serão cadastrados:");
        qnt = sc.nextInt();
        
        for(int i = 0; i < qnt; i++){
            System.out.printf("\nEntre com o número do aluno: ");
            num[i] = sc.nextInt();
            System.out.printf("\nEntre com a classe social do aluno %d: ", num[i]);
            classeSocial[i] = sc.next();
            System.out.printf("\nEntre com o CRA do aluno %d: ", num[i]);
            CRA[i] = sc.nextFloat();
        }
        
        System.out.println("==== Alunos Cadastrados ====");
        
        for(int i = 0; i < qnt; i++){
            System.out.println("Número: "+num[i]+" Classe Social: "+classeSocial[i]+" CRA: "+CRA[i]);
        } 
    }
    
    public static void ex15() {
        Scanner sc = new Scanner(System.in);
        Integer[] v = new Integer[8];
        
        Integer[] resp;
        
        for(int i = 0; i < v.length; i++){
            System.out.printf("\nEntre com o número %d: ", i+1);
            v[i] = sc.nextInt();
        }
        
        resp = verificaRepetidos(v);
        
        for(int i = 0; i < resp.length; i += 2) if(resp[i] != null ) System.out.println(resp[i]);
    }
    
    public static void ex16() {
        Scanner sc = new Scanner(System.in);
        Integer[] v = new Integer[8];
        
        Integer[] resp;
        
        for(int i = 0; i < v.length; i++){
            System.out.printf("\nEntre com o número %d: ", i+1);
            v[i] = sc.nextInt();
        }
        
        resp = verificaRepetidos(v);
        
        for(Integer i : resp) if(i != null) System.out.println(i);
    }
    
    public static Integer[] verificaRepetidos(Integer[] v){
        Integer[] qnt = new Integer[v.length*2];
        Integer[] aux = new Integer[2];
        int aux2 = 0, aux3 = 0;
        
        for(int i = 0; i < v.length; i++){
            for(int j = 0; j < v.length; j++){
                if(Objects.equals(v[i], v[j]))
                    aux2++;
                if(aux2 > 1) 
                    v[j] = null;
            }
            
            qnt[aux3]  = v[i];
            qnt[aux3 + 1]= aux2;
            
            aux3 +=2; 
            aux2 = 0;
            }
        
        return qnt;
    }
    
    public static void main(String[] args) {
        System.out.println("Olá");
        ex16();
    }
}
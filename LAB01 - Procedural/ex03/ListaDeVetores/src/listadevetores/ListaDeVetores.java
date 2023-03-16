package listadevetores;

import java.util.Arrays;
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
        
        aux = media(vet);
        
        System.out.printf("\nO maior valor é: %d:\n",vet[(int) aux[0]]);
        System.out.printf("O menor valor é: %d:\n",vet[(int) aux[1]]);
        System.out.printf("A média valor é: %f:\n",aux[2]);
    }
    
    public static float[] media(int[] vet){//result [0] é o indice do maior valor, [1] menor, [2] o valor da média
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
    
    }
    
    public static void ex10() {}
    
    public static void ex11() {}
    
    public static void ex12() {}
    
    public static void ex13() {}
    
    public static void ex15() {}
    
    public static void ex16() {}
    
    public static void main(String[] args) {
        System.out.println("Olá");
        ex08();
    }
}
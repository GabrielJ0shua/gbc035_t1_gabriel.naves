package poo1;
import java.util.Scanner;

public class POO1 {
    
    public static boolean alteraPreco(float[] preco, float porcentagem, int id){
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            preco[id] =  preco[id]*temp;
            return true;
        } else return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];
        
        
        for (int i = 0; i < 4; i++){
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto "+(i+1)+":\n");
            nome[i] = sc.next();
            preco[i] = sc.nextFloat();
            qtd_estoque[i] = sc.nextInt();
        }


        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        
        alteraPreco( preco,-110, 0);
        alteraPreco( preco, 10, 2);

        System.out.println("\nReduzindo o preco em 5%% do produto 2");
        
        if (alteraPreco( preco,-5, 1)) 
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        
        else System.out.println("\n\n Preco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 3");
        if (alteraPreco( preco,-110, 3))
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        
        for (int i = 0; i < 4; i++){
            System.out.println("\nProduto: "+nome[i]+"\nPreco: "+ preco[i] +"\nEstoque:"+ qtd_estoque[i]);
        }
    }
    
}

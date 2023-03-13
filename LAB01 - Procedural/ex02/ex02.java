package ex02;
import java.util.Scanner;
import java.util.ArrayList;

public class ex02 {
    
    public static boolean alteraPreco(Produto produto, float porcentagem){
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            produto.setPreco( produto.getPreco()*temp);
            System.out.println(produto.getPreco());
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
//        ArrayList<Produto> produto = new ArrayList<Produto>();
//        produto.add(new Produto( "google", 12.8F, 20));
//        produto.add(new Produto( "hub", 47.8F, 20));
//        produto.add(new Produto( "fer", 52.1F, 20));
//        produto.add(new Produto( "iou", 10F, 20));
//        
//        alteraPreco(produto.get(0),-110);
//        alteraPreco(produto.get(2),10);
//        
//        for(Produto p : produto) System.out.println("\nProduto: "+p.getNome()+"\nPreco: "+ p.getPreco() +"\nEstoque:"+ p.getQtd_estoque());
        
        ArrayList<Produto> produto = new ArrayList<Produto>();
        Scanner sc = new Scanner(System.in);
        String nome;
        float preco;
        int qtd_estoque;
        
        for (int i = 0; i < 4; i++)
        {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto 1:\n");
            nome = sc.nextLine();
            preco = sc.nextFloat();// Não entendo o pq está tendo erro aqui.
            qtd_estoque = sc.nextInt();
            
            produto.add(new Produto( nome, preco, qtd_estoque));
        }


        System.out.println("\nAumentando o preco em 10%% do produto 1 e 3");
        
        alteraPreco(produto.get(0),-110);
        alteraPreco(produto.get(2),10);

        System.out.println("\nReduzindo o preco em 5%% do produto 2");
        
        if (alteraPreco(produto.get(1),-5)) 
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        
        else System.out.println("\n\n Preco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 3");
        if (alteraPreco(produto.get(3),-110))
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        
        for (int i = 0; i < 4; i++){
            System.out.println("\nProduto: "+produto.get(i).getNome()+"\nPreco: "+ produto.get(i).getPreco() +"\nEstoque:"+ produto.get(i).getQtd_estoque());
        }
    }
    
}

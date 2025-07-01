import Produto.*;
import Venda.*;

import java.util.Scanner;

public class SistemaDeVendas {

    public static void main(String[] args) {

        Produto[] Produtos = new Produto[10];
        Venda[] Vendas = new Venda[10];

        int NumeroDeVendas = 0,quantidadeProduto = 0,i,quantidadeRequerida;

        String Resposta = "";

        Scanner sc = new Scanner(System.in);

        while (!Resposta.equals("sair")) {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Buscar Produto por nome");
            System.out.println("4 - realizar Venda");
            System.out.println("5 - listar Vendas");
            System.out.println("6 - sair");
            System.out.println("Digite o numero da opção desejada: ");
            Resposta = sc.nextLine();

            String n,p,v,r,r2;
            double c;
            int g;
            switch (Resposta) {
                case "1":
                    System.out.println("\nDigite o tipo do produto: ");
                    System.out.println("1-Alimenticio");
                    System.out.println("2-Eletronico");
                    r = sc.nextLine();
                    switch (r) {
                        case "1":
                            System.out.println("Digite o nome do produto: ");
                            n = sc.nextLine();
                            System.out.println("Digite o preço do produto: ");
                            p = sc.nextLine();
                            System.out.println("Digite o codigo do produto: ");
                            c = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Digite a validade do produto: ");
                            v = sc.nextLine();
                            Produtos[quantidadeProduto] = new ProdutoAlimenticio(n,p,c,v);
                            quantidadeProduto++;
                            break;
                        case "2":
                            System.out.println("Digite o nome do produto: ");
                            n = sc.nextLine();
                            System.out.println("Digite o preço do produto: ");
                            p = sc.nextLine();
                            System.out.println("Digite o codigo do produto: ");
                            c = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Digite a garantia do produto: ");
                            g = sc.nextInt();
                            sc.nextLine();
                            Produtos[quantidadeProduto] = new ProdutoEletronico(n,p,c,g);
                            quantidadeProduto++;
                            break;
                    }
                    break;
                case "2":
                    for (i = 0; i < quantidadeProduto; i++) {
                        System.out.println(Produtos[i]);
                    }
                    break;

                case "3":
                    System.out.println("Digite o nome do produto: ");
                    r2 = sc.nextLine();

                    for (i = 0; i < quantidadeProduto; i++) {
                        if (Produtos[i].getNome().equals(r2)) {
                            System.out.println(Produtos[i]);
                            break;
                        }
                    }
                    if(i == quantidadeProduto) {
                        System.out.println("Produto não encontrado ");
                    }
                    break;

                case "4":
                    System.out.println("Digite o nome do produto: ");
                    n = sc.nextLine();
                    for (i = 0; i < quantidadeProduto; i++) {
                        if (Produtos[i].getNome().equals(n)) {
                            break;
                        }
                    }
                    if(i == quantidadeProduto) {
                        System.out.println("Produto não encontrado ");
                        break;
                    }

                    System.out.println("Digite a quantidade de produtos: ");

                    quantidadeRequerida = sc.nextInt();
                    sc.nextLine();

                    Vendas[NumeroDeVendas] = new Venda(Produtos[i],quantidadeRequerida);
                    NumeroDeVendas++;
                    break;

                case "5":
                    for (i = 0; i < NumeroDeVendas; i++) {
                        System.out.println(Vendas[i]);
                    }
                    break;

                case "6":
                    Resposta = "sair";
                    break;
                default:
                    System.out.println("Resposta invalida!");
                    break;
            }

        }

    }
}
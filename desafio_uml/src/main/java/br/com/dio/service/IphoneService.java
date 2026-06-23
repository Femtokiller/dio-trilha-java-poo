package br.com.dio.service;

import br.com.dio.model.Iphone;

import java.util.Scanner;

public class IphoneService
{
    public static void musica(Iphone iphone)
    {
        Scanner scan = new Scanner(System.in);
        boolean voltarMenuPrincipal = false;

        while(!voltarMenuPrincipal)
        {
            System.out.println("Qual a opção desejada (somente o numero)");
            System.out.println("1 - Selecionar musica");
            System.out.println("2 - Tocar");
            System.out.println("3 - Pausar");
            System.out.println("4 - Voltar menu principal");
            int opcao = scan.nextInt();

            if(opcao == 1)
                iphone.selecionaMusica("Atirei o Pau no Gato");
            else if(opcao == 2)
                iphone.tocar();
            else if(opcao == 3)
                iphone.pausar();
            else if(opcao ==  4)
            {
                System.out.println("Voltando ao menu principal");
                voltarMenuPrincipal = true;
            } else
                System.out.println("Escolha uma opção válida!");

        }
    }

    public static void telefone(Iphone iphone)
    {
        Scanner scan = new Scanner(System.in);
        boolean voltarMenuPrincipal = false;

        while(!voltarMenuPrincipal)
        {
            System.out.println("Qual a opção desejada (somente o numero)");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Correio de voz");
            System.out.println("4 - Voltar menu principal");
            int opcao = scan.nextInt();

            if(opcao == 1)
                iphone.ligar("991234567");
            else if(opcao == 2)
                iphone.atender();
            else if(opcao == 3)
                iphone.iniciarCorreioVoz();
            else if(opcao ==  4)
            {
                System.out.println("Voltando ao menu principal");
                voltarMenuPrincipal = true;
            } else
                System.out.println("Escolha uma opção válida!");
        }
    }

    public static void internet(Iphone iphone)
    {
        Scanner scan = new Scanner(System.in);
        boolean voltarMenuPrincipal = false;

        while(!voltarMenuPrincipal)
        {
            System.out.println("Qual a opção desejada (somente o numero)");
            System.out.println("1 - Exibir pagina");
            System.out.println("2 - Adicionar nova aba");
            System.out.println("3 - Atualizar pagina");
            System.out.println("4 - Voltar menu principal");
            int opcao = scan.nextInt();

            if(opcao == 1)
                iphone.exibirPagina("http://www.google.com");
            else if(opcao == 2)
                iphone.adicionaNovaAba();
            else if(opcao == 3)
                iphone.atualizaPagina();
            else if(opcao ==  4)
            {
                System.out.println("Voltando ao menu principal");
                voltarMenuPrincipal = true;
            } else
                System.out.println("Escolha uma opção válida!");
        }
    }
}

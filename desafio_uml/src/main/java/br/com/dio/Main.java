package br.com.dio;

import br.com.dio.model.Iphone;
import br.com.dio.service.IphoneService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {

        Scanner scan = new Scanner(System.in);
        Boolean sairIphone = false;

        while (!sairIphone)
        {
            Iphone iphone = new Iphone("123", "Iphone 1");

            System.out.println("Bem vindo ao novo IPHONE!");
            System.out.println("Informe a opção desejada (somente o numero)");
            System.out.println("1 - Musica");
            System.out.println("2 - Telefone");
            System.out.println("3 - Internet");
            System.out.println("4 - Desligar");
            Integer opcao = scan.nextInt();

            if(opcao == 1)
                IphoneService.musica(iphone);
            else if(opcao == 2)
                IphoneService.telefone(iphone);
            else if(opcao == 3)
                IphoneService.internet(iphone);
            else if(opcao ==  4)
            {
                System.out.println("Desligando...");
                sairIphone = true;
            } else
                System.out.println("Escolha uma opção válida!");
        }
    }
}

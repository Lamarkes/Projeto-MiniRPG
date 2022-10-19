package Main;

import Exceptions.ValorAbaixoDeZero;
import Model.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ValorAbaixoDeZero {

        Scanner sc = new Scanner(System.in);

        ListaDeEquipamento lista = new ListaDeEquipamento(3);


        int vida = 0;
        double dinheiro = 0;
        System.out.println("Informe o nome do seu personagem: ");
        String nome = sc.nextLine();

        System.out.print("Informe sua raca: ");
        String raca = sc.nextLine();

        System.out.println("Informe seus equipamentos: [So pode carregar 3 itens]");
        System.out.print("Espada: ");
        String equipamento = sc.nextLine();
        System.out.print("Armadura: ");
        String armadura = sc.nextLine();
        System.out.print("Arco: ");
        String arco = sc.nextLine();

        lista.setListaDeEquipamento(0,equipamento);
        lista.setListaDeEquipamento(1,armadura);
        lista.setListaDeEquipamento(2,arco);


        try {
            System.out.println("Informe as Caracteristicas do seu Guerreiro:");
            System.out.print("Vida do Guerreiro: ");
            vida = sc.nextInt();

        } catch (InputMismatchException f){
            System.out.println("Informe apenas numeros!!");
        }

        try {
            System.out.print("Informe seu dinheiro: ");
            dinheiro = sc.nextDouble();
        }
        catch (Exception e){
            System.out.println("Informe valores inteiros");
        }
        Guerreiro guerreiro1 = new Guerreiro(vida,
                0,raca,9,dinheiro,10,5,lista,
                nome);
        Inimigo inimigo1 = new Inimigo(10,
                2,"Monstro",6,0,
                5,9,lista,"Monstro Terrestre");

        System.out.print("O dano do seu Guerreiro e de:");
        guerreiro1.calcularForca(guerreiro1.getForca(), guerreiro1.getDanoEquipamento());

        System.out.println("Um inimigo apareceu:" +inimigo1.getNome());
        System.out.println("Ele realizou o ataque...");
        inimigo1.calcularDano(inimigo1.getDanoEquipamento(), inimigo1.getForca(), guerreiro1.getVida());


    }
}

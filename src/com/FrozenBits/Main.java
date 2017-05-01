package com.FrozenBits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Declara��o dos players
    public static final int PLAYER1 = 1;
    public static final int PLAYER2 = 2;

    //Declara��o do scanner
    public static Scanner scan = new Scanner(System.in);

    //Declara��o do Rand
    public static Random random = new Random();

    //Declara��o do Mapa
    public static Map map;

    //Fun��o para dar mostrar o menu
    public static void displayMenu(){

        System.out.println("I - Instru��es");
        System.out.println("P - jogar contra outra pessoa");
        System.out.println("C - jogar contra Computador");
        System.out.println("S - Sair");

        char selection = 'S';
        boolean repeat;

        do {

            repeat = false;

            selection = scan.next().charAt(0);

            if (!(selection == 'I' || selection == 'i' || selection == 'P' || selection == 'p' || selection == 'C' || selection == 'c' || selection == 'S' || selection == 's')){
                System.out.printf("%c n�o � uma opera��o valida!\n", selection);
                repeat = true;
            }

        } while(repeat);

        switch (selection) {

            case 'I':
                displayInstrucoes();
                break;

            case 'i':
                displayInstrucoes();
                break;

            case 'P':

                playerVsPlayer();

                break;

            case 'p':

                playerVsPlayer();

                break;

            case 'C':

                break;

            case 'c':

                break;

            case 'S':
                System.exit(1);
                break;

            case 's':
                System.exit(1);
                break;

        }

    }

    /*
    * Fun��o de Player Vs Player
    * */

    public static void playerVsPlayer(){

        //Obtain random player
        boolean player1 = random.nextBoolean();

        //Initializing new map
        map = new Map();

        if (player1){
            System.out.println("Jogador 1 primeiro!");
            askFleet(PLAYER1);

            System.out.println("Jogador 2!");
            askFleet(PLAYER2);

        } else {
            System.out.println("Jogador 2 primeiro!");
            askFleet(PLAYER2);

            System.out.println("Jogador 1!");
            askFleet(PLAYER1);
        }

        map.drawMap(true);

    }

    /*
   * Fun��o para mostrar as instrucoes
   * */
    public static void displayInstrucoes(){

        System.out.println("Batalha naval � um jogo de tabuleiro de dois jogadores, no qual os jogadores t�m de adivinhar em que quadrados est�o os navios do oponente.Antes do in�cio do jogo, cada jogador coloca os seus navios nos quadros, alinhados horizontalmente ou verticalmente.\n" +
                "O n�mero de navios permitidos � igual para ambos jogadores e os navios n�o podem se sobrepor.\n" +
                "Ap�s os navios terem sido posicionados o jogo continua numa s�rie de turnos. Em cada turno, um jogador diz um quadrado, identificado pela letra e n�mero, na grelha do oponente, se houver um navio nesse quadrado, � colocada uma marca vermelha, sen�o houver � colocada uma marca branca. \n");

        pressAnykeyToContinue();

        displayMenu();
    }

    /*
    * Fun��o para pedir a frota inteira
    * */
    public static void askFleet(int owner){
/*
        for (int s = 0; s < 3; s++){
            System.out.printf("indique a posi��o para o %d submarino:\n", s + 1);
            map.addShip(askPos(),Ship.SINGLESHIP, Ship.PLAYER1);
        }
*/
        for (int s = 0; s < 2; s++){
            System.out.printf("indique a posi��o para o %d contratorpedeiro:\n", s + 1);
            map.addShip(askPos(), Options.TWOSHIP, owner, requestRotation());
        }
/*
        System.out.println("indique a posi��o para o navio de guerra:\n");
        map.addShip(new Ship(askPos(), Ship.tripleShip, owner, requestRotation()));

        System.out.println("indique a posi��o para o navio tanque:\n");
        map.addShip(new Ship(askPos(), Ship.quadrupleShip, owner, requestRotation()));

        System.out.println("indique a posi��o para o porta avi�es:\n");
        map.addShip(new Ship(askPos(), Ship.quintupleShip, owner, requestRotation()));
*/
    }

    /*
    * Fun��o para obter array de posi��es
    * */

    public static int[] askPos(){
        int[] pos = new int[2];
        boolean repeat;
        String position = null;
        do {

            repeat = false;

            char num;

            num = scan.next().charAt(0);

            if (!(num >= 65 && num <= 74)){
                repeat = true;
                System.out.println("Coordenada errada!");
            } else {
                pos[0] = num - 65;
                pos[1] = Integer.parseInt(String.valueOf(scan.next().charAt(0)));
            }

        } while (repeat);
        return pos;
    }

    /*
    * Fun��o para pedir rota��o
    * */

    public static char requestRotation(){
        boolean repeat;
        char rotation = '.';
        System.out.println("Especifique uma rota��o!");
        do {

            repeat = false;

            rotation = scan.next().charAt(0);

            if (!(rotation == 'N' || rotation == 'n' || rotation == 'E' || rotation == 'e' || rotation == 'O' || rotation == 'o' || rotation == 'S' || rotation == 's')){
                System.out.printf("%c n�o � uma opera��o valida!\n", rotation);
                repeat = true;
            }

        } while(repeat);
        return rotation;
    }

    /*
   * Fun��o para aguardar por key type
   * */
    public static void pressAnykeyToContinue(){
        System.out.println("Pressione qualquer tecla para continuar...");
        try{
            System.in.read();
        } catch (Exception e){}
    }

    public static void main(String[] args) {
        displayMenu();
    }
}

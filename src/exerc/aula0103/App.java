package exerc.aula0103;

import java.util.Random;
import java.util.Scanner;

public class App {

    static Scanner e = new Scanner (System.in);
    public static void main(String[] args) {

        Time sp = new Time("São Paulo");
        Time cor = new Time("Corinthians");
        Time pal = new Time("Palmeiras");
        Time juv = new Time("Juventus");

        Random rand = new Random();

        //1° partida
        int gV = rand.nextInt(20);
        int gC = rand.nextInt(20);
        Partida p1 = new Partida(sp, cor, gC, gV);

        //2° partida
        gV = rand.nextInt(20);
        gC = rand.nextInt(20);
        Partida p2 = new Partida(sp, pal, gC, gV);

        //3° partida
        gV = rand.nextInt(20);
        gC = rand.nextInt(20);
        Partida p3 = new Partida(sp, juv, gC, gV);

        //4° partida
        gV = rand.nextInt(20);
        gC = rand.nextInt(20);
        Partida p4 = new Partida(cor, pal, gC, gV);


        //5° partida
        gV = rand.nextInt(20);
        gC = rand.nextInt(20);
        Partida p5 = new Partida(cor, juv, gC, gV);


        //6° partida
        gV = rand.nextInt(20);
        gC = rand.nextInt(20);
        Partida p6 = new Partida(juv, pal, gC, gV);


        System.out.println(sp.getNome() + " " + sp.getPontos());
        System.out.println(cor.getNome() + " " + cor.getPontos());
        System.out.println(pal.getNome() + " " + pal.getPontos());
        System.out.println(juv.getNome() + " " + juv.getPontos());




    }
}

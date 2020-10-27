import java.util.Scanner;
import java.util.Random;
import java.security.SecureRandom;
import java.util.*;
import java.io.*;
class pokedex{

    public static void main(String[] args) throws IOException{

    Scanner entrada = new Scanner(System.in);

    int vida, fuerza, defensa, pokemoncansado, menu, id, numpok, repetir;
    double ataquepri, ataqueseg, ataqueter;
    String  nombre; 

        do{
        
            System.out.println("Este programa fue desarrollado por:");
            System.out.println("3IV8_Parra_Rivas_Arturo_Gabriel");
            System.out.println("Iniciando programa...");
            System.out.println("Elija el Pokemon que desea consultar o si desea hacer una batalla");
            System.out.println("1.- Charmander");
            System.out.println("2.- Bulbasur");
            System.out.println("3.- Squirtle");
            System.out.println("4.- BATALLA POKEMON");
            System.out.println("Seleccione el numero del pokemon que quiere consultar en la pokedex o si quiere realizar una batalla pokemon:");
            numpok = entrada.nextInt();
            if (numpok == 1){
                System.out.println("Haz elejido a Charmander!");
            }
            if (numpok == 2){
                System.out.println("Haz elejido a Bulbasur!");
            }
            if (numpok == 3){
                System.out.println("Haz elejido a Squirtle!");
            }
            if (numpok == 4){
                System.out.println("Haz decidido hacer una batalla pokemon!");
            }
            int fuerza1, defensa1;
            int fuerza2, defensa2;
            int fuerza3, defensa3;
            
            fuerza1 = 52;
            defensa1 = 43;
            fuerza2 = 49;
            defensa2 = 49;
            fuerza3 = 48;
            defensa3 = 65;
            
            switch (numpok) {
                case 1:
                System.out.println("Datos de tu pokemon: ");
                System.out.println("Nombre: Charmander ");
                System.out.println("ID: 004 ");
                System.out.println("Vida: 100 ");
                System.out.println("Ataque: 52");
                System.out.println("Defensa: 43 ");
                System.out.println("Ataque principal: Blaze");
                System.out.println("Ataque secundario: Solar Power");
                    break;
                case 2:
                
                System.out.println("Datos de tu pokemon: ");
                System.out.println("Nombre: Bulbasur ");
                System.out.println("ID: 001");
                System.out.println("Vida: 100 ");
                System.out.println("Ataque: 49");
                System.out.println("Defensa: 49 ");
                System.out.println("Ataque principal: Overgrow");
                System.out.println("Ataque secundario: Chlorophyll");
                    break;
                case 3:
                
                System.out.println("Datos de tu pokemon: ");
                System.out.println("Nombre: Squirtle");
                System.out.println("ID: 007 ");
                System.out.println("Vida: 100 ");
                System.out.println("Ataque: 48");
                System.out.println("Defensa: 65 ");
                System.out.println("Ataque principal: Torrent");
                System.out.println("Ataque secundario: Rain Dish");
                    break;
                case 4:
                ataquepri = 0;
                ataqueseg = 0;
                ataqueter = 0;
                System.out.println("Batalla pokemon: ");
                int numpok1 = (int)(Math.random()*3+1);
                System.out.println("El primer pokemon seleccionado para luchar es " +numpok1);
                int numpok2 = (int)(Math.random()*3+1);
                System.out.println("El segundo pokemon seleccionado para luchar es " +numpok2);
                if (numpok1 == 1 || numpok2 == 1){
                    ataquepri = fuerza1*defensa1/3;
                    System.out.println("La fuerza total de chamander es: " +ataquepri);
                }
                if (numpok1 == 2 || numpok2 == 2){
                    ataqueseg = fuerza2*defensa2/3;
                    System.out.println("La fuerza total de Bulbasur es: " +ataqueseg);
                }
                if (numpok1 == 3 || numpok2 == 3){
                    ataqueter = fuerza3*defensa3/3;
                    System.out.println("La fuerza total de Squirtle es: " +ataqueter);
                }
                if (numpok1 == numpok2){
                    System.out.println("Ambos luchadores son los mismos pokemones ambos terminan cansados: EMPATE");
                }else{
                    if (ataquepri > ataqueseg && ataqueter == 0){
                        System.out.println("BULBASUR ESTA CANSADO, VICTORIA PARA CHARMANDER");
                    }
                    if (ataqueseg > ataquepri && ataqueter == 0){
                        System.out.println("CHARMANDER ESTA CANSADO, VICTORIA PARA BULBASUR");
                    }
                    if (ataqueter > ataqueseg && ataquepri == 0){
                        System.out.println("BULBASUR ESTA CANSADO, VICTORIA PARA SQUIRTLE");
                    }
                    if (ataqueseg > ataqueter && ataquepri == 0){
                        System.out.println("SQUIRTLE ESTA CANSADO, VICTORIA PARA BULBASUR");
                    }
                    if (ataquepri > ataqueter && ataqueseg == 0){
                        System.out.println("SQUIRTLE ESTA CANSADO, VICTORIA PARA CHARMANDER");
                    }
                    if (ataqueter > ataquepri && ataqueseg == 0){
                        System.out.println("CHARMANDER ESTA CANSADO, VICTORIA PARA SQUIRTLE");
                    }
                    }   
                

                    break;
                default:
                    System.out.println("El pokemon que deseas consultar no se encuentra registrado :(");
                    break;
            }
            System.out.println("Si desea volver al menu de la pokedex escriba 0");
            System.out.println("Si desea dejar de ejecutar la aplicacion escriba 1");
            menu = entrada.nextInt();
        }while(menu == 0);
    }
}
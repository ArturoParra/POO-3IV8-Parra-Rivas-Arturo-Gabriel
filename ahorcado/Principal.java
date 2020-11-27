import java.util.Scanner;

public class Principal extends Ahorcado{
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int opcion, menu;
        menu=1;
        Ahorcado ahorcadinsito = new Ahorcado();
        
        System.out.println("Este programa fue disenado por Parra Rivas Arturo Gabriel del grupo 3IV8");
        System.out.println("Si desea jugar <<ahorcado>> pulse uno, para salir pulse 2");
        opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                ahorcadinsito.ahorcadin();
            break;
            case 2:
                System.out.println("Bye Bye");
            break;
            
            default:
                System.out.println("Opcion no disponible :((");
                break;
        }
    }
}
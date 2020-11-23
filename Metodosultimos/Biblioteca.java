import java.util.Scanner;
public class Biblioteca{
    int opcion, otro,idsacar, menu=1;
    String ejemplaresp;
    Scanner entrada=new Scanner(System.in);
    Scanner entrada2=new Scanner(System.in);
    Scanner entrada3=new Scanner(System.in);
    String matrizBb[][] = new String[3][4];
    public void menu(){
        do{
        System.out.println("Que accion desea realizar?");
        System.out.println("1.- Guardar un libro");
        System.out.println("2.- Sacar un libro");
        opcion=entrada.nextInt();
        switch (opcion) {
            case 1:
                guardar();
                break;
            case 2:
                sacar();
                break;
        
            default:
            System.out.println("Accion no disponible :(");
                break;
        }
        System.out.println("Si desea realizar otra accion con un libro diferente pulse <0>");
        System.out.println("Para salir pulse <1> ");
        menu=entrada.nextInt();
    }while (menu == 0);
    }
    public void guardar(){
        for(int i=0; i<3; i++){
            for(int j=0; j<1; j++){
                System.out.print ("Inserte el titulo del libro: ");
                matrizBb[i][0]=entrada2.nextLine();
                System.out.print("Inserte el nombre del autor del libro: ");
                matrizBb[i][1]=entrada2.nextLine();
                System.out.print("Inserte la cantidad de ejemplares: ");
                matrizBb[i][2]=entrada2.nextLine();
                
            }
            System.out.println("Para salir pulse <0>, para ingresar otros datos pulse cualquier otro numero: ");
            otro=entrada.nextInt();
            if( otro == 0 ){
                break;
            }

        }
    }
    public void sacar(){      
        //VER GUAR
        
        for(int k=0; k<3; k++){
            for(int h=0; h<1; h++){
                System.out.println(k+".- "+"Titulo del libro: "+ matrizBb[k][0]);
                System.out.println(k+".- "+"Autor del libro: "+ matrizBb[k][1]);
                System.out.println(k+".- "+"Cantidad de ejemplares en existencia en la bilbioteca: "+ matrizBb[k][2]);
                System.out.println(k+".- "+"Cantidad de libros prestados: "+ matrizBb[k][3]);
                System.out.println(" ");
                
            }
        }
        System.out.println("Inserte el ID del libro que desea sacar: ");
        idsacar=entrada2.nextInt();
        System.out.println("Inserte la cantidad de ejemplares prestados: ");
        ejemplaresp=entrada3.nextLine();
        if(Integer.parseInt(matrizBb[idsacar][2])>Integer.parseInt(ejemplaresp)){
        matrizBb[idsacar][3]=ejemplaresp;
        matrizBb[idsacar][2]=String.valueOf (Integer.parseInt(matrizBb[idsacar][2])-Integer.parseInt(ejemplaresp));
        
            //fin VER 
        for(int k=0; k<3; k++){
            for(int h=0; h<1; h++){
                System.out.println(k+".- "+"Titulo del libro: "+ matrizBb[k][0]);
                System.out.println(k+".- "+"Autor del libro: "+ matrizBb[k][1]);
                System.out.println(k+".- "+"Cantidad de ejemplares en existencia en la bilbioteca: "+ matrizBb[k][2]);
                System.out.println(k+".- "+"Cantidad de libros prestados: "+ matrizBb[k][3]);
                System.out.println(" ");
    
                    
            }
        }
    }else{
        System.out.println("No podemos prestar esa cantidad :(");
    }
    }
}
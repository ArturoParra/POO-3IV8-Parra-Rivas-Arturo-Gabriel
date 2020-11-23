import java.util.Scanner;
public class Menuempleado{
   public void menuempleado(){ 
    Scanner entrada=new Scanner(System.in);
        char repetir;
        int opcion, menu;
        repetir=0;
        menu=1;
        opcion=0;
        Datossupervisor datos = new Datossupervisor();
        Oficinista datosofi = new Oficinista();
        do{
            System.out.println("Este programa fue creado por: Parra_Rivas_Arturo_Gabriel_3IV8");
            System.out.println("Que cargo tiene en la empresa?");
            System.out.println("1.- Oficinista");
            System.out.println("2.- Supervisor");
            opcion=entrada.nextInt();
        
            switch(opcion){
                case 1:
                    do{
                        datosofi.datosoficinista();
                        System.out.println("Si desea repetir el programa escriba <<s>> ");
                        repetir = entrada.next().charAt(0);  
                    }while (repetir=='s' || repetir=='S');
                    break;
                case 2:
                    do{
                        datos.datossupervisor();
                        System.out.println("Si desea repetir el programa escriba <<s>>, para salir pulse cualquier otra letra ");
                        repetir = entrada.next().charAt(0);  
                    }while (repetir=='s' || repetir=='S');
                    break;
                default:
                    System.out.println("Cargo no disponible :(");
                    break;
                } //switch
                System.out.println("Escriba 0 para regresar al menu");
                System.out.println("Escriba 2 para salir del programa");
                menu = entrada.nextInt();  
       }while (menu == 0);
       
    }  //do
}
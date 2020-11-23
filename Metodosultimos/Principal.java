import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
    char repetir;
    int opcion, menu;
    repetir=0;
    menu=1;

        //Empleado trabajador = new Empleado();
        Menuempleado menuemp = new Menuempleado();
        Ejercicio5 proveedor = new Ejercicio5();
        Bibliotecaprincipal bibliotecario = new Bibliotecaprincipal();
    
    do{
        System.out.println("Este programa fue creado por: Parra_Rivas_Arturo_Gabriel_3IV8");
        System.out.println("Que programa desea ejecutar?");
        System.out.println("1.- Calculadora de sueldo");
        System.out.println("2.- Proveedores");
        System.out.println("3.- Registro de biblioteca");
        opcion=entrada.nextInt();
    
        switch(opcion){
            case 1:
                do{
                    menuemp.menuempleado();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;
            case 2:
                do{
                    proveedor.eje5();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;
            case 3:
                do{
                    bibliotecario.libros();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;    
            default:
                System.out.println("Programa no disponible :(");
                break;
            } //switch
            System.out.println("Escriba 0 para regresar al menu");
            System.out.println("Escriba 2 para salir de la aplicacion");
            menu = entrada.nextInt();  
   }while (menu == 0);
    //do
    }
}
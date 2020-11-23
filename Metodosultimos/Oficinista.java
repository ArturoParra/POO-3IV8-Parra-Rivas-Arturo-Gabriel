import java.util.Scanner;
public class Oficinista{
    int idempleado, horasextraD, horasextraN, pagoextraD, pagoextraN;
    String[] numeros=new String [2];
    private float sueldooficinista=5000;
    
    public void datosoficinista(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte su nombre: ");
        numeros[0]=entrada.nextLine();
        numeros[1]="Oficinista";
        System.out.println("Inserta el ID: ");
        idempleado=entrada.nextInt();
        System.out.println(" ");
        System.out.println("Su ID de empleado es: "+idempleado);
        System.out.println("Su nombre es: "+numeros [0]);
        System.out.println("El cargo es: "+numeros [1]);
        System.out.println("Su sueldo quincenal es: "+sueldooficinista);
        
        sueldooficinista();
    }
    public void sueldooficinista(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas extra diurnas trabajadas: ");
        horasextraD=entrada.nextInt();
        if(horasextraD<=8){
            System.out.println("Ingrese la cantidad de horas extra nocturnas trabajadas: ");
            horasextraN=entrada.nextInt();
            if(horasextraN<=8){
                pagoextraD=horasextraD*50;
                pagoextraN=horasextraN*60;
                System.out.println("Recibiras un pago por tus horas extra diurnas de: "+pagoextraD+" MXN");
                System.out.println("Recibiras un pago por tus horas extra nocturnas de: "+pagoextraN+" MXN");
                sueldooficinista=sueldooficinista+pagoextraD+pagoextraN;
                System.out.println("Siendo su sueldo quincenal un total de:"+sueldooficinista+" MXN");
            }else{
                System.out.println("No puedes trabajar tanto, maquina");
            }
        }else{
            System.out.println("No puedes trabajar tanto, maquina");
        }
    }
}
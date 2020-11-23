import java.util.Scanner;
public class Datossupervisor{
    int idempleado;
    String[] numeros=new String [2];
    private double sueldosuper=8000;
    private double isr;
    private double infonavit;
    private double segurogm;
    
    public void datossupervisor(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte su nombre: ");
        numeros[0]=entrada.nextLine();
        numeros[1]="Supervisor";
        System.out.println("Inserta el ID: ");
        idempleado=entrada.nextInt();
        System.out.println(" ");
        System.out.println("Su ID de empleado es: "+idempleado);
        System.out.println("Su nombre es: "+numeros [0]);
        System.out.println("El cargo es: "+numeros [1]);
        System.out.println("Su sueldo quincenal es: "+sueldosuper);
        
        sueldosupervisor();
    }
    public void sueldosupervisor(){
        isr=sueldosuper*0.16;
        infonavit=sueldosuper*0.2;
        segurogm=sueldosuper*0.1;
        sueldosuper=sueldosuper-segurogm-infonavit-isr;
        System.out.println("Su sueldo quincenal es de: "+sueldosuper+" MXN");
    }
}
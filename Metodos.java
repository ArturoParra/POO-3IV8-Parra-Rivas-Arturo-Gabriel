import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Metodos{
    public void calculadoraedad(){
        Scanner entrada=new Scanner (System.in);
        int anyo, edadresultante, anyoactual;
        anyoactual=2020;
        edadresultante=0;
        System.out.println("Ingrese el anyo de su nacimiento:");
        anyo=entrada.nextInt();
        if(anyo>1920){
            if(anyo<2021){
            edadresultante=anyoactual-anyo;
            System.out.println("Tienes " +edadresultante+" anyos de edad");
            }
            if(edadresultante==0){
                System.out.println("Que bebe mas bonito UwU");
            }
        }else{
            System.out.println("No pudiste haber nacido ese anyo crack :))");
        }
    }
        public void AyPcirculo(){
            Scanner entrada=new Scanner (System.in);
            double radio, perimetrocir, areacir;
            radio=0;
            perimetrocir=0;
            areacir=0;
            System.out.println("Ingrese el radio del circulo:");
            radio = entrada.nextDouble();
            if(radio>0){
                perimetrocir=2*3.1416*radio;
                System.out.println("El perimetro del circulo es: "+perimetrocir);
            }else{
                System.out.println("No se permiten valores negativos para calcular el perimetro");
            }
            if(radio>0){
                areacir=3.1416*radio*radio;
                System.out.println("El perimetro del circulo es: "+areacir);
            }else{
                System.out.println("No se permiten valores negativos para calcular el area");
            }
        }
        public void AyPrectangulo(){
            Scanner entrada=new Scanner (System.in);
            double ladoa, ladob, arearec, perimetrorec;
            ladoa=0;
            ladob=0;
            arearec=0;
            perimetrorec=0;
            System.out.println("Ingrese la medida del lado <<A>>:");
            ladoa = entrada.nextDouble();
            System.out.println("Ingrese la medida del lado <<B>>:");
            ladob = entrada.nextDouble();
            if(ladoa>0){
                if(ladob>0){
                    perimetrorec=2*ladoa+2*ladob;
                    System.out.println("El perimetro del rectangulo es: "+perimetrorec);
                }
            }else{
                System.out.println("No se permiten valores negativos para calcular el perimetro");
            }
            if(ladoa>0){
                if(ladob>0){
                    perimetrorec=ladoa*ladob;
                    System.out.println("El area del rectangulo es: "+arearec);
                }
            }else{
                System.out.println("No se permiten valores negativos para calcular el area");
            }
        }
        public void AyPcuadrado(){
            Scanner entrada=new Scanner (System.in);
            double lado, areacua, perimetrocua;
            lado=0;
            areacua=0;
            perimetrocua=0;
            System.out.println("Ingrese la medida del lado :");
            lado = entrada.nextDouble();
            if(lado>0){
                perimetrocua=4*lado;
                System.out.println("El perimetro del cuadrado es: "+perimetrocua);
            }else{
                System.out.println("No se permiten valores negativos para calcular el perimetro");
            }
            if(lado>0){
                areacua=lado*lado;
                System.out.println("El area del cuadrado es: "+areacua);
            }else{
                System.out.println("No se permiten valores negativos para calcular el area");
            }
        }
        public void AyPtriangulo(){
            Scanner entrada=new Scanner (System.in);
            double catetoa,catetob,catetoc,altura,base,areatri,perimetrotri;
            catetoa=0;
            catetob=0;
            catetoc=0;
            altura=0;
            base=0;
            areatri=0;
            perimetrotri=0;
            System.out.println("Ingrese la medida del cateto <<A>> :");
            catetoa = entrada.nextDouble();
            System.out.println("Ingrese la medida del cateto <<B>> :");
            catetob = entrada.nextDouble();
            System.out.println("Ingrese la medida del cateto <<C>> :");
            catetoc = entrada.nextDouble();
            if(catetoa>0 && catetob>0 && catetoc>0){
                perimetrotri=catetoa+catetob+catetoc;
                System.out.println("El perimetro del triangulo es: "+perimetrotri);
            }else{
                System.out.println("No se permiten valores negativos para calcular el perimetro");
            }
            if(catetoa>0 && catetob>0 && catetoc>0){
                areatri=base*altura;
                System.out.println("El area del triangulo es: "+areatri);
            }else{
                System.out.println("No se permiten valores negativos para calcular el area");
            }
        }

    public void calculadoraareas(){
        Scanner entrada=new Scanner (System.in);
        Metodos areayperimetrocir = new Metodos();
        Metodos areayperimetrorec = new Metodos();
        Metodos areayperimetrocua = new Metodos();
        Metodos areayperimetrotri = new Metodos();

        int operacion,interfaz;
        char rebobinar;
        operacion=0;
        interfaz=1;
        rebobinar=0;
        do{
            System.out.println("Que operacion desea realizar?");
            System.out.println("1.- Area y perimetro de un circulo");
            System.out.println("2.- Area y perimetro de un rectangulo");
            System.out.println("3.- Area y perimetro de un cuadrado");
            System.out.println("4.- Area y perimetro de un triangulo");
            operacion=entrada.nextInt();
            
            switch(operacion){
                case 1:
                do{
                    areayperimetrocir.AyPcirculo();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    rebobinar = entrada.next().charAt(0);  
                }while (rebobinar=='s' || rebobinar=='S');
                break;
                case 2:
                do{
                    areayperimetrorec.AyPrectangulo();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    rebobinar = entrada.next().charAt(0);  
                }while (rebobinar=='s' || rebobinar=='S');
                break;
                case 3:
                do{  
                    areayperimetrocua.AyPcuadrado();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    rebobinar = entrada.next().charAt(0);  
                }while (rebobinar=='s' || rebobinar=='S');
                break;
                case 4:
                do{  
                    areayperimetrotri.AyPtriangulo();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    rebobinar = entrada.next().charAt(0);  
                }while (rebobinar=='s' || rebobinar=='S');
                break;   
            }        
        }while (interfaz==0);
    }
    public void llamadas(){
        Scanner entrada=new Scanner (System.in);
        String numcelular;
        int minutosnac,minutosinter,minutoscelu;
        double llamadanac,llamadainter,llamadacelu,credito,costototal,costonac,costointer,costocelu;
        llamadanac=0.5;
        llamadainter=0.6;
        llamadacelu=0.2;
        minutosnac=0;
        minutosinter=0;
        minutoscelu=0;
        credito=0;
        costototal=0;
        costonac=0;
        costointer=0;
        costocelu=0;
        System.out.println("Ingrese su numero telefonico: ");
        numcelular=entrada.nextLine();
        System.out.println("Ingrese credito: ");
        credito=entrada.nextDouble();
        System.out.println("Ingrese la cantidad de minutos consumidos en llamadas nacionales: ");
        minutosnac=entrada.nextInt();
        System.out.println("Ingrese la cantidad de minutos consumidos en llamadas internacionales: ");
        minutosinter=entrada.nextInt();
        System.out.println("Ingrese la cantidad de minutos consumidos en llamadas celulares: ");
        minutoscelu=entrada.nextInt();
        System.out.println(" ");
        System.out.println("Facturacion de las llamadas del numero telefonico "+numcelular);
        costonac=minutosnac*llamadanac;
        costointer=minutosinter*llamadainter;
        costocelu=minutoscelu*llamadacelu;
        costototal=costonac+costointer+costocelu;
        System.out.println("Relacion de su factura: ");
        System.out.println("La cantidad de minutos consumidos en llamadas nacionales fueron: "+minutosnac+", el costo total fue de: "+costonac);
        System.out.println("La cantidad de minutos consumidos en llamadas internacionales fueron: "+minutosinter+", el costo total fue de: "+costointer);
        System.out.println("La cantidad de minutos consumidos en llamadas celulares fueron: "+minutoscelu+", el costo total fue de: "+costocelu);
        System.out.println("El costo total de su factura es: "+costototal);
        credito=credito-costototal;
        System.out.println("El saldo de su credito es: "+credito);
        if(credito<0){
            credito=credito*-1;
            System.out.println("Usted ha excedido el monto del credito ingresado su deuda es de: "+credito );
        }
    }

    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        char repetir;
        int opcion, menu;
        repetir=0;
        menu=1;
        do{
        
            Metodos edades = new Metodos();
            Metodos areasyperimetros = new Metodos();
            Metodos llamada = new Metodos();
            

        System.out.println("Que programa desea ejecutar?");
        System.out.println("1.- Calculadora de edad");
        System.out.println("2.- Calculadora de areas");
        System.out.println("3.- Costo de llamadas telefonicas");
        opcion=entrada.nextInt();
    
        switch(opcion){
            case 1:
                do{
                      edades.calculadoraedad();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;
            case 2:
                do{
                      areasyperimetros.calculadoraareas();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;
            case 3:
                do{
                    llamada.llamadas();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);  
                }while (repetir=='s' || repetir=='S');
                break;    
            default:
                System.out.println("Programa no disponible :(");
                break;
            }
            System.out.println("Escriba 0 para regresar al menu");
            System.out.println("Escriba 2 para salir de la aplicacion");
            menu = entrada.nextInt();  
        }while (menu == 0);
    }
}
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class arreglos{
        public void promedios(){
            Scanner entrada=new Scanner(System.in);
            float promedioP, promedioN,sumaP,sumaN,cantidadN,cantidadP;
        sumaP=0;
        sumaN=0;
        cantidadN=0;
        cantidadP=0;
        int[] numeros=new int [10];
        for( int i=0; i<=9; i++){
            System.out.println("ingrese el numero[" +i+"] ");
            numeros[i]=entrada.nextInt();

        }//for que lee el arreglo
        for( int i=0; i<=9; i++){
            if( numeros[i]>=0){
                sumaP=sumaP+numeros[i];
                cantidadP=cantidadP+1;
            } else {
                sumaN=sumaN+numeros[i];
                cantidadN=cantidadN+1;
            }
            
            
        }//el for de los promedios
        promedioP=sumaP/cantidadP;
        promedioN=sumaN/cantidadN;
        System.out.println("El promedio de los negativos es: "+promedioN);
        System.out.println("El promedio de los positivos es: "+promedioP);
        return;
    }//metodo promedios

    public void promediospares(){
        Scanner entrada=new Scanner(System.in);
        float promedioPares,sumaPares,cantidadPares;
    sumaPares=0;
    cantidadPares=0;
    int[] numeros=new int [10];
    for( int i=0; i<=9; i++){
        System.out.println("ingrese el numero[" +i+"] ");
        numeros[i]=entrada.nextInt();

    }//for que lee el arreglo
    for( int i=0; i<=9; i++){
        if(i%2==0){
            sumaPares=sumaPares+numeros[i];
            cantidadPares=cantidadPares+1;
        }
        
    }//el for de los promedios pares
    promedioPares=sumaPares/cantidadPares;
    System.out.println("El promedio de los numeros en las posiciones pares del arreglo es: "+promedioPares);
    return;
}//metodo promedios pares

public void calificaciones(){
    Scanner entrada=new Scanner(System.in);
    float promediofinal,sumaf,calmayor,calmenor,cantidadrepro,cantidadapro,cantidadsuppro;
    promediofinal=0;
    sumaf=0;
    calmayor=0;
    calmenor=10;
    cantidadrepro=0;
    cantidadapro=0;
    cantidadsuppro=0;
int[] numeros=new int [10];
for( int i=0; i<=9; i++){
    System.out.println("ingrese su calificacion[" +i+"] ");
    numeros[i]=entrada.nextInt();
if(numeros[i]<0){
    System.out.println("La calificacion no puede ser menor que cero, se le asignara 0 a su calificacion"); 
    numeros[i]=0;
}
if(numeros[i]>10){
    System.out.println("La calificacion no puede ser mayor que 10, se le asignara 10 a su calificacion"); 
    numeros[i]=10;
}
}//for que lee el arreglo
for( int i=0; i<=9; i++){
    sumaf=sumaf+numeros[i];
    if (numeros[i]>calmayor){
        calmayor=numeros[i];
    }
    if (numeros[i]<calmenor){
        calmenor=numeros[i];
    }
    if (numeros[i]>=6){
        cantidadapro=cantidadapro+1;
    }else{
        cantidadrepro=cantidadrepro+1;
    }
}//el for de suma, mayor, menor
promediofinal=sumaf/10;
System.out.println("Detalles de las calificaciones:");
for( int i=0; i<=9; i++){
    if (numeros[i]>promediofinal){
        cantidadsuppro=cantidadsuppro+1;
    }
    System.out.println("Calificacion["+i+"]: "+numeros[i] );
}
System.out.println("El promedio de final es: "+promediofinal);
System.out.println("La calificacion mayor es: "+calmayor);
System.out.println("La calificacion menor es: "+calmenor);
System.out.println("La cantidad de materias aprobadas es: "+cantidadapro);
System.out.println("La cantidad de materias reprobadas es: "+cantidadrepro);
System.out.println("La cantidad de calificaciones mayores que el promedio son: "+cantidadsuppro);
return;
}//metodo calificaciones

public void sumamatrices(){
    Scanner entrada=new Scanner(System.in);
 
int[] [] matriz1=new int [3] [3];
int[] [] matriz2=new int [3] [3];
int[] [] matrizf=new int [3] [3];
for( int i=0; i<=1; i++){
    if(i==0){
    System.out.println("ingrese su primera matriz");
    }else{
        System.out.println("ingrese su segunda matriz");
    }
    
    for( int j=0; j<=2; j++){
        for( int k=0; k<=2; k++){
            if(i==0){
                System.out.println("posicion ["+j+"]["+k+"]");
                matriz1[j][k]=entrada.nextInt();
            }else{
                System.out.println("posicion ["+j+"]["+k+"]");
                matriz2[j][k]=entrada.nextInt();
            }
        }
    }
}
for( int i=0; i<=1; i++){
        if(i==0){
        System.out.println("valores de su primera matriz");
        }else{
            System.out.println("valores de su segunda matriz");
        }
        
        for( int j=0; j<=2; j++){
            for( int k=0; k<=2; k++){
                if(i==0){
                    System.out.print(matriz1 [j][k]+ " ");
                }else{
                    System.out.print(matriz2 [j][k]+ " ");
                }//esto es el if
            }//for para k
            System.out.println(" ");
        }//for para j
    }//for para i
        System.out.println("El resultado de la suma de las dos matrices ingresadas es: ");
        for( int j=0; j<=2; j++){
            for( int k=0; k<=2; k++){
                matrizf[j][k]=matriz1[j][k]+matriz2[j][k];
                System.out.print(matrizf[j][k]+ " ");
            }
            System.out.println(" ");
        }


return;
}//metodo matrices
    
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        char repetir;
        int opcion, menu;
        do{
        arreglos promediospyn = new arreglos();
        arreglos promediospar = new arreglos();
        arreglos calificacionesf = new arreglos();
        arreglos matrices = new arreglos();
        System.out.println("Que programa desea ejecutar?");
        System.out.println("1.- Promedios de numeros positivos y negativos");
        System.out.println("2.- Promedios de las posiciones pares del arreglo");
        System.out.println("3.- Promedio de calificaciones");
        System.out.println("4.- Sumatoria de matrices de 3x3");
        opcion=entrada.nextInt();
    
        switch(opcion){
            case 1:
                do{
                    promediospyn.promedios();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);    
                }while (repetir=='s' || repetir=='S');
                break;
            case 2:
                do{
                    promediospar.promediospares();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);    
                }while (repetir=='s' || repetir=='S');
                break;
            case 3:
                do{
                    calificacionesf.calificaciones();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);    
                }while (repetir=='s' || repetir=='S');
                break;
            case 4:
                do{
                    matrices.sumamatrices();
                    System.out.println("Si desea repetir el programa escriba <<s>> ");
                    repetir = entrada.next().charAt(0);    
                }while (repetir=='s' || repetir=='S');
                break;
                default:
                    System.out.println("Programa no disponible :(");
                    break;  
            }//llave del Switch
            System.out.println("Escriba 0 para regresar al menu");
                System.out.println("Escriba 2 para salir de la aplicacion");
                menu = entrada.nextInt();
        }while (menu == 0);
    }
}
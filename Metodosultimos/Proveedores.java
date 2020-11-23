import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Proveedores{
    String nombrecliente;
    String productos[] = {"Lapiz", "Pluma", "Computadora", "Impresora", "Telefono", "Hojas", "Botella", "Caja", "Audifonos", "Cargador"};
    int suma=0;
    int menor=0;
    int mayor=0;
    float promedio=0;
    String productomayor, productomenor;
    int precios[] = {3, 5, 8000, 2000, 4000, 100, 20, 6, 700, 40};
    int existencias[] = {1000, 500, 10, 30, 100, 2000, 500, 400, 200, 300};
    Scanner entrada=new Scanner(System.in);
    public void pedirdatos(){
        System.out.println("Inserte su nombre: ");
        nombrecliente=entrada.nextLine();
        System.out.println("Estos son los productos disponibles");
        System.out.println("");
        for(int i=0; i<10; i++){
            System.out.println("-"+productos[i]+ " tiene un precio de: "+ precios[i]+ " MXN, y hay "+existencias[i]+" existencias.");
            System.out.println("");
            suma=suma+precios[i]*existencias[i];
            if(i==0){
                menor=precios[i];
                mayor=precios[i];
                productomayor=productos[i];
                productomenor=productos[i];
            }else{
                if(precios[i]>mayor){
                    mayor=precios[i];
                    productomayor=productos[i];
                }
                if(precios[i]<menor){
                    menor=precios[i];
                    productomenor=productos[i];
                }
            }
        }
    }
    public void sumatotal(){
        System.out.println("Resumen del pedido:");
        System.out.println("Su nombre es: "+nombrecliente);
        System.out.println("La sumatoria total de los costos de todas las existencias es: "+suma+ " MXN");
        System.out.println("El producto con el costo mas bajo es: "+productomenor+" que tiene un precio de: "+ menor+" MXN");
        System.out.println("El producto con el costo mas alto es: "+productomayor+" que tiene un precio de: "+ mayor+" MXN");
        promedio=suma/10;
        System.out.println("El promedio del costo total es: "+promedio+" MXN");
    }
}
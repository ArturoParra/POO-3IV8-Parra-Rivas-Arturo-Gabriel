import java.util.Scanner;
import java.util.*;
import java.io.*;
class sesion4{

    public static void main(String[] args) throws IOException{
        
        Scanner entrada = new Scanner(System.in);

        int   padres, repetir, menu, opcion, edad, numero, numeroinicial;
        char  unidadmed, tempconvertida;
        double temperatura, area, perimetro, volumen, resultado, monto, num1, num2, num3, base, altura, segmentoa, segmentob, segmentoc, radio;

        do{
            
            System.out.println("Este programa fue desarrollado por:");
            System.out.println("3IV8_Parra_Rivas_Arturo_Gabriel");
            System.out.println("Iniciando programa...");
            System.out.println("Elija la opcion que desee utilizar");
            System.out.println("1.- Aplicar descuento");
            System.out.println("2.- Convertir decimales a binarios");
            System.out.println("3.- Conversion de temperaturas");
            System.out.println("4.- Identificador de numeros positivos y negativos");
            System.out.println("5.- Precios de compras");
            System.out.println("6.- Calculadora de area y perimetro");
            System.out.println("7.- Tabla de numeros");
            System.out.println("8.- Factorial");
            System.out.println("9.- Asteriscos");
            System.out.println("10.- Asteriscos en forma de cuadrado");
            System.out.println("11.- Asteriscos en patron");
            System.out.println("12.- Diamante en asteriscos");
            System.out.println("13.- Calculadora");
            System.out.println("14.- Terminar");
            System.out.println("Seleccione su opcion: ");
            opcion = entrada.nextInt();
            System.out.println("Usted eligio la opcion: "+opcion);

            switch(opcion) {
                case 1:

                    do{
                        System.out.println("Por favor, escriba su edad.");
                    edad = entrada.nextInt();
                    if(edad > 65){
                        System.out.println("Su descuento es del 40 %. Gracias por solicitar nuestros servicios :).");
                    }
                    if(edad < 21){
                        System.out.println("Sus padres son socios de este local?; Escriba 1 para afirmar que sus padres sean socios o en su defecto 0 para negar que sus padres sean socios.");
                            padres = entrada.nextInt();
                            System.out.println("la variable padres es: "+padres);
                            if(padres == 1){
                                System.out.println("Su descuento es de 45 %. Gracias por solicitar nuestros servicios :).");
                            }   
                            if(padres == 0){
                                    System.out.println("Su descuento es de 25 %. Gracias por solicitar nuestros servicios :).");
                            }
                    }
                    if(edad >= 21 & edad <= 65)
                    {
                        System.out.println("Gracias por solicitar nuestros servicios :).");
                    } //si edad >=21 <= 65
    
                    System.out.println("escriba `1` si desea repetir el programa.");
                    System.out.println("Si desea salir de esta opcion, escriba 0.");
                    repetir = entrada.nextInt();
                    }while(repetir ==  1); //case1
                    break;
                    case 2:
                    do{
                        System.out.println("Ingrese un numero: ");
                        numero = entrada.nextInt();
                        String binario = "";
                        numeroinicial = numero;
                        if (numero > 0){

                            while (numero > 0){
                                if (numero % 2 == 0){
                                    binario = "0" + binario;
                                }
                                else{
                                    binario = "1" + binario;
                                }
            
                                numero = (int) numero/2;
                            }
                            }
                            else if(numero == 0){
                                binario = "0";
                            }
                            else{
                                binario = "Solo admito numeros positivos";
                            }
                            System.out.println("El numero " +numeroinicial + " en sistema binario es igual a: " + binario);            
                        System.out.println("escriba `2` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  2); //case2
                    break;
                    case 3:
                    do{
                        double temperaturainicial;
                        System.out.println("Ingrese la temperatura: ");
                        temperatura = entrada.nextDouble();
                        temperaturainicial = temperatura;
                        System.out.println("Ingrese la unidad de medida de su temperatura(C=celcius, F=Farenheit, K=Kelvin, R=Rankine): ");
                        unidadmed = entrada.next().charAt(0);
                        System.out.println("Ingrese la unidad a la que se quiere convertir: ");
                        tempconvertida = entrada.next().charAt(0);
                        if (tempconvertida == unidadmed){
                            System.out.println("El resutado es el mismo " +temperatura + " grados celcius ingrese unidades de medida diferentes para que se realice una conversion");}
                            else{
                                if(unidadmed == 'C'){
                                    if(tempconvertida == 'F'){
                                        temperatura = temperatura+33.8;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == F
                                    if(tempconvertida == 'K'){
                                        temperatura = temperatura+273.15;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == K
                                    if(tempconvertida == 'R'){
                                        temperatura = temperatura+493.5;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == R
                                }//unidadmed == C
                                if(unidadmed == 'F'){
                                    if(tempconvertida == 'C'){
                                        temperatura = temperatura-17.7;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == C
                                    if(tempconvertida == 'K'){
                                        temperatura = temperatura+255.9;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == K
                                    if(tempconvertida == 'R'){
                                        temperatura = temperatura+460.7;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == R
                                }//unidadmed == F
                                if(unidadmed == 'K'){
                                    if(tempconvertida == 'C'){
                                        temperatura = temperatura-272.2;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == C
                                    if(tempconvertida == 'F'){
                                        temperatura = temperatura-457.9;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == F
                                    if(tempconvertida == 'R'){
                                        temperatura = temperatura+1.8;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == R
                                }//unidadmed == K
                                if(unidadmed == 'R'){
                                    if(tempconvertida == 'F'){
                                        temperatura = temperatura-458.7;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == F
                                    if(tempconvertida == 'K'){
                                        temperatura = temperatura+0.6;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == K
                                    if(tempconvertida == 'C'){
                                        temperatura = temperatura-272.6;
                                        System.out.println("La conversion de la temperatura " +temperaturainicial + " en grados " +unidadmed + " a grados " +tempconvertida + " es: " +temperatura);
                                    }//tempconvertida == C
                                }//unidadmed == R
                            }
                        System.out.println("escriba `3` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  3); //case3
                    break;
                    case 4:
                    do{
                        int positivos, negativos;
                        System.out.println("Ingrese 3 numeros enteros (Pueden ser positivos o negativos):");
                        System.out.println("Ingrese su primer numero:");
                        num1 = entrada.nextDouble();
                        System.out.println("Ingrese su segundo numero:");
                        num2 = entrada.nextDouble();
                        System.out.println("Ingrese su tercer numero:");
                        num3 = entrada.nextDouble();
                        positivos = 0;
                        negativos = 0;
                if(num1 >= 0){
                    positivos=positivos + 1;
                }
                    else{
                        negativos=negativos + 1;
                    }
                if(num2 >= 0){
                        positivos=positivos + 1;
                    }
                    else{
                        negativos=negativos + 1;
                    }   
                if(num3 >= 0){
                        positivos=positivos + 1;
                    }
                    else{
                        negativos=negativos + 1;
                    }
                    System.out.println("Usted ha ingresado "+ positivos + " numeros positivos y " +negativos + " numeros negativos" );
                        System.out.println("escriba `4` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  4); //case4
                    break;
                    case 5:
                    do{
                        int productoa, productob, productoc, totala, totalb, totalc, totalf, cantidada, cantidadb, cantidadc;
                        productoa = 100;
                        productob = 50;
                        productoc = 65;
                        System.out.println("Producto A: 100 MXN");
                        System.out.println("Producto B: 50 MXN");
                        System.out.println("Producto C: 65 MXN");
                        System.out.println("Ingrese la cantidad del producto A que desea comprar");
                        cantidada = entrada.nextInt();
                        System.out.println("Ingrese la cantidad del producto B que desea comprar");
                        cantidadb = entrada.nextInt();
                        System.out.println("Ingrese la cantidad del producto C que desea comprar");
                        cantidadc = entrada.nextInt();
                        if (cantidada < 0 || cantidadb < 0 || cantidadc < 0){
                            System.out.println("Error en los datos ingresados; todas las cantidades debe ser positivas");
                        }else{
                        System.out.println(" ");
                        System.out.println("El resumen de su compra es: ");
                        totala=cantidada*productoa;
                        totalb=cantidadb*productob;
                        totalc=cantidadc*productoc;
                        totalf=totala+totalb+totalc;
                        System.out.println("Total de producto A comprado: " + totala + " MXN");
                        System.out.println("Total de producto B comprado: " + totalb + " MXN");
                        System.out.println("Total de producto C comprado: " + totalc + " MXN");
                        System.out.println("El total de su compra es: " + totalf + " MXN");
                        }

                        System.out.println("escriba `5` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  5); //case5
                    break;
                    case 6:
                    do{
                        int operacion;
                        double areatri, peritri, arearec, perirec, volesfe, volcili;
                        System.out.println("Que operacion desea realizar: ");
                        System.out.println("1.- Area y perimetro de un rectangulo; 2.- Area y perimetro un triangulo; 3.- Volumen de una esfera; 4.- Volumen de un cilindro");
                        operacion = entrada.nextInt();
                        switch(operacion) {
                            case 1:
                            System.out.println("Ingrese las medidas de los catetos: ");
                            System.out.println("Cateto a: ");
                            segmentoa = entrada.nextDouble();
                            System.out.println("Cateto b: ");
                            segmentob = entrada.nextDouble();
                            System.out.println("Cateto c: ");
                            segmentoc = entrada.nextDouble();
                            System.out.println("Altura: ");
                            altura = entrada.nextDouble();
                            System.out.println("Base: ");
                            base = entrada.nextDouble();
                            areatri = base*altura/2;
                            System.out.println("El Area del triangulo es: " + areatri);
                            peritri = segmentoa+segmentob+segmentoc;
                            System.out.println("El Perimetro del triangulo es: " + peritri);
                            break;
                            case 2:
                            System.out.println("Ingrese las medidas de los lados: ");
                            System.out.println("Altura: ");
                            altura = entrada.nextDouble();
                            System.out.println("Base: ");
                            base = entrada.nextDouble();
                            arearec = base*altura;
                            System.out.println("El Area del rectangulo es: " + arearec);
                            perirec = 2*base+2*altura;
                            System.out.println("El Perimetro del rectangulo es: " + perirec);
                            break;
                            case 3:
                            System.out.println("Ingrese la medida del radio de la esfera: ");
                            radio = entrada.nextDouble();
                            volesfe = 4/3*3.1416*radio*radio*radio;
                            System.out.println("El volumen total de la esfera es " + volesfe);
                            break;
                            case 4:
                            System.out.println("Ingrese las medidas del cilindro: ");
                            System.out.println("Radio de la base del cilindro: ");
                            radio = entrada.nextDouble();
                            System.out.println("Altura del cilindro: ");
                            altura = entrada.nextDouble();
                            volcili = 3.1416*radio*radio*altura;
                            System.out.println("El volumen del cilindro es: " + volcili);
                            break;
                            default:
                            System.out.println("Esta operacion no esta disponible :(");
                            break;
                        }
                        System.out.println("escriba `6` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  6); //case6
                    break;
                    case 7:
                    do{
                       
                        System.out.println("Se imprime la tabla de datos");
                        for(int i = 1; i <= 10; i = i + 1)
                            {if(i < 10){
                                System.out.println(" "+i+"    "+ i*10 + "    " +i*100 + "   " +i*1000);
                            }else{
                                System.out.println(i+"   "+ i*10 + "   " +i*100 + "  " +i*1000);}
                            }
                        System.out.println("escriba `7` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  7); //case7
                    break;
                    case 8:
                    do{
                        int factorial;
                        System.out.println("Ingrese un numero positivo");
                        num1 = entrada.nextInt();
                        factorial = 1;
                        if(num1 > 0){
                            for(int i = 1; i <= num1; i = i + 1)
                            {
                               factorial = factorial*i; 
                            } 
                            System.out.println("El factorial del numero " + num1 + " es " +factorial);
                        }else{
                            System.out.println("El numero ingresado debe ser positivo");
                        }
                        System.out.println("escriba `8` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  8); //case8
                    break;
                    case 9:
                    do{
                        System.out.println("se aplica caso 9");
                        System.out.println("escriba `9` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  9); //case9
                    break;
                    case 10:
                    do{
                        System.out.println("se aplica caso 10");
                        System.out.println("escriba `10` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  10); //case10
                    break;
                    case 11:
                    do{
                        System.out.println("se aplica caso 11");
                        System.out.println("escriba `11` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  11); //case11
                    break;
                    case 12:
                    do{
                        System.out.println("se aplica caso 12");
                        System.out.println("escriba `12` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  12); //case12
                    break;
                    case 13:
                    do{
                        int operacion;
                        System.out.println("Bienvenido a la calculadora");
                        System.out.println("Que operacion desea realizar: ");
                        System.out.println("1.- Suma; 2.- Resta; 3.- Multiplicacion; 4.- Divison");
                        operacion = entrada.nextInt();
                        switch(operacion) {
                            case 1:
                            System.out.println("Ingrese dos numeros: ");
                            System.out.println("Primer numero: ");
                            num1 = entrada.nextDouble();
                            System.out.println("Segundo numero: ");
                            num2 = entrada.nextDouble();
                            resultado = num1 + num2;
                            System.out.println("EL resultado de la operacion es " +resultado);
                            break;
                            case 2:
                            System.out.println("Ingrese dos numeros: ");
                            System.out.println("Primer numero: ");
                            num1 = entrada.nextDouble();
                            System.out.println("Segundo numero: ");
                            num2 = entrada.nextDouble();
                            resultado = num1 - num2;
                            System.out.println("EL resultado de la operacion es " +resultado);
                            break;
                            case 3:
                            System.out.println("Ingrese dos numeros: ");
                            System.out.println("Primer numero: ");
                            num1 = entrada.nextDouble();
                            System.out.println("Segundo numero: ");
                            num2 = entrada.nextDouble();
                            resultado = num1 * num2;
                            System.out.println("EL resultado de la operacion es " +resultado);
                            break;
                            case 4:
                            System.out.println("Ingrese dos numeros: ");
                            System.out.println("Primer numero: ");
                            num1 = entrada.nextDouble();
                            System.out.println("Segundo numero: ");
                            num2 = entrada.nextDouble();
                            if (num2 != 0){
                                resultado = num1 / num2;
                                System.out.println("EL resultado de la operacion es " +resultado);  
                            }else{
                                System.out.println("Math ERROR");  
                            }
                            break;
                            default:
                            System.out.println("Operacion disponible :(");
                            break;  
                        }
                        System.out.println("escriba `13` si desea repetir el programa.");
                        System.out.println("Si desea salir de esta opcion, escriba 0.");
                        repetir = entrada.nextInt();
                    }while(repetir ==  13); //case13
                    break;
                    case 14:
                    do{
                        System.out.println("Estas seguro que quires salir del menu?; si es asi escriba 0");
                        repetir = entrada.nextInt();
                    }while(repetir ==  14); //case14
                    break;
                } //switch
                System.out.println("Escriba 0 para regresar al menu");
                System.out.println("Escriba 2 para salir de la aplicacion");
                menu = entrada.nextInt();
        }while(menu == 0);
    }
}
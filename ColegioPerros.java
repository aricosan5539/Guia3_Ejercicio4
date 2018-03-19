 

import java.util.Scanner;  //esta libreria permite ingresar datos desde el teclado

public class ColegioPerros {

    public static void mostrarMenu() {  //este es el menu principal que sera invocado a traves de este metodo
        System.out.println("\n\n\n"
                + "----------Programa de perros v1.0.---------------\n"
                + "0. Salir del programa\n"
                + "1. Ingresar un perro nuevo.\n"
                + "2. Imprimir reporte de perros por orden de codigo.\n"
                + "3. Imprimir reporte de perros por localidad.");

        System.out.println("Digite un opciÃ³n, (cero para salir).");
    }

    public static void inicializarPerros(Perros lista[]) {  //este es el requerimiento No. 1 del taller en el que creo minimom 10 perros
        //                ( nombre, raza,  localidad, diaAsiste, cedulaDueÃ±o, nombreDueÃ±o, telefono) {
        lista[0] = new Perros("Sasha", "Criollo", 1, 1, 19121991, "Julian", "7213434");
        lista[1] = new Perros("Cash", "Criollo", 2, 2, 53153153, "Angela", "3118212121");
        lista[2] = new Perros("Heroe", "PitBull", 3, 3, 52152152, "Luz Dary", "3");
        lista[3] = new Perros("Spike", "Criollo", 4, 4, 51151151, "Miguel", "4");
        lista[4] = new Perros("Sky", "San Bernardo", 1, 5, 50150150, "Milena", "5");
        lista[5] = new Perros("Medusa", "Sharpei", 2, 6, 29129129, "Armando", "6");
        lista[6] = new Perros("Gris", "Criollo", 3, 7, 8111222, "Jenny", "7");
        lista[7] = new Perros("Vago", "Boxer", 4, 1, 30131131, "Paola", "8");
        lista[8] = new Perros("Estrella", "Pastor Napolitano", 1, 2, 20157157, "Ana", "20");
        lista[9] = new Perros("Esperanza", "Bull Terrier", 2, 3, 80813813, "Sebastian", "21");
        lista[10] = new Perros("Casta", "Doberman", 3, 4, 88881881, "Nicolas", "30");
        lista[11] = new Perros("Saltarin", "Salchicha", 4, 5, 55552552, "Dora", "31");
        System.out.println("total de perros por el momento: " + lista[0].getContadorPerros());
    }

    public static void main(String[] args) {  //args es porque java la solicita para ejecutarse
        double opcionMenuPrincipal = 0;  // Son las opciones que se dan en el menu principal
        Scanner digitadoPorTeclado = new Scanner(System.in);  //Variable para capturar datos desde teclado
        Perros listaPerro[] = new Perros[50]; //este programa acepta que se digite maximo 50 perros crea un vector. (array) No es una lista
        inicializarPerros(listaPerro); //inicializo los perros predigitados

        //esto es para cargar la informacion desde la clase ColegioPerros y mandarla a la clase Perros.
        String nombrePerroAux = ""; // nombre del perro
        String razaAux = ""; // Se le puede colocar cualquiera, de preferencia dos opciones, raza y criollo
        double localidadAux = 0; // Solo cuatro: 1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.
        double diaAsisteAux = 0; // numero de 1 a 7 respecto a los dÃ­as de la semana
        // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
        double cedulaDueñoAux = 0; // numero de identificacion del dueÃ±o del perro
        String nombreDueñoAux = ""; // nombre del cliente
        String telefonoAux = ""; // nombre del cliente
        
        //----------------------------------------------------------

        do {
            mostrarMenu();
                                   //el int convierte el valor de double a entero en tiempo de ejecuciÃ³n
            opcionMenuPrincipal = (int)digitadoPorTeclado.nextDouble();//.nextInt es para capturar un numero entero
            switch ((int)opcionMenuPrincipal) {
                case 0:
                    System.out.println("Programa terminado con Ã©xito. \n\n");
                    break;
                case 1:
//                    nombrePerroAux = "Pluto";
//                    razaAux = "Sharpei"; // Se le puede colocar cualquiera, de preferencia dos opciones, raza y criollo
//                    localidadAux = 1; // Solo cuatro: 1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.
//                    diaAsisteAux = 3; // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
//                    cedulaDueÃ±oAux = 90901901;
//                    nombreDueÃ±oAux = "Alvaro";
//                    telefonoAux = "74224136";
                    
//                    Lo tengo en comentario para que se entienda que este perro es diferente de la lista de inicializacionmostrarMenu
//                    Y es el perro de prueba adicional        

                    
                    System.out.println("Por favor digite el nombre del perro SIN ESPACIOS:"); //Solicito el primer nombre
                    nombrePerroAux = digitadoPorTeclado.next(); //.next es para capturar cadenas de caracteres
                    System.out.println("Digite la raza del perro SIN ESPACIOS:");
                    razaAux = digitadoPorTeclado.next();
                    
                    do { //esto es para que la persona no pueda digitar opciones que no existen, 
                        //hasta que el usuario lo haga bien y el ciclo se cumple
                        System.out.println("Digite un numero para la localidad de 1 a 4 (1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.):");
                        localidadAux = (int)digitadoPorTeclado.nextDouble(); //.nextInt es para capturar un numero entero
                    }while( (localidadAux>=1 && localidadAux<=4)==false );
                    
                    do { //esto es para que la persona no pueda digitar opciones que no existen, 
                        //hasta que el usuario lo haga bien y el ciclo se cumple
                        System.out.println("Digite el dÃ­a de asistencia en numero de 1 a 7 (1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.):");
                        diaAsisteAux = (int)digitadoPorTeclado.nextDouble();
                    }while( (diaAsisteAux>=1 && diaAsisteAux<=7)==false );
                    
                    System.out.println("Digite el nombre del dueÃ±o del perro SIN ESPACIOS:");
                    nombreDueñoAux = digitadoPorTeclado.next();     //capturo el nombre del dueÃ±o
                    System.out.println("Digite el telÃ©fono de contacto SIN ESPACIOS:");
                    telefonoAux = digitadoPorTeclado.next();        //El telefono se guarda como String por buena practica y no como numero
                    System.out.println("Digite la cedula del dueÃ±o SIN ESPACIOS:");
                    cedulaDueñoAux = (int)digitadoPorTeclado.nextDouble();  //capturo la cedula del dueÃ±o
                    
                    
                    if (listaPerro[0] != null) {
                        //si existe previamente una lista, coloca el perro nuevo al final de la lista con su codigo
                        listaPerro[listaPerro[0].getContadorPerros()] = new Perros(nombrePerroAux, razaAux, localidadAux, diaAsisteAux, cedulaDueñoAux, nombreDueñoAux, telefonoAux);
                    } else {
                        //Si no existe una lista de perros, aqui creo el perro No. 0 que encabeza la lista
                        listaPerro[0] = new Perros(nombrePerroAux, razaAux, localidadAux, diaAsisteAux, cedulaDueñoAux, nombreDueñoAux, telefonoAux);
                    }
                    break;
                case 2:
                    if (listaPerro[0] != null) {
                        listaPerro[0].imprimirPerros(listaPerro, listaPerro[0].getContadorPerros());
                    } else {
                        System.out.println("Por favor crear al menos un perro antes de indicar esta opcion.");
                    }
                    break;
                case 3:
                    if (listaPerro[0] != null) {
                        listaPerro[0].imprimirPerrosLocalidad(listaPerro, listaPerro[0].getContadorPerros());
                    } else {
                        System.out.println("Por favor crear al menos un perro antes de indicar esta opcion.");
                    }
                    break;
                default:
                    System.out.println("Selecciono una opcion que no esta disponible.\n\n");
                    break;
            }

        } while (opcionMenuPrincipal != 0);
    }

}

 

public class Perros {

    // static para que sea una misma variable para todas las instancias.
    private static int contadorPerro = 0; // identificaciÃ³n del perro
    private static String diasSemana[] = new String[8]; // numero de 1 a 7 respecto a los dÃ­as de la semana
        // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
    private static String listaLocalidad[] = new String[5]; // Solo cuatro: 1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.
    private int idPerro; // identificaciÃ³n del perro
    
    private String nombre; // nombre del perro
    private String raza; // Se le puede colocar cualquiera, de preferencia dos opciones, raza y criollo
    private double localidad; // Solo cuatro: 1=Teusaquillo, 2=Suba, 3=Usaquen y 4=Chapinero.
    private double diaAsiste; // numero de 1 a 7 respecto a los dÃ­as de la semana
    // 1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes, 6=sabado, 7=domingo.
    private double cedulaDueño; // numero de identificacion del dueÃ±o del perro
    private String nombreDueño; // nombre del cliente
    private String telefono; // nombre del cliente

    //metodo fundamental llamado constructor de la clase 
    public Perros() {
        contadorPerro++;
        idPerro = contadorPerro;
        if (diasSemana[0] == null) {
            inicializarDias(); //llamo al metodo de inicializarDias
        }
        if (listaLocalidad[0] == null) {
            inicializarLocalidad();  //llamo al metodo de inicializarLocalidad
        }
    }

    //constructor de la clase llena el objeto
    public Perros(String nombreParametroLlegada, String razaParametroLlegada, double localidadParametroLlegada, 
            double diaAsisteParametroLlegada, double cedulaDueñoParametroLlegada, String nombreDueñoParametroLlegada, String telefonoParametroLlegada) {
                  //estos son los parametros que le ingresan al constructor
        
        //Esto es igual al primer constructor
        contadorPerro++;
        idPerro = contadorPerro;
        if (diasSemana[0] == null) {
            inicializarDias(); //llamo al metodo de inicializarDias
        }
        if (listaLocalidad[0] == null) {
            inicializarLocalidad(); //llamo al metodo de inicializarLocalidad
        }
        //-------------------------------------------------------------------
        
        //Inicializo el objeto con los parametros de entrada
        diaAsiste = diaAsisteParametroLlegada;
        localidad = localidadParametroLlegada;
        nombre = nombreParametroLlegada;
        raza = razaParametroLlegada;
        cedulaDueño = cedulaDueñoParametroLlegada;
        nombreDueño = nombreDueñoParametroLlegada;
        telefono = telefonoParametroLlegada;
    }

    public void imprimirPerros(Perros vectorPerros[], int totalPerros) { //no retorna este metodo y tiene dos parametros de entrada, un vector de Perros y un valor entero
        for (int aux = 0; aux < totalPerros; aux++) { //se ejecuta para el total de perros exitentes en la base de datos
            System.out.println("Perro " + (aux + 1) + ": " + vectorPerros[aux].nombre + ",\tlocalidad: " + Perros.listaLocalidad[(int)vectorPerros[aux].localidad] + ",\tAsiste: " + Perros.diasSemana[(int)vectorPerros[aux].diaAsiste] + ""
                    + ",\traza: " + vectorPerros[aux].raza + ",\tDueÃ±o: " + vectorPerros[aux].nombreDueño + ",\ttelefono: " + vectorPerros[aux].telefono + ",\tId dueño: " + vectorPerros[aux].cedulaDueño);
        }
    }

    //esto resulve el cuarto numeral de agrupacion de perros por localidad
    public void imprimirPerrosLocalidad(Perros vectorPerros[], int totalPerros) {
        for (int aux2 = 0; aux2 < 4; aux2++) { //se ejecuta el numero de localidades que exite para agruparlos
            System.out.println("\nLocalidad: " + Perros.listaLocalidad[(int)vectorPerros[(aux2)].localidad]); // Aqui arrancamos por localidad ejm. Teusaquillo
            for (int aux = 0; aux < totalPerros; aux++) { //se ejecuta para el total de perros exitentes en la base de datos
                if ((aux2+1) == vectorPerros[aux].localidad) { //Solo imprimo el perro si pertenece a la localidad que se este mostrando en el momento ejm Teusaquillo
                    System.out.println("Perro " + (aux + 1) + ": " + vectorPerros[aux].nombre + ",\tAsiste: " + Perros.diasSemana[(int)(vectorPerros[aux].diaAsiste)] + ""
                            + ",\traza: " + vectorPerros[aux].raza + ",\tDueño: " + vectorPerros[aux].nombreDueño + ",\ttelefono: " + vectorPerros[aux].telefono + ",\tId dueño: " + vectorPerros[aux].cedulaDueño);
                }
            }
            //al terminar de buscar en toda la lista de perros cuales pertenecen a esa localidad, va la siguiente localidad y repite la busqueda en todos los perros.
        }

    }

    public static void inicializarDias() {
        Perros.diasSemana[0] = "vacio";
        Perros.diasSemana[1] = "Lunes";
        Perros.diasSemana[2] = "Martes";
        Perros.diasSemana[3] = "Miercoles";
        Perros.diasSemana[4] = "Jueves";
        Perros.diasSemana[5] = "Viernes";
        Perros.diasSemana[6] = "Sabado";
        Perros.diasSemana[7] = "Domingo";
    }

    public static void inicializarLocalidad() {
        Perros.listaLocalidad[0] = "vacio";
        Perros.listaLocalidad[1] = "Teusaquillo";
        Perros.listaLocalidad[2] = "Suba";
        Perros.listaLocalidad[3] = "Usaquen";
        Perros.listaLocalidad[4] = "Chapinero";

    }

    //Metodos para obtener informaciÃ³n del objeto que invoque
    
    public int getContadorPerros() { // obtengo el contador para el total de perros
        return contadorPerro;
    }
    
    public double getDiaAsiste() { // obtengo el dia en que asiste el perro que invoque este metodo
        return this.diaAsiste;
    }

    public double getLocalidad() {// obtengo la localidad a la que pertenece el perro que invoque el metodo
        return this.localidad;
    }
    
    public String getNombrePerro() {
        return this.nombre;
    }
    
    public String getRazaPerro() {
        return this.raza;
    }
    
    public String getNombreDueno() {
        return this.nombreDueño;
    }
    
    public String getTelefonoContacto() {
        return this.telefono;
    }
    
    public double getCedulaDueno() {
        return this.cedulaDueño;
    }
    
    //Metodos para modificar, o actualizar informaciÃ³n en el objeto que invoque
    
    public void setDiaAsiste(int aux) { //le asigno el dia al que va a asistir el perro que invoque el metodo
        this.diaAsiste=aux;
    }

    public void setLocalidad(int aux) { //le asigno la localidad del perro que invoque el metodo
        this.localidad =aux;
    }
    
    public void setNombrePerro(String aux) {//le asigno el nombre del perro que invoque el metodo
        this.nombre=aux;
    }
    
    public void setRazaPerro(String aux) {
        this.raza=aux;
    }
    
    public void setNombreDueno(String aux) {
        this.nombreDueño=aux;
    }
    
    public void setTelefonoContacto(String aux) {
        this.telefono=aux;
    }
    
    public void setCedulaDueno(int aux) {
        this.cedulaDueño=aux;
    }


}
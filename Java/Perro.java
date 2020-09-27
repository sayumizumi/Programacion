 class Perro {

   static String nombre, raza;
    static int edad;

    public Perro(String nombre_N, String raza_N, int edad_N) {
        this.nombre = nombre_N;
        this.raza = raza_N;
        this.edad = edad_N;
    }

    public static void presentacion() {
        System.out.println("Se llama " + nombre + ", su raza es " + raza + ". Tiene " + edad + " años.");
    }
}
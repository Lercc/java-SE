public class NamigJava {
    public static void main(String[] args) {
        // Java es sensible a minúsculas y mayúsculas
        int celPhone = 920858116;
        int Celphone = 99999999;
        System.out.println(celPhone);
        System.out.println(Celphone);

        // Java permite que el nombre de una variable empieze o contenga   "$" (dolar)  o "_" (guión bajo)
        // al nombrar un a variable, pero no permite el uso de "-" (guión)
        String $countryName = "Peru";
        String _backgroundColor = "Green";
        //String background-color = "red"; // marca error
        String currenc$ = "PEN";
        String background_color = "Blue";

        // Para declara una constante se usa la palabra reservada "final", luego la declaracion e inizialización
        // Convencianalmente una constante se escribe en mayúscula y con guión bajo si son más de dos palabras.
        final int POSITION = -6;
        final int MAX_WIDTH = 999;
        final int MIN_WIDTH = 1;
    }
}

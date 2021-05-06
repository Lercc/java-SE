public class MathematicOperation {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // Valor de PI
        System.out.println("PI: " +  Math.PI);

        // Math.ceil -> redondea y devuelve un decimal a un entero hacia arriba
        System.out.println("Math.ceil (2.1) : " + Math.ceil(x));

        // Math.floor -> redondea y devuelve un decimal a un entero hacia abajo
        System.out.println("Math.floor (2.1) : " + Math.floor(x));

        // Math.pow -> devuelve el resultado de un número eleveado a otro
        System.out.println("Math.pow (2.1, 3) : " + Math.pow(x, y));

        // Math.max -> devuelve el número mayor
        System.out.println("Math.max (2.1, 3) : " + Math.max(x, y));

        // Math.sqrt -> devuelve la raiz cuadrada de un número
        System.out.println("Math.sqrt (3) : " + Math.sqrt(y));

        // RADIO DE UN CIRCULO
        // pi * r^2
        System.out.println("Radio : " + Math.PI * Math.pow(y,2));
    }
}

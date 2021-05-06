public class DataTypes {
    public static void main() {

        // DATOS NUMÉRICOS
        // byte     ----> 2 ^ (1 byte * 8)  = 256             |  -128 a 127
        // short    ----> 2 ^ (2 bytes * 8) = 65 536          |  -32 768 a 32 767
        // int      ----> 2 ^ (4 bytes * 8) = 4 294 967 296   |  -2 147 483 648 a 2 147 483 647
        // long     ----> 2 ^ (8 bytes / 8) =
        //                     => 18 446 744 073 709 551 616  | -9 223 372 036 854 775 807 a 9 223 372 036 854 775 807

        // Número byte (max. 3 dígitos)
        byte nB = 123;

        // Número short (max. 5 dígitos)
        short nS = 12345;

        // Número entero (max. 10 dígitos)
        int nI = 1234567890;

        // Número entero (max. 19 dígitos)
        // Java requiere que en variables de tipo long se coloque una "L" al final del valor de la variable.
        long nL = 1234567890123456789L;


        // PUNTO FLOTANTE
        // float     ----> 4 bytes    |  1.40419846432481707e-45 a 3.40282346638528860e+38
        // double    ----> 8 byte     |  4.970656445841246544e-324d a 1.79769313486231570e+308d

        //Double es usado para calculos que requieren precisión, calculos matemáticos precisos.
        double  nD = 123.456;

        // Java requiere que en variables de tipo float se coloque una "F" al final del valor de la variable.
        float nF = 123.456F;
    }
}

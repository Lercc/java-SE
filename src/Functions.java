public class Functions {
    public static void main (String[] args) {
        System.out.println(circleArea(4)); // 58.26548245743669
    }

    /**
     * Descripción:
     *  <ul>
     *      <li>Función que resuelve el área de un círculo especificando su radio.</li>
     *  </ul>
     *
     * @param pRadio radio del círculo.
     * @return Devuele el área del círculo.
     * */
    public static double circleArea (double pRadio ) {
        return Math.PI * Math.pow(pRadio, 2);
    }
}

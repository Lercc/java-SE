public class Functions {
    public static void main (String[] args) {
        System.out.println(circleArea(4)); // 58.26548245743669
    }

    public static double circleArea (double pRadio ) {
        return Math.PI * Math.pow(pRadio, 2);
    }
}

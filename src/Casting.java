public class Casting {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println("Exactitud : " + monthlyDogs); // 2.5

        // ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println("Estimación : " + estimatedMonthlyDogs); // 2

        // EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println("a/b : " + a/b);  // 2
        System.out.println("(double) a/b : " + (double) a/b); //2.5

        //CASTING AUTOMATICO
        double c = a/b;
        System.out.println("Cast autom. c : " + c); // 2.0

         char nCha = '@';
         int nIntCha = nCha;
        System.out.println("Cast autom. nIntCha : " + nIntCha); // 64
    }
}

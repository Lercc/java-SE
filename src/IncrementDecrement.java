public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives -= 1;
        System.out.println(lives); // 3

        lives--;
        System.out.println(lives); // 2

        lives++;
        System.out.println(lives); //3

        //--------------------------------------------------------------------------------------------------------------

        // Gana un regalo por ganar una vida:
        int currentLivesUno = 5;
        int currentLivesDos = 5;

        //OPERADOR POST-FIJO
        // Gana 100 puntos mas la cantidad de vidas que tiene
        // * cuenta solo las vidas que tenía antes de ganar la vida
        int  post_gift = 100 + currentLivesUno++; // 105
        System.out.println(post_gift);

        //OPERADOR PRE-FIJO
        // Gana 100 puntos mas la cantidad de vidas que tiene
        // * cuenta todas las vidas que tiene después de ganar la vida
        int  pre_gift = 100 + ++currentLivesDos; // 105
        System.out.println(pre_gift);
    }
}

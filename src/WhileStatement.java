import java.util.Scanner;

public class WhileStatement {
    static boolean isTurnOnLight = false;

    public static void main (String[] args) {

        int userInput = 0;

        do {
            System.out.println("------------------ APP ------------------");
            System.out.println("1. Prender/Apagar la linterna");
            System.out.println("2. Estado de la linterna");
            System.out.println("3. SOS");
            System.out.println("0. salir");
            System.out.println("------------------ --- ------------------");

            Scanner sc = new Scanner(System.in);
            userInput = Integer.valueOf(sc.nextLine());

            switch (userInput) {
                case 0 :
                    System.out.println("THANKS FOR USE THE APP");
                    break;
                case 1 :
                    turnOnOffLight();
                    if (isTurnOnLight) {
                        System.out.println("La linterna ha sido prendida");
                    } else {
                        System.out.println("La linterna ha sido apagada");
                    }

                    break;
                case 2 :
                    if (isTurnOnLight) {
                        System.out.println("La linterna esta prendida");
                    } else {
                        System.out.println("La linterna esta apagada");
                    }
                    break;
                case 3 :
                    turnOnSos();
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
                    break;
            }


        } while (userInput != 0);

    }

    public static void turnOnOffLight () {
        isTurnOnLight = !isTurnOnLight;
    }
    public static void turnOnSos () {
        int userSosEntry = 0;

        if (isTurnOnLight) {
            do {
                System.out.println("------------------ SOS ------------------");
                System.out.println("... ___ ...");
                System.out.println("... ___ ...");
                System.out.println("... ___ ...");
                System.out.println("0. apagar sos");
                System.out.println("------------------ --- ------------------");

                Scanner scSos = new Scanner(System.in);
                userSosEntry = Integer.valueOf(scSos.nextLine());

                switch (userSosEntry) {
                    case 0 :
                        System.out.println("Sos ha sido apagado!");
                        break;
                    default :
                        System.out.println("Seleccione una opción válida");
                        break;
                }
            } while (userSosEntry != 0);
        } else {
            System.out.println("No puedes activar la alamara SOS, si la linterna esta apagada!!");
        }
    }
}

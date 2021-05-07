import java.util.Scanner;

public class DoWhileStatement {
    public static void main (String[] args) {

        int userInput = 0;

        do {
            menuInterface();
            Scanner sc = new Scanner(System.in);
            userInput = Integer.valueOf(sc.nextLine());

            switch (userInput) {
                case 0:
                    System.out.println("TRANKS TO YOU FOR YOUR VISIT, SEE YOU LATER!!");
                    break;
                case 1 :
                    int userMenuMoveInput = 0;
                    do {
                        moviesInterface();
                        Scanner scMenuMovie = new Scanner(System.in);
                        userMenuMoveInput = Integer.valueOf(scMenuMovie.nextLine());

                        switch (userMenuMoveInput) {
                            case 0 :
                                System.out.println("Saliendo del menú de peliculas");
                                break;
                            case 1 :
                                optionSelected("Movie A");
                                break;
                            case 2 :
                                optionSelected("Movie B");
                                break;
                            case 3 :
                                optionSelected("Movie C");
                                break;
                            default :
                                System.out.println("Selecciona una opción válida");
                                break;
                        }

                    } while ( userMenuMoveInput != 0);
                    break;
                case 2 :
                    int userMenuMusicInput = 0;
                    do {
                        musicInterface();
                        Scanner scMenuMusic = new Scanner(System.in);
                        userMenuMusicInput = Integer.valueOf(scMenuMusic.nextLine());

                        switch (userMenuMusicInput) {
                            case 0 :
                                System.out.println("Saliendo del menú de música");
                                break;
                            case 1 :
                                optionSelected("Song A");
                                break;
                            case 2 :
                                optionSelected("Song B");
                                break;
                            case 3 :
                                optionSelected("Song C");
                                break;
                            default :
                                System.out.println("Selecciona una opción válida");
                                break;
                        }
                    } while (userMenuMusicInput != 0);
                    break;
                case 3 :
                    int userMenuVideogame = 0;
                    do {
                        videogamesInterface();
                        Scanner scMenuVideogame = new Scanner(System.in);
                        userMenuVideogame = Integer.valueOf(scMenuVideogame.nextLine());

                        switch (userMenuVideogame) {
                            case 0 :
                                System.out.println("Saliendo del menú de videojuegos");
                                break;
                            case 1 :
                                optionSelected("Game A");
                                break;
                            case 2 :
                                optionSelected("Game B");
                                break;
                            case 3 :
                                optionSelected("Game C");
                                break;
                            default :
                                System.out.println("Selecciona una opción válida");
                                break;
                        }
                    } while (userMenuVideogame != 0);
                    break;
                default:
                    System.out.println("Ingrese un valor correcto");
                    break;
            }

        } while (userInput != 0);

    }

    public static void menuInterface() {
        System.out.println("---------------------------- MENU ----------------------------");
        System.out.println("1. Menú de películas");
        System.out.println("2. Menú de musicas");
        System.out.println("3. Menú de videojuegos");
        System.out.println("0. Salir");
        System.out.println("---------------------------- ---- ----------------------------");
    }
    public static void moviesInterface() {
        System.out.println("---------------------------- MENU PELICULAS ----------------------------");
        System.out.println("1. Movie A");
        System.out.println("2. Movie B");
        System.out.println("3. Movie C");
        System.out.println("0. Regresar al menú principal");
        System.out.println("---------------------------- ---- --------- ----------------------------");
    }
    public static void musicInterface() {
        System.out.println("---------------------------- MENU MUSICAS ----------------------------");
        System.out.println("1. Song A");
        System.out.println("2. Song B");
        System.out.println("3. Song C");
        System.out.println("0. Regresar al menú principal");
        System.out.println("---------------------------- ---- ------- ----------------------------");
    }
    public static void videogamesInterface() {
        System.out.println("---------------------------- MENU VIDEOJUEGOS ----------------------------");
        System.out.println("1. Game A");
        System.out.println("2. Game B");
        System.out.println("3. Game C");
        System.out.println("0. Regresar al menú principal");
        System.out.println("---------------------------- ---- ----------- ----------------------------");
    }
    public static void optionSelected (String option) {
        System.out.println("Seleccionaste : "+ option);
    }
}

public class SwitchStatement {
    public static void main (String[] args) {

        String colorModeSelected = "Blue Dark";

        switch (colorModeSelected) {
            case "Light" :
                System.out.println("Mode light selected");
                break;
            case "Night" :
                System.out.println("Mode night selected");
                break;
            case "Blue Dark" :
                System.out.println("Mode blue dark selected");
                break;
            case "Dark" :
                System.out.println("Mode dark selected");
                break;
            default:
                System.out.println("Default mode configurated");
        }

    }
}

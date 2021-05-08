public class Arrays {
    public static void main (String[] args) {
         String[] days = new String[7];

        days[0] = "lunes";
        days[1] = "martes";
        days[2] = "miercoles";
        days[3] = "jueves";
        days[4] = "viernes";
        days[5] = "sabado";
        days[6] = "domingo";

        for(String day : days) {
            System.out.println(day);
        }
    }
}

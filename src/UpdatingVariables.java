public class UpdatingVariables {

    public static void main(String[] args) {

        int salary = 1000;

        // bono $200
        int bono = 200;

        salary += bono;
        System.out.println(salary);

        // pension $50 descuento
        int pension = 50;

        salary -= pension;
        System.out.println(salary);

        //  2 horas extra $30
        int horasExtra = 30;
        // comida $45
        int comida = 45;

        salary = salary + 2 * (horasExtra) - comida;
        System.out.println(salary);


        // ACTUALIZANDO CADENAS DE TEXTO
        String employeeName = "luis enrique";
        employeeName += " roque ccanto";
        System.out.println(employeeName);

        employeeName =  "lercc - " + employeeName;
        System.out.println("Mi nombre es : " + employeeName);

    }

}

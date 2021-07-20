package academy.devdojo.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
       String name = "João";
       String address = "Rua da amazonas";
       Double salary = 2000.0;
       String dateReceiveSalary = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
       String report = "Eu "+ name+ ", morando no endereço "+ address+
               " confirmo que recebi o salário de "+ salary+ ", na data "+ dateReceiveSalary;

        System.out.println(report);
    }
}

package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
      double salaryYear = 70000;
      double firstRange = 9.70 / 100;
      double secondRange = 27.35 / 100;
      double thirdRange = 49.5 / 100;
      double taxValue;

      if(salaryYear <= 34712){
          taxValue = salaryYear * firstRange;
      }else if(salaryYear > 34712 && salaryYear <= 68507){
          taxValue = salaryYear * secondRange;
      }else{
          taxValue = salaryYear * thirdRange;
      }
        System.out.println(taxValue);
    }
}

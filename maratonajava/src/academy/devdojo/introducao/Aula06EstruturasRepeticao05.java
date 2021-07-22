package academy.devdojo.introducao;

public class Aula06EstruturasRepeticao05 {
    public static void main(String[] args) {
       double value = 30000;
       for (int portion =(int) value; portion >=1;portion--){
           double portionValue = value / portion;

           if(portionValue < 1000) continue;

           System.out.println("Parcela "+ portion+ " valor parcela "+ portionValue);
       }
    }
}

package academy.devdojo.introducao;

public class Aula06EstruturasRepeticao04 {
    public static void main(String[] args) {
       double value = 30000;
       for (int portion =1; portion < value;portion++){
            double portionValue = value / portion;

            if(portionValue < 1000) break;

            System.out.println("Parcela "+ portion+ " valor parcela "+ portionValue);
       }
    }
}

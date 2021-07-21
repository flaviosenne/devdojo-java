package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
       // idade < 15  categoria infantil
       // idade  >= 15  e idade < 18 categoria juvenil
       // idade  >= 18  categoria adulto
        int age = 17;
        String category;
        if(age < 15){
            category ="categoria infantil";
        }else if(age >=15 && age < 18){
            category = "categoria juvenil";
        }else{
            category ="categoria adulta";
        }
//        category =  age <15 ? "categoria infantil" :
//                age >= 15 && age < 18 ? "categoria juvenil" : "categoria adulta";
//
        System.out.println(category);
    }
}

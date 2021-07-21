package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 17;
        boolean isAuthorizedBuyerBeer = age >= 18;
        if(isAuthorizedBuyerBeer){
            System.out.println("pode comprar bebida");
        }else{
            System.out.println("não pode comprar bebida");
        }
//        if(!isAuthorizedBuyerBeer){
//            System.out.println("não pode comprar bebida");
//        }

        boolean c = true;

        if(c = false){
            System.out.println("não deve entrar aqui");
        }
    }
}

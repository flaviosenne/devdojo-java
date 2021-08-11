package academy.devdojo.javacore.Hheranca.dominio;

public class Pessoa {
    private String name;
    private String cpf;
    private Endereco address;


    public void print(){
        System.out.println("Nome: "+ name);
        System.out.println("CPF: "+ cpf);
        System.out.println("Endereço: "+ address.getStreet() + ", "+ address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }
}

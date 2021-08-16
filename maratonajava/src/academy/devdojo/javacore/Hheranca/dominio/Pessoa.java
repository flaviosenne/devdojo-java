package academy.devdojo.javacore.Hheranca.dominio;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco address;


    static {
        System.out.println("Desntro do bloco de inicialização statico de Pessoa");
    }

    {
        System.out.println("Desntro do bloco de inicialização de Pessoa 1");
    }
    {
        System.out.println("Desntro do bloco de inicialização de Pessoa 2");
    }
    public Pessoa(String name){
        System.out.println("Dentro do construtor de Pessoa");
        this.name = name;
    }

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

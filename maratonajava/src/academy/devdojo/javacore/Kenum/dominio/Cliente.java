package academy.devdojo.javacore.Kenum.dominio;

public class Cliente {
    private String name;
    private TipoCliente typeClient;

    public Cliente(String name, TipoCliente typeClient) {
        this.name = name;
        this.typeClient = typeClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCliente getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TipoCliente typeClient) {
        this.typeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                '}';
    }
}

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int contador;

    public Cliente (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[20];
        this.contador = 0;
    }
    //Construtores:
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Computador[] getComputadores(){
        return this.computadores;
    }

    public void addComputador(Computador c) {
        if (contador < computadores.length) {
            computadores[contador] = c;
            contador++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < contador; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("CPF do Cliente: " + this.cpf);
        System.out.println("\n-------------------- PCs Adquiridos --------------------");
        for (int i = 0; i < contador; i++) {
            computadores[i].mostraPcConfigs();
            System.out.println("-------------------------------------------------------");
        }
        System.out.println("\nTotal da Compra: R$" + calculaTotalCompra());
    }
}

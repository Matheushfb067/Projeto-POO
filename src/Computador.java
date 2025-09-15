public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional SO;
    private MemoriaUSB musb;

    public Computador(String marca, float preco, HardwareBasico[] hardwares, SistemaOperacional SO, MemoriaUSB musb){
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.musb = musb;
        this.SO = SO;
    }
    // Método para adicionar a memória USB, conforme o UML - AGREGAÇÃO
    public void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    public void mostraPcConfigs() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Hardware Básico: ");
        for (HardwareBasico Hard : hardwares){
            System.out.println(" Nome: " + Hard.getNome() + ", Capacidade: " + Hard.getCapacidade());
        }
        //Foi utilizado o metodo get nas funções chamadas para exibir os valores:
        System.out.println("Sistema Operacional: " + SO.getNome() + "Tipo: " + SO.getTipo() + "bits");
        if(this.musb != null){
            System.out.println("Memoria USB inclusa: " + this.musb.getNome() + ", Capacidade: " + this.musb.getCapacidade() + "Gb");
        }
    }

    public float getPreco(){
        return this.preco;
    }
}

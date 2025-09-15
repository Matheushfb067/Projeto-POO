import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String NomeCliente;
        String CpfCliente;

        int op = -1;

        System.out.println("Digite o nome do cliente: ");
        NomeCliente = entrada.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        CpfCliente = entrada.nextLine();

        Cliente cliente = new Cliente(NomeCliente, CpfCliente);

        float matricula = 636;

        while (op != 0){
            System.out.println("-------------------- Promoções PC Mania --------------------");
            System.out.println("1 - Promoção 1: Apple, Core i3, 8Gb RAM, 500Gb HD, macOS, Pen-drive 16Gb");
            System.out.println("2 - Promoção 2: Samsung, Core i5, 16Gb RAM, 1Tb HD, Windows 8, Pen-drive 32Gb");
            System.out.println("3 - Promoção 3: Dell, Core i7, 32Gb RAM, 2Tb HD, Windows 10, HD Externo 1Tb");
            System.out.println("0 - Finalizar Compra");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Digite o código da promoção desejada:");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    HardwareBasico[] hardwares1 = new HardwareBasico[3];
                    hardwares1[0] = new HardwareBasico("Pentium Core i3", 2200);
                    hardwares1[1] = new HardwareBasico("Memória RAM", 8);
                    hardwares1[2] = new HardwareBasico("HD", 500);

                    SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
                    MemoriaUSB usb1 = new MemoriaUSB("Pen-drive", 16);

                    Computador pc1 = new Computador("Apple", matricula, hardwares1, so1, usb1);
                    pc1.addMemoriaUSB(usb1);
                    cliente.addComputador(pc1);
                    break;

                case 2:
                    HardwareBasico[] hardwares2 = new HardwareBasico[3];
                    hardwares2[0] = new HardwareBasico("Pentium Core i5", 3370);
                    hardwares2[1] = new HardwareBasico("Memória RAM", 16);
                    hardwares2[2] = new HardwareBasico("HD", 1024); // 1Tb = 1024Gb

                    SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
                    MemoriaUSB usb2 = new MemoriaUSB("Pen-drive", 32);

                    Computador pc2 = new Computador("Samsung", matricula + 1234, hardwares2, so2, usb2);
                    pc2.addMemoriaUSB(usb2);
                    cliente.addComputador(pc2);
                    break;
                case 3:
                    HardwareBasico[] hardwares3 = new HardwareBasico[3];
                    hardwares3[0] = new HardwareBasico("Pentium Core i7", 4500);
                    hardwares3[1] = new HardwareBasico("Memória RAM", 32);
                    hardwares3[2] = new HardwareBasico("HD", 2048); // 2Tb = 2048Gb

                    SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
                    MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1024); // 1Tb = 1024Gb

                    Computador pc3 = new Computador("Dell", matricula + 5678, hardwares3, so3, usb3);
                    pc3.addMemoriaUSB(usb3);
                    cliente.addComputador(pc3);
                    break;
                case 0:
                    System.out.println("Finalizando a compra...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println("\n-------------------- Resumo da Compra --------------------");
        cliente.mostrarInfo();
        System.out.println("----------------------------------------------------------");

        ProcessarPedido.enviarPedido(cliente.getComputadores());

        entrada.close();
    }
}
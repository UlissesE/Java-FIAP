package ulisses.FACTORY;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = CarroFactory.criarCarro("sedan");
        carro1.exibirInfo(); // Exibe: Carro Sedan
        Carro carro2 = CarroFactory.criarCarro("suv");
        carro2.exibirInfo(); // Exibe: Carro SUV
    }
}

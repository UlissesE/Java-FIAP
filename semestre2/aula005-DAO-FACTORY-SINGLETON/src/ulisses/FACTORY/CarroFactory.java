package ulisses.FACTORY;

public class CarroFactory {
    public static Carro criarCarro(String tipo) {
        if ("sedan".equalsIgnoreCase(tipo)) {
            return new Sedan();
        } else if ("suv".equalsIgnoreCase(tipo)) {
            return new SUV();
        }
        return null;
    }
}

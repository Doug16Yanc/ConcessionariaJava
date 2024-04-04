
public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Onix", 2024, "Vermelha", 4);
        Carro carro2 = new Carro("Volkswagen ", "Gol", 2023, "Azul", 4);

        Moto moto1 = new Moto("Yamaha", "FZ15 ABS", 2023, "Preta", 400);
        Moto moto2 = new Moto("Honda", "NXR 160 Bros", 2024, "Branca", 600);

        System.out.println("Descrição do carro 1 : \n\n" + carro1.descricao() + "\n");
        System.out.printf("Descrição do carro 2 : \n\n" + carro2.descricao() + "\n");
        System.out.printf("Descrição da moto 1 : \n\n" + moto1.descricao() + "\n");
        System.out.printf("Descrição da moto 2 : \n\n" + moto2.descricao() + "\n");
    }
}
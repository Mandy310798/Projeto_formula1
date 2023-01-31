public class Main {

    public static void main(String[] args) {

        Pilot p1 = new Pilot();
        p1.name = "Max Verstappen";
        p1.age = 25;
        p1.country = "Holanda";
        p1.w_champ = 2;
        p1.carNumber = 1;

        System.out.println("Nome do Piloto: " + p1.name);
        System.out.println("Idade: " + p1.age);
        System.out.println("País: " + p1.country);
        System.out.println("Campeonatos mundiais: " + p1.w_champ);
        System.out.println("Número do carro: " + p1.carNumber);
    }

}

public class Main {
    public static void main(String[] args) {

        Animais peixe = new Animais();
        System.out.println("Eu sou o animal: " + Animais.getQuantidadeDeAnimais() );



        Animais cavalo = new Animais("peixe", "masculino" );
        System.out.println("Eu sou o animal: " + Animais.getQuantidadeDeAnimais() );



        Animais urso = new Animais("urso", "feminino", "Lola", "05/08/2023");
        System.out.println("Eu sou o animal: " + Animais.getQuantidadeDeAnimais() );
        System.out.println("A quantidade de animais é: " + Animais.getQuantidadeDeAnimais() );

        urso.infoAnimais();
    }
}
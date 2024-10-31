public class Main {

    public static void main(String[] args) {
        Heroi mago = new Heroi("Gandalf", 150, "mago", "");
        Heroi guerreiro = new Heroi("Aragorn", 87, "guerreiro", "");
        Heroi monge = new Heroi("Bruce", 33, "monge", "");
        Heroi ninja = new Heroi("Naruto", 18, "ninja", "");

        mago.atacar();
        guerreiro.atacar();
        monge.atacar();
        ninja.atacar();
    }

}

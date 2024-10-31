public class Heroi {

    private String nomeHeroi;

    private String idade;

    private String tipoHeroi;

    public Heroi(String nomeHeroi, String idade, String tipoHeroi, String ataqueHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.idade = idade;
        this.tipoHeroi = tipoHeroi;
    }

    public void atacar() {
        String ataque;

        switch (this.tipoHeroi) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
                case "monge":
                    ataque = "usou artes marciais";
                    break;
                case "ninja":
                    ataque = "usou shuriken";
                    break;
                default:
                    ataque = "não possui um ataque definido";
        }

        System.out.println("O " + this.tipoHeroi + " atacou usando " + ataque);
    }
}

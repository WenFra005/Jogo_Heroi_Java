public class Heroi {

    private String nomeHeroi;

    private String idade;

    private String tipoHeroi;

    private String ataqueHeroi;

    public Heroi(String nomeHeroi, String idade, String tipoHeroi, String ataqueHeroi) {
        this.nomeHeroi = nomeHeroi;
        this.idade = idade;
        this.tipoHeroi = tipoHeroi;
        this.ataqueHeroi = ataqueHeroi;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTipoHeroi() {
        return tipoHeroi;
    }

    public void setTipoHeroi(String tipoHeroi) {
        this.tipoHeroi = tipoHeroi;
    }

    public String getAtaqueHeroi() {
        return ataqueHeroi;
    }

    public void setAtaqueHeroi(String ataqueHeroi) {
        this.ataqueHeroi = ataqueHeroi;
    }

    @Override
    public String toString() {
        return "Heroi [nomeHeroi=" + nomeHeroi + ", idade=" + idade + ", tipoHeroi=" + tipoHeroi + ", ataqueHeroi="
                + ataqueHeroi + "]";
    }

    
}

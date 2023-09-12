package projeto_iphone2007.ReprodutorMusical;
public class Musica {
    private String autor;
    private String nomeMusica;
    private int anoLancamento;
    private int volume;

    public Musica(String autor, String nomeMusica, int anoLancamento) {
        this.autor = autor;
        this.nomeMusica = nomeMusica;
        this.anoLancamento = anoLancamento;
        this.volume = 5; 
    }

    public String getAutor() {
        return autor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getVolume() {
        return volume;
    }

    public void ajustarVolume(int novoVolume) {
        if (novoVolume >= 0 && novoVolume <= 10) {
            volume = novoVolume;
        }
    }
}

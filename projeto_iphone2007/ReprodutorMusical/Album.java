package projeto_iphone2007.ReprodutorMusical;
import java.util.ArrayList;
import java.util.List;

public class Album{
    private String nome;
    private List<Musica> musicas;

    public Album(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMusica(String autor, String nomeMusica, int anoLancamento) {
        Musica novaMusica = new Musica(autor, nomeMusica, anoLancamento);
        musicas.add(novaMusica);
    }

    public void listarMusicas() {
        System.out.println("Músicas do álbum '" + nome + "':");
        for (int i = 0; i < musicas.size(); i++) {
            Musica musica = musicas.get(i);
            System.out.println((i + 1) + ". " + musica.getNomeMusica());
        }
    }

    public int getNumMusicas() {
        return musicas.size();
    }

    public Musica getMusica(int indice) {
        if (indice >= 0 && indice < musicas.size()) {
            return musicas.get(indice);
        } else {
            return null;
        }
    }

    public void adicionarMusica(String string, String string2, String string3, int i) {
    }

    public void adicionarAlbum(String string) {
    }

    public void adicionarMusica(Musica musica) {
    }
}

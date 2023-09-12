package projeto_iphone2007.ReprodutorMusical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ipod {
    private List<Album> albuns;
    private int volume;
    private Scanner scanner;
    private boolean musicaPausada;
    
    public Ipod() {
        this.albuns = new ArrayList<>();
        this.volume = 5; 
        this.scanner = new Scanner(System.in);
        this.musicaPausada = false;

    }

    public void listarAlbums() {
        System.out.println("Álbuns disponíveis:");
        for (Album album : albuns) {
            System.out.println(album.getNome());
        }
    }

    public void adicionarAlbum(String nomeAlbum) {
        Album album = new Album(nomeAlbum);
        albuns.add(album);
    }

    public void adicionarMusica(String nomeAlbum, String autor, String nomeMusica, int anoLancamento) {
        Album albumSelecionado = encontrarAlbumPeloNome(nomeAlbum);
        if (albumSelecionado != null) {
            albumSelecionado.adicionarMusica(autor, nomeMusica, anoLancamento);
            System.out.println("Música adicionada com sucesso.");
        } else {
            System.out.println("Álbum não encontrado.");
        }
    }
    
    public void reproduzirMusica() {
        System.out.print("Digite o nome do álbum: ");
        String nomeAlbum = scanner.nextLine();
    
        Album albumSelecionado = encontrarAlbumPeloNome(nomeAlbum);
    
        if (albumSelecionado != null) {
            while (true) {
                albumSelecionado.listarMusicas();
                System.out.print("Digite o número da música (ou 0 para voltar ao menu principal, ou -1 para pausar): ");
                int numeroMusica = Integer.parseInt(scanner.nextLine());
    
                if (numeroMusica == 0) {
                    break; 
                } else if (numeroMusica == -1) {
                    pausarOuRetomarMusica(); 
                } else if (numeroMusica >= 1 && numeroMusica <= albumSelecionado.getNumMusicas()) {
                    Musica musicaSelecionada = albumSelecionado.getMusica(numeroMusica - 1);
                    System.out.println("Reproduzindo: " + musicaSelecionada.getNomeMusica());
                } else {
                    System.out.println("Número de música inválido.");
                }
            }
        } else {
            System.out.println("Álbum não encontrado.");
        }
    }

   
    public void pausarOuRetomarMusica() {
        if (musicaPausada) {
            System.out.println("Retomando a reprodução da música.");
            musicaPausada = false;
        } else {
            System.out.println("Pausando a reprodução da música.");
            musicaPausada = true;
        }
    }

    public void ajustarVolume(int novoVolume) {
        if (novoVolume >= 0 && novoVolume <= 10) {
            volume = novoVolume;
            System.out.println("Volume ajustado para: " + volume);
        } else {
            System.out.println("O volume deve estar entre 0 e 10.");
        }
    }

    public void encerrar() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public Album encontrarAlbumPeloNome(String nomeAlbum) {
        for (Album album : albuns) {
            if (album.getNome().equalsIgnoreCase(nomeAlbum)) {
                return album;
            }
        }
        return null; 
    }
}

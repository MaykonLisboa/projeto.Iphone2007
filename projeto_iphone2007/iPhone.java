package projeto_iphone2007;

import java.util.Scanner;
import projeto_iphone2007.AparelhoTelefonico.Telefone;
import projeto_iphone2007.NavegadorDeInternet.SafariMobile;
import projeto_iphone2007.MetodosDeSeguranca.Slide_To_Unlock;
import projeto_iphone2007.ReprodutorMusical.Ipod;

public class iPhone {
    private Ipod ipod;
    private Slide_To_Unlock slideToUnlock;
    private Scanner scanner;
    private Telefone telefone;
    private SafariMobile safariMobile;

    public iPhone(Ipod ipod, Slide_To_Unlock slideToUnlock, Telefone telefone) {
        this.ipod = ipod;
        this.slideToUnlock = slideToUnlock;
        this.scanner = new Scanner(System.in);
        this.telefone = telefone;
        this.safariMobile = new SafariMobile();

        
    }

    public void exibirMenu() {
        while (true) {
            if (!slideToUnlock.isDesbloqueado()) {
                System.out.println("Acesso negado. A tela principal não está desbloqueada.");
                return;
            }

            System.out.println("========== Tela Principal ==========");
            System.out.println("          REPRODUTOR MUSICAL        ");
            System.out.println("1. Escolher música para reproduzir");
            System.out.println("2. Ajustar volume");
            System.out.println("3. Retornar aos álbuns disponíveis");
            System.out.println("===================================");
            System.out.println("         APARELHO TELEFONICO       ");
            System.out.println("4. Fazer uma ligação");
            System.out.println("5. Atender ligação.");
            System.out.println("6. Cancelar ligação");
            System.out.println("7. Ativar correio de voz");
            System.out.println("8. Desativar correio de voz");
            System.out.println("===================================");
            System.out.println("        NAVEGADOR DE INTERNET      ");
            System.out.println("9. Acessar navegação na internet");
            System.out.println("10. Abrir nova Aba");
            System.out.println("11. Atualizar pagina");
            System.out.println("12. Acessar outra url");
            System.out.println("===================================");

            System.out.print("Escolha uma opção: ");
            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    ipod.listarAlbums();
                    ipod.reproduzirMusica();
                    break;
                case 2:
                    System.out.print("Digite o novo volume: ");
                    int novoVolume = Integer.parseInt(scanner.nextLine());
                    ipod.ajustarVolume(novoVolume);
                    break;
                case 3:
                    ipod.listarAlbums();
                    break;
                case 4:
                    telefone.exibirListaDeContatos();
                    System.out.print("Digite o nome do contato para fazer a ligação: ");
                    String nomeContato = scanner.nextLine();
                    telefone.fazerLigacao(nomeContato);
                    break;
                case 5:
                    telefone.atenderLigacao();
                    break;
                case 6:
                    telefone.cancelarLigacao();
                    break;
                case 7:
                    telefone.ativarCorreioDeVoz();
                    break;
                case 8:
                    telefone.desativarCorreioDeVoz();
                    break;
                case 9:
                    safariMobile.exibirAbaAtual();
                    break;
                case 10:
                    safariMobile.abrirNovaAba("www.google.com");
                    break;
                case 11:
                    safariMobile.atualizarPagina();
                    break;
                case 12:
                    System.out.println("Digite uma nova URL:");
                    String novaURL = scanner.nextLine();
                    safariMobile.acessarURL(novaURL);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        Slide_To_Unlock slideToUnlock = new Slide_To_Unlock(true);
        Telefone telefone = new Telefone();

        telefone.adicionarContato("Rogerio", 111); 
        telefone.adicionarContato("Fernanda", 112);
    
        iPhone telaPrincipal = new iPhone(ipod, slideToUnlock, telefone);

        ipod.adicionarAlbum("novo");
        ipod.adicionarMusica("novo", "xxx", "Musica/", 2000);
        ipod.adicionarMusica("novo", "xxx", "Musica//", 2000);
        ipod.adicionarMusica("novo", "xxx", "Musica///", 2000);
        ipod.adicionarMusica("novo", "xxx", "Musica////", 2000);
        ipod.adicionarMusica("novo", "xxx", "Musica/////", 2000);

        ipod.adicionarAlbum("novo2");
        ipod.adicionarMusica("novo2", "xxx2", "Musica/2", 2001);
        ipod.adicionarMusica("novo2", "xxx2", "Musica//2", 2001);
        ipod.adicionarMusica("novo2", "xxx2", "Musica///2", 2001);
        ipod.adicionarMusica("novo2", "xxx2", "Musica////2", 2001);

        slideToUnlock.desbloquear();

        telaPrincipal.exibirMenu();
    }
}

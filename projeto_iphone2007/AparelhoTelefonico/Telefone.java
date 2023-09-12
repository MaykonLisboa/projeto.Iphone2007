package projeto_iphone2007.AparelhoTelefonico;
import java.util.ArrayList;
import java.util.List;

public class Telefone {

    private boolean ligacao;
    private boolean correioDeVoz;
    private List<ListaDeContatos> listaDeContatos;

    public Telefone() {
        this.ligacao = false;
        this.correioDeVoz = false;
        this.listaDeContatos = new ArrayList<>();
    }

    public void setListaDeContatos(List<ListaDeContatos> listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }

    public List<ListaDeContatos> getListaDeContatos() {
        return listaDeContatos;
    }

    public void adicionarContato(String nomeContato, int numContato) {
        ListaDeContatos novoContato = new ListaDeContatos(nomeContato, numContato);
        listaDeContatos.add(novoContato);
        System.out.println("Novo contato adicionado: " + nomeContato + " (" + numContato + ")");
    }

    public void fazerLigacao(String nomeContato) {
        boolean contatoEncontrado = false;
        for (ListaDeContatos contato : listaDeContatos) {
            if (contato.getNomeContato().equalsIgnoreCase(nomeContato)) {
                System.out.println("Ligando para " + contato.getNomeContato() + " (" + contato.getNumContato() + ")");
                ligacao = true;
                contatoEncontrado = true;
                break;
            }
        }
        if (!contatoEncontrado) {
            System.out.println("Contato não encontrado: " + nomeContato);
        }
    }

    public void atenderLigacao(){
        System.out.println("Ligação atendida....");
    }

    public void cancelarLigacao(){
        System.out.println("Cancelando ligação.");
    }

    public void exibirListaDeContatos() {
        List<ListaDeContatos> contatos = getListaDeContatos();
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia.");
        } else {
            System.out.println("=== Lista de Contatos ===");
            for (ListaDeContatos contato : contatos) {
                System.out.println("Nome: " + contato.getNomeContato());
                System.out.println("Número: " + contato.getNumContato());
                System.out.println("-------------------------");
            }
        }
    }

    public void ativarCorreioDeVoz() {
        correioDeVoz = true;
        System.out.println("O correio de voz está ativado.");
    }

    public void desativarCorreioDeVoz() {
        correioDeVoz = false;
        System.out.println("O correio de voz está desativado.");
    }

    public boolean isLigado() {
        return ligacao;
    }

    public boolean isCorreioDeVozAtivado() {
        return correioDeVoz;
    }
}

package projeto_iphone2007.AparelhoTelefonico;
public class ListaDeContatos {

    private String nomeContato;
    private int numContato;
    
    public ListaDeContatos(String nomeContato, int numContato) {
        this.nomeContato = nomeContato;
        this.numContato = numContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public int getNumContato() {
        return numContato;
    }
    
    
}

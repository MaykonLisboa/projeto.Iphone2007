package projeto_iphone2007.MetodosDeSeguranca;
public class BtnLigar_e_Desligar{
    
    
    private boolean btnLigarDesligar;

    public BtnLigar_e_Desligar(boolean btnLigarDesligar) {
        this.btnLigarDesligar = btnLigarDesligar;
    }

    public boolean isLigado(){
        return btnLigarDesligar;
    }

    public void ligar(){
        btnLigarDesligar = true;
    }

    public void desligar(){
        btnLigarDesligar = false;
    }
}

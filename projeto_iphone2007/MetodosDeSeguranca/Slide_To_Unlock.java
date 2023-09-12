package projeto_iphone2007.MetodosDeSeguranca;
public class Slide_To_Unlock extends BtnLigar_e_Desligar{

    private boolean desbloqueado; 

    public Slide_To_Unlock(boolean b) {
        super(true);
        this.desbloqueado = false;
    }

    public boolean isDesbloqueado(){
        return desbloqueado;
    }
    public void desbloquear() {
        System.out.println("======================");
        System.out.println("| iPhone desbloqueado. |");
        System.out.println("======================");

        desbloqueado = true;
    }


}



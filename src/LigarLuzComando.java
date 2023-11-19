public class LigarLuzComando implements Comando {
    private Luz luz;

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.ligar();
    }
}
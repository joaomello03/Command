public class DesligarLuzComando implements Comando {
    private Luz luz;

    public DesligarLuzComando(Luz luz) {
        this.luz = luz;
    }

    public void executar() {
        luz.desligar();
    }
}
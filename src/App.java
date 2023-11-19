public class App {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Comando ligarLuz = new LigarLuzComando(luz);
        Comando desligarLuz = new DesligarLuzComando(luz);
        ControleRemoto controle = new ControleRemoto();

        //Ligando a luz
        System.out.println("Ligando a luz:");
        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        //Desligando a luz
        System.out.println("\nDesligando a luz:");
        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }
}
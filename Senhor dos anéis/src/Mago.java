public class Mago  extends Habitante{
    private String cor;


    //metodos
    public void atacar() {

    }
    public void mostrarInfos(){
        System.out.println("- Mago -");
        super.mostrarInfos();
        System.out.println("Cor: " + cor);
    }

    //set e geter
    public void setCor(String cor) {
        this.cor = cor;
    }
}

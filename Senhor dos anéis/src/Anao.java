public class Anao extends Habitante {
    private float altura;
    private String reino;

    //metodos
    public void atacar(){

    }
    public void mostrarInfos(){
        System.out.println("- Anao -");
        super.mostrarInfos();
        System.out.println("Altura: " + altura);
        System.out.println("Reino: " + reino);
    }

    //seters e getters
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setReino(String reino) {
        this.reino = reino;
    }
}

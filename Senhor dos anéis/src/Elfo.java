public class Elfo extends Habitante{
    private String tribo;

    //metodos
    public void viajar(){

    }
    public void atacar(){

    }
    public void mostrarInfos(){
        System.out.println("- Elfo -");
        super.mostrarInfos();
        System.out.println("Tribo: " + tribo);
    }

    //seter e getters

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}

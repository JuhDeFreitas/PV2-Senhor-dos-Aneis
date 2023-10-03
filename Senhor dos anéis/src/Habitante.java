abstract class Habitante {
    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    //adicionar arma
    Arma arma;

    Habitante(){
        this.contador++;
        this.id = contador;
    }

    //metodos
    public void atacar(){

    }
    public void mostrarInfos(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
    }

}

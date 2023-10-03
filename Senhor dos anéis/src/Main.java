public class Main {
    public static void main(String[] args) {
        Elfo elfo = new Elfo();
        elfo.energia = 10;
        elfo.id = 2;
        elfo.idade = 150;
        elfo.nome = "Dobby";
        elfo.setTribo("Grifindor");

        Mago mago = new Mago();
        mago.energia = 100;
        mago.id = 3;
        mago.idade = 300;
        mago.nome = "harry";
        mago.setCor("vermelho");

        Anao anao = new Anao();
        anao.energia = 100;
        anao.id = 3;
        anao.idade = 300;
        anao.nome = "harry";
        anao.setAltura(1.0F);
        anao.setReino("Reino gelado");

        TerraMedia terraMedia = new TerraMedia();

        //adicionando os hab. na terra media
        terraMedia.addHabitante(elfo);
        terraMedia.addHabitante(anao);
        terraMedia.addHabitante(mago);

        terraMedia.listarHabitantes();

    }
}


public class reprodutor {
    private String nomeMusica;

    public reprodutor(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void tocar(){
        System.out.println("Tocando musica");
    }

    public void pausar(){
        System.out.println("Musica pausada.");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando musica.");
    }
}



public class telefone extends Iphone {
    private int numero;
    
    public telefone(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void ligar(){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Alo!");
    }

    public void iniciarCorreio(){
        System.out.println("Abrindo correio de voz.");
    }
}

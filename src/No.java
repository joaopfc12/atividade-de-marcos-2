public class No {
    public final Integer chave;
    public int altura;

    public No direita;
    public No esquerda;

    public No(Integer chave) {
        this.chave = chave;
        this.altura = 1;      
        this.direita = null;
        this.esquerda = null;
    }
}

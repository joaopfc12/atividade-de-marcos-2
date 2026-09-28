public class AVL {
    public No raiz;

    public AVL() {
        this.raiz = null;   
    }

    public int altura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    public int calcularFatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.direita) - altura(no.esquerda);
    }
}

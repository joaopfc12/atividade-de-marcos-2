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

    private No rotacaoEsquerda(No y) {
        No x = y.direita;
        No t2 = x.esquerda;

        x.esquerda = y;
        y.direita = t2;

        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));

        return x;
    }

        private No rotacaoDireita(No y) {
        No x = y.esquerda;      
        No t2 = x.direita;      

        x.direita = y;         
        y.esquerda = t2;       

        y.altura = 1 + Math.max(altura(y.esquerda), altura(y.direita));
        x.altura = 1 + Math.max(altura(x.esquerda), altura(x.direita));

        return x;
    }

}

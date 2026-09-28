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


    private No balancear(No no) {
        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int fb = calcularFatorBalanceamento(no);

        if (fb > 1) {
            if (calcularFatorBalanceamento(no.direita) < 0) {
                no.direita = rotacaoDireita(no.direita);
            }
            return rotacaoEsquerda(no);
        }

        if (fb < -1) {
            if (calcularFatorBalanceamento(no.esquerda) > 0) {
                no.esquerda = rotacaoEsquerda(no.esquerda);
            }
            return rotacaoDireita(no);
        }

        return no;
    }


    public void put(Integer chave) {
        raiz = put(raiz, chave);
    }

    private No put(No no, Integer chave) {
        if (no == null) {
            return new No(chave);
        }

        int cmp = chave.compareTo(no.chave);

        if (cmp < 0) {
            no.esquerda = put(no.esquerda, chave);
        } else if (cmp > 0) {
            no.direita = put(no.direita, chave);
        } else {
            return no;
        }

        return balancear(no);
    }


    public Integer get(Integer chave) {
        No no = get(raiz, chave);
        if (no == null) {
            return null;
        }
        return no.chave;
    }

    private No get(No no, Integer chave) {
        if (no == null) {
            return null;
        }

        int cmp = chave.compareTo(no.chave);

        if (cmp < 0) {
            return get(no.esquerda, chave);
        } else if (cmp > 0) {
            return get(no.direita, chave);
        }
        return no;
    }


    public Integer max() {
        No no = max(raiz);
        if (no == null) {
            return null;
        }
        return no.chave;
    }

    private No max(No no) {
        if (no == null) {
            return null;
        }
        if (no.direita == null) {
            return no;
        }
        return max(no.direita);
    }


}
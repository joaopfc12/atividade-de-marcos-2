> [!IMPORTANT]
> **Nome obrigatório do repositório**
>
> Ao criar seu repositório usando este template, utilize:
> `implementacao-AVL-[nome-do-aluno]-[sobrenome-do-aluno]`
>
> Substitua `[nome-do-aluno]` e `[[sobrenome-do-aluno]]` pelo seu nome, sem espaços ou acentos e usando hífens quando necessário.
> Exemplo: `implementacao-AVL-marcos-canejo`
---

# Apresentação da Atividade

## Identificação

**Disciplina**: Árvores e Ordenação de Dados
\
**Atividade**: Implementação Árvore AVL

## Instruções

- Sua implementação deve estar dentro da pasta `src/`
- O estudante deve acessar o roteiro de avaliação disponível em:
  - **[questoes/index.html](questoes/index.html)**
- As questões contidas na pasta **[questoes/](questoes/)** devem ser respondidas de forma **manuscrita** e os arquivos (fotos/PDF escaneado) devem ser inseridos na pasta **[respostas/](respostas/)**.

### Observações

O estudante é responsável por compreender integralmente todo o código submetido. Durante a avaliação, poderá ser solicitado a explicar, executar, depurar ou modificar qualquer trecho de sua implementação. A incapacidade de explicar ou modificar o código poderá resultar na perda da pontuação correspondente à implementação.

## Descrição

Implemente a **Árvore AVL** conforme apresentada em sala de aula, utilizando o fator de balanceamento definido como `alturaDireita - alturaEsquerda`. Na operação de remoção, o vértice removido deve ser substituído pelo **maior elemento da subárvore esquerda**.

A implementação deve conter as seguintes classes:

```java
public class AVL {
    public No raiz;

    public AVL();
    public void put(Integer chave);
    private No put(No no, Integer chave);
    public int altura(No no);
    private No balancear(No no);
    private No rotacaoEsquerda(No y);
    private No rotacaoDireita(No y);
    public int calcularFatorBalanceamento(No no);
    public Integer get(Integer chave);
    private No get(No no, Integer chave);
    public void deletar(Integer chave);
    private No deletar(No no, Integer chave);
    public No deletarMax(No no);
    public Integer max();
    private No max(No no);
}

public class No {
    public final Integer chave;
    public int altura;

    public No direita;
    public No esquerda;

    public No(Integer chave);
}
```


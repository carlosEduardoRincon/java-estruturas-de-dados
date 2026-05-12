### Queue

- FIFO (first in first out)
- Utilizada para fazer streaming/buffering de dados;
- A sua implementação comum é por listas encadeadas;
- Contém uma referência apontando para o começo da lista (head) e uma apontando para o fim (tail);
- A referência do tail facilita a inserção de novos itens na lista, sendo necessário o último item apontar para o novo e o tail passar a ser o novo item;

  - Inserção: O(1)
  - Remoção: O(1)

### Dequeue

- É permitido tirar itens tanto do início quando do final da lista;
- A sua implementação comum é por uma lista duplamente ligada;
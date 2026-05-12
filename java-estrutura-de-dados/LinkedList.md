### Linked List

- Os itens não estão sequenciados fisicamente na memória;
- Cada item aponta para o próximo item;

  - Leitura:
    - Best: O(1) -> cenários em que acesso o primeiro item da lista
    - Worst: O(n)
  - Adição de novos itens:  
    - Best: O(1) -> cenários em que insiro no final da lista
    - Worst: O(n) -> inserir no meio da lista (no cenário de não ter a referência da localização do objeto, ou seja, sendo necessário realizar primeiro um read[O(n)])
  - Remoção:
    - Best: O(1) -> cenários em que removo no final da lista
    - Worst: O(n) 
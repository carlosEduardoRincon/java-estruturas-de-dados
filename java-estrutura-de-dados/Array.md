### Array

- Lista com valores armazenados, estes são enumerados com índices
  - Espaço físico contínuo na memória:
  Ex.: [11110000111100]
  - Este pode ser interpretado de inúmeras formas, a forma é o qu chamamos view
  Ex.: [11 11 00 00 11 00]
  Ex.: [1111 0000 1100]
  Ex.: [111100 001100]
  - A forma que é alocado o array na memória permite um acesso fácil, não sendo necessário acessar um item por vez,
  e sim indo direto à posição exata do índice.
  - A velocidade de acesso é constante, ou seja, O(1)
  - Para adicionar um novo elemento a lógica é um pouco diferente, é necessário mover todos os elementos para um espaço
  onde todos os elementos fiquem juntos de maneira contínua;

  - Leitura/Edição:         O(1)
  - Adição de novos itens:  O(N) 

  0x16 bits (índice 0 do array)
  1x16 bits (índice 1 do array)
  2x16 bits (índice 2 do array)
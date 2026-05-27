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

### Arrays estáticos x Dinâmicos
  
  - Estático:
    - Necessário especificar o tipo de dado que será armazenado e o tamanho que deverá
    ser alocado;
    - Tamanho fixo definido em tempo de compilação; 
    - É alocado na memória stack ou na memória estática;
    - Não muda de tamanho;
    - ++ performance;
    - Menos operações devido ao fato que não tem redimensionamento;
    - Segurança / menos chance de ocorrer memory leak;
    - Utilidade: sistemas com performance crítica;
    - C, Rust;

  - Dinâmico: 
    - Array do javascript, python ou java onde o array é inicializado assim arr = [];
    - Tamanho variável durante a runtime;
    - É alocado na memória heap;
    - Aumenta o tamanho e diminui em execução;
    - -- performance ++ flexibilidade;
    - Existe a possibilidade de redimensionar (O(N));
    - Utilidade: sistemas que exigem maior flexibilidade e quando não sabemos o tamanho de dados que precisamos alocar;
        
### Cache
  Acesso de informação mais rápido do que da memória RAM;  

  Dentro do processador (Mb):
  - L1: menor e mais rápida;
  - L2: intermediária;
  - L3: maior e menos rápida;

  Os array são preferíveis para a implementação de cache, dado que:
  - Existe uma localidade espacial, visto que, os dados estão todos próximos um dos outros;
  - Tamanho: estrutura de dados enxuta;

Tipos de problemas:
  - Sliding window;
  - Two pointer;
  - Binary search;
  - Exponential search;
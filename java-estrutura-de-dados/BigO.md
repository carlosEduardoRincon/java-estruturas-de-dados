### Big O Notation

- Uma forma de denotar desempenho do algoritmo, entretanto não é necessariamente uma medida de performance;
- Ele diz como será a escalabilidade do sistema baseado no *input* do sistema;
- Não podemos afirmar que um O(n) é mais rápido do que o O(n²) sem uma análise mais detalhada (análise assintótica);
- Entretanto, podemos afirmar qual irá escalar melhor dado uma entrada maior;
- Sempre utilizamos o cenário pessimista/no pior dos casos;
- Utilizado para medir a complexidade:
  - Temporal: tempo de execução em runtime, quantidade de análises, quantos acessos;
  - Espacial: quanto de memória adicional precisamos alocar;
---

- O(1): 
  - Tempo/memória constante, ou seja, independente da entrada no sistema, este terá o mesmo tempo de execução, pegar o primeiro elemento do array;
  - Se alocar 1k de array, independente da entrada, ou seja, não aumentar a quantidade de alocação a medida que a entrada aumento, este é um algoritmo constante;

- O (LOG N):
  - Binary Search (buscando sempre o meio do array), nele ao dobrar o tamanho do *input* a execução aumenta apenas uma unidade;
  - Conforme o *input* aumenta muito, o tempo de execução não aumenta tão rápido quanto;

- O (N):
  - Percorrer todos os elementos de um array;
  - Dado um *input* é alocado na memória um *input* de mesmo tamanho, se o *input* dobrar, a quantidade de memória alocada também irá dobrar;

- O (N LOG N)
  - Algoritmos de sorting (quick sort, merge sort, exceto bubble sort) e divide and conquer;
  - Ele percorre o array de forma horizontal, percorrendo todos os campos O(n);
  - E, ao mesmo tempo, tem uma a profundidade de O(log n);
  - Ou seja, n x log n = n log n;

- O (n²)
  - Looping dentro de um looping;
  - Para cada item do array ele checa todos os itens;
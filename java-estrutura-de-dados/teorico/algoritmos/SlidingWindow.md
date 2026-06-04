### Sliding Window

- Quando a solução de um problema envolve um subarray ou substring;

- Um while externo vai expandindo a janela e um while interno que vai contraindo a janela;

- HashMap para contabilizar as repetições;

Ex. de problemas:

- Encontrar a maior sequência de caracteres que não se repetem;

- Complexidade:
  - Temporal: O(log n) -> ao dobrar a entrada (tamanho do array) aumentasse apenas 1 iteração;
  - Espacial: O(1) -> não precisa alocar espaço adicional na memória;

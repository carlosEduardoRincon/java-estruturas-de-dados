### HashMap

- Em python é o famoso dictionary;
- Complexidade Média de consulta de O(1);
- No pior dos casos O(n): quando ocorre uma colisão de espaço o valor pode ser
alocado em outra opção, ou seja, quando chegar ele procurar pela key será necessário
percorrer o array inteiro.

- Como uma lista de valores que podem ser acessadas em O(1)?
  - Com LinkedList não é possível;
  - Com Array teoricamente seria possível sabendo a posição exata do objeto;

- Hashing Function:
  - Transforma a key num valor que será a exata posição no slot do array que está armazenado o item que desejamos
  - Como para a mesma entrada a hashFunction sempre vai gerar um mesmo valor,
  com isso vamos saber a exata posição que o elemento irá se encontrar
  - SHA-256 ou MD5: transforma a key num número enorme

Load Factor:
  - Diferença de tamanho da quantidade de dados e a estrutura de dados;
  - Ex.: Array com 10 posições e com duas posições ocupados tem um load factor de 20%;
  - Load Factor máximo de 70%, quando ele valor é atingido, dobrasse o espaço selecionado
  na memória e são realocados os valores antigos

Collisions:
  - A partir do load factor temos a noção de que é possível ocorrer uma colisão no
  no armazenamento dos dados dentro da estrutura;
  - A colisão faz com que o item seja armazenado no espaço restante;
  - Uma melhor prática que vem sendo aplicada é quando os elementos colidirem 
  criar uma subestrutura de dados, como a LinkedList (garantir que ela seja pequena)
  para armazenar os elementos que tiveram colisão
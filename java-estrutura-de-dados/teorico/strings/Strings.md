### Strings

- São imutáveis, ou seja, uma vez instanciada na memória o valor não é substituído, ele é instanciado um novo espaço da memória;
- Ex.: 
 ```java 
  String x = "abc"; // aloca um espaço na memória;
  x = "abcd"; // aloca um novo espaço na memória e 'x' passa apontar para o novo endereço;
  String y = x; // 'y' passa apontar para o endereço em que a variável 'x' está apontando; 
```

- Valores não podem ser modificados (evitando side effects);
- Thread safe;
- Importante ter esse conhecimento dado que se para algoritmos realizarmos a concatenação de string estamos a criar endereços na memória;

- Prática de interning: 
  - Definir um string global para não ser utilizada inúmeras vezes no código;
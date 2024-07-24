# Optional em Java

A classe `Optional` em Java foi introduzida a partir do Java 8 para oferecer uma abordagem mais segura e expressiva para lidar com valores que podem estar ausentes (nulos). Ela ajuda a evitar o temido `NullPointerException` ao encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso requer que o código que deseja acessar o valor faça uma verificação explícita da presença do mesmo.

### Métodos Principais

#### Criando um Optional

- **`of(value)`**: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção `NullPointerException`.

  Exemplo:
  ```java
  Optional<String> optionalValue = Optional.of("Hello");
  System.out.println(optionalValue.get()); // Saída: Hello
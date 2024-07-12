# Generics Type

Um tipo genérico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
A classe Box a seguir será modificada para demonstrar o conceito:
``` java
    public class Box {
        private Object object;

        public void set(Object object) { this.object = object; }
        public Object get() { return object; }
    }
```
O símbolo <> é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código public class Box para public class Box<T>.
Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:
```java
    /**
    Versão genérica da classe Box.
    @param <T> o tipo do valor sendo armazenado
    */
    public class Box<T> {
        // T representa "Type" (tipo)
        private T t;

        public void set(T t) { this.t = t; }
        public T get() { return t; }
    }
```
Como você pode ver, todas as ocorrências de Object são substituídas por T.
Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.
Essa mesma técnica pode ser aplicada para criar interfaces genérica.
Os nomes de parâmetros de tipo mais comumente usados são:
- E - Elemento (usado extensivamente pelo Java Collections Framework)
- K - Chave
- N - Número
- T - Tipo
- V - Valor
- S, U, V, etc. - 2º, 3º, 4º tipos

## Referência

[https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java/generics](https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java/generics)

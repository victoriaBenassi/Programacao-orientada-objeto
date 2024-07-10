# Enums

Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto, que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.
Exemplos:

Grau de Escolaridade: Analfabeto, Fundamental, Médio, Superior;

Estado Civil: Solteiro, Casado, Divorciado, Viúvo;

Estados Brasileiros: São Paulo, Rio de Janeiro, Piauí, Maranhão.

## Boas práticas para criar objetos Enum

As opções (objetos), devem ser descritos em caixa alta separados por underline (_), ex.: OPCAO_UM, OPCAO_DOIS;

- Após as opções, deve-se encerrar com ponto e vírgula ";" ;

- Um enum é como uma classe, logo, poderá ter atributos e métodos tranquilamente;

- Os valores dos atributos, devem já ser definidos após cada opção, dentro de parênteses como se fosse um new;

- O construtor deve ser privado;

- Não é comum um enum possuir o recurso setter(alteração de propriedade), somente os métodos getters correspondentes.    As opções (objetos), devem ser descritos em caixa alta separados por underline (_), ex.: OPCAO_UM, OPCAO_DOIS;

- Após as opções, deve-se encerrar com ponto e vírgula ";" ;

- Um enum é como uma classe, logo, poderá ter atributos e métodos tranquilamente;

- Os valores dos atributos, devem já ser definidos após cada opção, dentro de parênteses como se fosse um new;

- O construtor deve ser privado;

- Não é comum um enum possuir o recurso setter(alteração de propriedade), somente os métodos getters correspondentes.

## Referencia

[ENUMS](https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/enums)
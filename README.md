# README

Olá! Este é um breve resumo do meu código Kotlin. Ele é um programa simples que solicita ao usuário que insira números separados por espaços, converte esses números em um `ArrayList` de `Int` e, em seguida, calcula a soma desses números. Vamos dar uma olhada mais detalhada em cada parte do código:

## main.kt

Aqui está o ponto de entrada do meu programa. Primeiro, ele solicita ao usuário que insira números separados por espaços. Em seguida, ele usa a função `stringToArrayListInt` da classe `Convert` para converter a entrada do usuário em um `ArrayList` de `Int`. Finalmente, ele calcula a soma dos números no `ArrayList` usando a função `sum` da classe `Calculator` e imprime o resultado.

## Calculator.kt

A classe `Calculator` contém uma função `sum` que recebe um `ArrayList` de `Int` como parâmetro. A função `sum` percorre cada número no `ArrayList` e adiciona-o a uma variável `sumValue`. A função então retorna `sumValue`.

## Convert.kt

A classe `Convert` contém uma função `stringToArrayListInt` que recebe uma `String` como parâmetro. A função divide a `String` em um `ArrayList` de `String` onde cada elemento é um número inserido pelo usuário. Em seguida, ela verifica se a entrada do usuário é válida usando as funções `formatInputIsValid` e `arrayListIsValid` da classe `Validator`. Se a entrada for válida, a função converte cada elemento do `ArrayList` de `String` em um `Int` e adiciona-o a um novo `ArrayList` de `Int`. A função então retorna o `ArrayList` de `Int`. Se ocorrer uma exceção durante a conversão de `String` para `Int`, a função imprime a mensagem de erro e retorna `null`.

## Validator.kt

A classe `Validator` contém duas funções: `arrayListIsValid` e `formatInputIsValid`. A função `arrayListIsValid` verifica se o `ArrayList` de `String` tem pelo menos dois elementos. Se não tiver, ela lança uma `IllegalArgumentException`. A função `formatInputIsValid` verifica se a entrada do usuário não é nula ou vazia. Se for, ela lança uma `IllegalArgumentException`.

Espero que isso ajude a entender melhor o meu código! Se você tiver mais perguntas, fique à vontade para perguntar.

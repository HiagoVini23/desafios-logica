# Desafios de Lógica

## 1. Desafio Resistores – Código de Cores

### Descrição

Os resistores são componentes elétricos que possuem listras ou faixas coloridas para indicar o valor da sua resistência em ohms, além da tolerância permitida. Cada cor corresponde a um valor específico, e a combinação das cores define o valor total do resistor.

Imagine que você é Diogo, o dono de um "Kit Básico Raspberry Pi", que esvaziou diversos sacos zip-lock contendo resistores. Para facilitar seu projeto, você precisa de um programa que, dado um valor de resistência necessário, determine a sequência correta de cores para os resistores.

### Tarefa

Desenvolva um algoritmo que converta um valor de resistência (em ohms) em sua representação de cores correspondente, de acordo com o código de cores dos resistores. A saída deve ser uma sequência de cores que, quando lida da esquerda para a direita, representa o valor da resistência.

Sua função deverá receber uma string contendo o valor de ohms a ser convertido, seguido de um espaço e a palavra "ohms" (ex: `47 ohms`).

Os valores de entrada seguem as seguintes regras:
- Para resistores menores que 1000 ohms, o valor em ohms é formatado apenas como um número simples. Por exemplo, para um resistor de `47 ohms`, sua função receberia a string `"47 ohms"` e retornaria a string `"amarelo violeta preto dourado"`.
- Para resistores maiores ou iguais a 1000 ohms, mas menores que 1.000.000 ohms, o valor de ohms é dividido por 1000 e tem um `"k"` minúsculo depois dele. Por exemplo, se sua função recebesse a string `"4.7k ohms"`, ela precisaria retornar a string `"amarelo violeta vermelho dourado"`.
- Para resistores maiores ou iguais a 1.000.000 ohms, o valor de ohms é dividido por 1.000.000 e tem um `"M"` maiúsculo depois dele. Por exemplo, se sua função recebesse a string `"1M ohms"`, ela precisaria retornar a string `"marrom preto verde dourado"`.

### Código de Cores dos Resistores

Os códigos básicos dos resistores são:
- 0: preto
- 1: marrom
- 2: vermelho
- 3: laranja
- 4: amarelo
- 5: verde
- 6: azul
- 7: violeta
- 8: cinza
- 9: branco

Todos os resistores possuem pelo menos três bandas:
- A primeira e a segunda banda correspondem ao primeiro e segundo dígito do valor de ohms.
- A terceira indica a potência de 10 que deve ser multiplicada para obter o valor.

Exemplo: Um resistor de 47 ohms é igual a `47 * 10^0`, e teria a seguinte sequência de cores: `"amarelo violeta preto"`. A maioria dos resistores também possui uma quarta faixa que indica sua tolerância (5%, por exemplo), representada por uma faixa dourada. Portanto, no exemplo acima, ficaria `"amarelo violeta preto dourado"`.

### Exemplos

- `"10 ohms"` => `"marrom preto preto dourado"`
- `"100 ohms"` => `"marrom preto marrom dourado"`
- `"220 ohms"` => `"vermelho vermelho marrom dourado"`
- `"330 ohms"` => `"laranja laranja marrom dourado"`
- `"470 ohms"` => `"amarelo violeta marrom dourado"`
- `"680 ohms"` => `"azul cinza marrom dourado"`
- `"1k ohms"` => `"marrom preto vermelho dourado"`
- `"2M ohms"` => `"vermelho preto verde dourado"`

## 2. Desafio Snail

### Descrição

Dada uma matriz quadrada \( N \times N \), o desafio é retornar os valores da matriz organizados em um padrão espiral. Começando pelos elementos mais externos e movendo-se em sentido horário em direção ao centro da matriz.

### Tarefa

Desenvolva uma função que leia uma matriz quadrada e retorne os valores dos elementos seguindo um padrão espiral em sentido horário. 

### Requisitos

- Implementar uma função que receba uma matriz quadrada e retorne uma lista com os valores organizados em espiral.
- A função deve funcionar para matrizes de qualquer tamanho \( N \times N \).

### Exemplos

- Entrada: [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ]

- Saída: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

- Entrada: [ [ 1, 2, 3, 4], [ 5, 6, 7, 8], [ 9,10,11,12], [13,14,15,16] ]

- Saída: `[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]`

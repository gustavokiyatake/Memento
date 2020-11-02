# Memento Pattern
## Objetivo
É um padrão de projeto de software documentado no Catálogo Gang of Four, sendo considerado como um padrão comportamental. Ele permite armazenar o estado interno de um objeto em um determinando momento, para que seja possível retorná-lo a este estado, sem que isso cause problemas com o encapsulamento
## Motivação
O Padrão Comportamental Memento possui uma grande gama de aplicações onde é necessário a recuperação de um estado anterior de um objeto como um todo, qualquer tipo de editor precisa oferecer uma maneira de desfazer ações como restaurar imagens, textos etc. Para isso, o padrão Memento procura recuperar o estado anterior dessas ações e copiar os mesmos para um objeto a ser restaurado.
## Aplicabilidade
 Utilize o padrão Memento quando você quer produzir retratos do estado de um objeto para ser capaz de restaurar um estado anterior do objeto.
## Estrutura
![structure](https://refactoring.guru/images/patterns/diagrams/memento/structure1.png)
## Participantes
#### Originator
Pode produzir retratos de seu próprio estado, bem como restaurar seu estado de retratos quando necessário.
#### Memento
O Memento é um objeto de valor que age como um retrato do estado do originator. É uma prática comum fazer o memento imutável e passar os dados para ele apenas uma vez, através do construtor.
#### Caretaker
Caretaker sabe não só “quando” e “por quê” capturar o estado do originator, mas também quando o estado deve ser restaurado.
Caretaker pode manter registros do histórico do originator armazenando os mementos em um pilha. Quando o originator precisa voltar atrás no histórico, a Caretaker busca o memento mais do topo da pilha e o passa para o método de restauração do originator.

# Exemplo de Implementação

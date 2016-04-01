## Notas

##### Geral

- Linguagens onde existe apenas uma sequência de instruções (Assembly, por exemplo) tendem a se mostrar muito complicadas para grandes programas.
- Evitar soluções extremamente complexas, onde outros programadores não conseguiriam entender como o problema foi solucionado.
- Manutenção é muito importante. Corrigir bugs e melhorar sistemas pode ser muito mais desafiador do que criar o programa inicialmente.
- Pensar no futuro do programa ao desenvolvê-lo. É possível (e provável) que soluções aceitáveis no momento não sejam viáveis no futuro.

##### Orientação a Objetos

- A programação orientada a objetos utiliza uma perspectiva mais humana da realidade, com concepções e compreensões hierárquicas.
- É uma estratégia para organizar sistemas, com coleções de objetos que interagem entre si, combinando estado (dados) e comportamento (ações).
- Objetos são "coisas" contendo dados e ações. Dados são variáveis, representadas por campos; ações são funções, representadas por métodos.
- Smalltalk foi uma das linguagens pioneiras no paradigma orientado a objetos. Influenciou diversas outras linguagens e conceitos. Alguns padrões de projetos foram inicialmente desenvolvidos nesta linguagem.
- Programar orientado a objetos é classificar: modelar elementos da realidade; criar classes; definir seus estados e comportamento.
- Classes são "moldes"; modelos para objetos.
- Objetos são instâncias de classes. Por exemplo, uma sala contém várias instâncias da classe da Aluno.
- Classes se diferem de structs em duas principais formas: structs contém somente dados, enquanto classes também possuem ações; e structs não possuem modificadores de acesso, enquanto classes permitem controlar a exposição de variáveis e funções (estabelecem regras).

##### UML

- Nomes de classes e atributos devem ser substantivos, enquanto métodos devem ser verbos.
- Existem diversos diagramas, como classes, sequências e eventos. A disciplina abordará apenas diagramas de classe, que contém nome, atributos, métodos e relações.
- Símbolos de visibilidade: + para público, - para privado, # para protegido.
- Relações possuem navegabilidade. Duas classes podem conhecer umas às outras, ou apenas uma pode conhecer a outra.
- Existem diversos tipos de relações: associação, agregação, composição, herança e dependência.
- Associação e agregação são similares: indicam uma relação fraca, onde um pode existir sem o outro.
- Composição é uma relação mais forte, onde um não pode existir sem o outro (gerencia sua existência).

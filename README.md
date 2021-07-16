"# bootcamp-everis-estrutura-de-dados" 

Memórias

	Em estrutura de dados temos um componente muito importante: a memória. A estrutura de dados, como o própio nome revela, estrutura os dados, e os dados são armazenados em um  lugar que conhecemos por memória. Existem dois grandes grupos de memória: primária e secundária. Como melhor exemplo de memória primária, também conhecida com memória de trabalho, temos a memória RAM que é responsável por armazenar os dados dos processos concorrentes em uma cpu. Um bom exemplo de memória secundária é o HD, que é uma reponsável por armazenar dados por longos períodos. As memórias primárias geralmente são voláteis, o que significa que somente armazena os dados enquanto houver a presença de energia. Ou seja, ao desligarmos um computador, os dados presentes na memória RAM são perdidos.
  
Atribuição E Referência

	- As atribuições em Java são por cópia de valor sempre

	- Com tipo primitivo, copiamos o valor em memória

	- Com objetos copiamos o valor da referência em memória, sem duplicar o objeto

Conceito De Nó E Encadeamento

	O encadeamento de nó funciona de forma que cada valor (inteiro, por exemplo), possui em seu espaço de memória reservado para o mesmo não somente o seu valor, mas também, algo que se chama referência de nó. Esta referência de nó estará armazenando uma posição na memória que aponta para o próximo valor de uma lista.
  
Generics

	Contexto

	- Evitar casting excessivo
	- Evitar códigos redundantes
	- Encontrar erros em tempo de compilação
	- Introduzido desde o Java SE 5.0

	Wildcards (tradução literal: coringas)

	Unknown Wildcard (Unbounded)
	Bounded Wildcard (Upper Bounded/Lower Bounded)

	Exemplo Unknown Wildcard: Um método que imprime qualquer lista passada como parâmetro

	public void imprimeLista(List<?> lista){...}

	Exemplo Upper Bounded Wildcard: Um método que imprime qualquer lista passada que seja do tipo Pessoa, ou que seja descendente desta classe

	public void imprimeLista(List<? extends Pessoa> lista){...}

	Exemplo Lower Bounded Wildcard: Um método que imprime qualquer lista passada, com excessão de lista do tipo Pessoa ou que são descendente desta classe

	public void imprimeLista(List<? super Pessoa> lista){...}

Convenções

	K para "Key", exemplo: Map<K, V>
	V para "Value", exemplo: Map<K, V>
	E para "Element", exemplo: List<E>
	T PARA "Type", exemplo: Collections#addAll
	? quando genérico

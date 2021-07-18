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

Pilha

	É uma estrutura de dados que possui como característica a seguinte regra: o último que entra é o primeiro que sai.

	LIFO - Last In First Out

	Método Top

		ex: No meuNo = pilha.top();

		meuNo recebe a referência do último elemento adicionado à pilha

	Método Pop

		ex No meuNo = pilha.pop();

		meuNo recebe a referência do último elemento adicionado à pilha e o mesmo é retirado da pilha

	Método Push
		
		No meuNo = new No();
		meuNo.setInt(1);

		meuNo recebe a referência do novo elemento da lista

	Método isEmpty

		public boolean isEmpty(){
			if(refNo == null) {
				return true;
			}
			return false;
		}

		Retorna false se a pilha está vazia e true caso contrário

Fila

	É uma estrutura de dados que possui como característica a seguinte regra: o primeiro que entra é o primeiro que sai

	FIFO - First In First Out

	Método Enqueue (Enfilerar)

		Adiciona um novo nó ao fim da fila

	Método DeEnqueue (Desenfilerar)

		O primeiro nó é excluído da fila

    Método First

        Retorna o primeiro objeto da fila

    Método IsEmpty

        Retorna false se a fila esá vazia e true caso contrário

Listas Encadeadas

	Estrutura da Lista

	[{ref. nó}] -> [{object, ref. nó}] -> [{object, ref. nó}] -> [{object, ref. nó}] -> null

	Método Add

	Adicionar um objeto em uma determinada posição da lista

	Método Remove

	Remover um objeto da lista

	Método Get

	Retornar a referência de um objeto da lista

	
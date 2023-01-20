# PROGRAMAÇÃO ORIENTADA A OBJETO

1. PROGRAMAÇÃO ESTRUTURADA – mais simplista, pensa em como fazer.
2. PROGRAMAÇÃO ORIENTADA A OBJETOS - mais realista, pensa no que fazer.
3. #### ***PILARES DO POO – abstração, reuso, encapsulamento***

## CONCEITOS IMPORTANTES:
* CLASSE – estrutura que abstrai conjunto de objetos com características similares. Deve ser nomeado com substantivo, nome significativo e dentro do contexto. Ex: bola, venda, carro
* ATRIBUTO – elemento que define a estrutura de dados dentro da classe. Deve ser nomeado com substantivo e adjetivos, com nome e contexto adequado. Pode ser Int, String... Ex: bola- diâmetro, carro – cor, venda – valor. Variável pode mudar, atributo é constante.
* MÉTODO – operação/parâmetros (ações ou comportamentos) que a classe possa oferecer. Nomeado com verbo. Ex: carro – ligar, venda – calcular total. Class Carro{{void frear(){...}}
Métodos especiais: sobrecarga, construtor (é o método normal) e destrutor (class Carro {void finalize(){...}} é usada para finalizar algum método que tenha sido iniciado.
* SOBECARGA – mudar a assinatura de acordo com a necessidade. Assinatura é  o nome + parâmetro.
* OBJETO – representação de um conceito/entidade. Classe é estática/molde e o objeto é que vai ser manipulado e executar o método. Carro carro = new Carro ()
* MENSAGEM – processo de ativação de um método de um objeto ou classe. Carro carro = new carro(); carro.<método>; ou  se for ativar a classe é Carro.<método>;

## HERANÇA
HERANÇA – relacionamento entre classes. A subclasse herda atributos e métodos. class A extends B {...} A está herdando de B
Tipos: Simples (classe filha tem só uma classe mãe) e Múltipla (classe filha tem uma ou mais classes mães no java não é indicado, só em Python e C++)
Upcast  A a = new B() subindo na hierarquia de classe. O filho se transforma na mãe.
Downcast  B a = (B) new A() desce na hierarquia e tem que ser explícito a classe mãe que vai se transformar na filha. É uma operação perigosa e não deve ser muito realizada. Ao contrário do upcast que é muito usado.
POLIMORFISMO – a mesma ação se comportando diferente.
SOBRESCRITA (@Override) – a mesma ação PODENDO se comportar diferente.

## ASSOCIAÇÃO
ASSOCIAÇÃO – relacionamento entre classe e objetos. Não existe subtipo. Um ajuda o outro.
Estrutural – composição e agregação
Composição:
EX: class Pessoa { 
	Endereco endereço;
       }
 Agregação:
 EX: class Disciplina {
	Aluno aluno;
}
Comportamental – dependência
EX: class Compra {
	...
	Finalizar(Cupom cupom,...) {
		...
	}
}

OBS: herança é mais rígida e a associação é mais flexível para ser mudada em tempo de execução.

## INTERFACE
INTERFACE – define um CONTRATO que deve ser seguido pela classe que a implementa.
OBS: se a classe criada e usar a interface (implements) e  não usar todos os métodos, o java vai reclamar.

## PACOTES
PACOTES – organização física ou lógica para separar classe com responsabilidades diferentes.

## VISIBILIDADES
VISIBILIDADES – modificador de acesso que tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. Python não usa isso, tudo público. Tipos:
Private – só dentro da classe;
Protected – dentro da classe, mesmo pacote e subclasse;
Public – em qualquer lugar pode ver.


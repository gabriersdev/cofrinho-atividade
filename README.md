# Cofrinho 

Cofre de moedas desenvolvido em Java usando os conceitos de Orientação a Objetos, com ênfase em encapsulamento, herança e polimorfismo para a Atividade Prática da matéria de POO do curso de ADS. 

O projeto possui uma classe principal, chamada Cofrinho que permite a adição, remoção e visualização das moedas adicionadas. 

As classes Real, Dólar e Euro, herdeiras da classe Moeda, são responsáveis pela conversão dos valores e guardam o valor.

## Funcionalidades

- Armazenar moedas: através de uma instância de Real, Dólar ou Euro é possível adicionar moedas ao Cofre
- Remover moedas: remova moedas de mesmo valor e tipo, já adicionadas ao cofre
- Ver lista de moedas incluídas: as moedas são armazenadas em um ArrayList e é possível visualizar o que foi armazenado, organizado pelo tipo da moeda ou não
- Ver o total armazenado em reais: converte as moedas e imprime o total de tudo o que está guardado no Cofre, em reais.

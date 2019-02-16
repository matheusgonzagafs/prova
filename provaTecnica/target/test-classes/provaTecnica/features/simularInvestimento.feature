#language:pt
@testes_aceitacao_web
Funcionalidade:Simular-Investimento

  Como um Associado, gostaria de preencher o formulário de simulação e ver a tabela de resultado com Mês e Valor.
  Com o propósito de Simular um Investimento na Poupança.

  Critério de aceitação:
  O associado preencher todos os campos corretamente e visualizar o formulário de simulação
  O associado preencher o Valor inferior a “20.00” e receber a mensagem de orientação “Valor mínimo de 20.00”.

  Cenario: Realizar uma simulação de investimento na Poupança usando o portal web
    Dado que Associado deseja aplicar 100 reais e investir 50 reais no período de 1 mês
    Quando o Associado realizar a simulação
    Então deverá exibir na tela o resultado da simulação e as perspectivas dos próximos quatro meses


  Cenario: Não conseguir realizar uma simulação com valor menor que R$ 20,00
    Dado que o Associado simulou um investimento
    Quando informou o valor de 19,99
    Então deverá apresentar a mensagem de “Valor mínimo de 20.00”
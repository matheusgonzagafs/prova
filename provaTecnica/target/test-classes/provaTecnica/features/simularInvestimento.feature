#language:pt
@Testes_aceitacao
Funcionalidade:Simular-Investimento

  Com o propósito de Simular um Investimento na Poupança
  como um Associado,
  eu gostaria de preencher o formulário de simulação
  e ver a tabela de resultado com Mês e Valor.

  Critério de aceitação:
  1. O associado preencher todos os campos corretamente e visualizar o formulário de simulação
  2. O associado preencher o Valor inferior a “20.00” e receber a mensagem de orientação “Valor mínimo de 20.00”.

  Cenario: Realizar uma simulação de investimento na Poupança usando o portal web
    Dado que o Associado preenchou o formulario de investimento na poupanca
      | Valor que deseja aplicar | Valor do investimento mensal | Período Mensal |
      | 100.00                   | 50,00                        | 1              |
      | 100.00                   | 50,00                        | 12             |
    Quando o Associado realizar a simulção
    Então deverá exibir na tela o resultado da simulação e as perspectivas dos próximos 4 meses
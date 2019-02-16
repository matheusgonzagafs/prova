#language:pt
@testes_api
Funcionalidade:Simular-Investimento-API

  Cenario: Validar retorno da API
    Dado que o serviço de api esteja online
    Quando realizar a consulta usando o id 1
    Então deverá retornar a resposta com sucesso
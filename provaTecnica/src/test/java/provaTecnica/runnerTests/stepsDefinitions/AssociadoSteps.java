package provaTecnica.runnerTests.stepsDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import provaTecnica.runnerTests.pageObjects.SimuladorPoupancaPage;

public class AssociadoSteps {

    @Dado("^que Associado deseja aplicar (\\d+) reais e investir (\\d+) reais no período de (\\d+) mês$")
    public void queAssociadoDesejaAplicarReaisEInvestirReaisNoPeríodoDeMês(int valorAplicado, int valorInvestido, int quantidadeMeses) {
        SimuladorPoupancaPage simularPoupanca = new SimuladorPoupancaPage();
        simularPoupanca.preencherValorAplicado(valorAplicado);
        simularPoupanca.preencherValorInvestido(valorInvestido);
        simularPoupanca.preencherQuandidadeDeMeses(quantidadeMeses);

    }

    @Quando("^o Associado realizar a simulação$")
    public void oAssociadoRealizarASimulacao() {
        SimuladorPoupancaPage simularPoupanca = new SimuladorPoupancaPage();
        simularPoupanca.realizarSimulacao();
    }

    @Então("^deverá exibir na tela o resultado da simulação e as perspectivas dos próximos quatro meses$")
    public void deveráExibirNaTelaOResultadoDaSimulacaoEAsPerspectivasDosProximosQuatroMeses() {
        SimuladorPoupancaPage simularPoupanca = new SimuladorPoupancaPage();
        simularPoupanca.resultadoDasimulacaoPrimeiroMes();
    }

    @Dado("^que o Associado simulou um investimento$")
    public void associadoSimulouUmInvestimento() throws Exception {
        throw new PendingException();
    }

    @Quando("^informou o valor de (\\d+),(\\d+)$")
    public void informouValor(int arg1, int arg2) throws Exception {
        throw new PendingException();
    }

    @Então("^deverá apresentar a mensagem de “Valor mínimo de (\\d+)\\.(\\d+)”$")
    public void deveraApresentarMensagemValorMinimo(int arg1, int arg2) throws Exception {
        throw new PendingException();
    }

    @Dado("^que o serviço de api esteja online$")
    public void servicoDeApiEstejaOnline() throws Exception {
        throw new PendingException();
    }

    @Quando("^realizar a consulta usando o id (\\d+)$")
    public void realizarConsultandoId(int arg1) throws Exception {
        throw new PendingException();
    }

    @Então("^deverá retornar a resposta com sucesso$")
    public void deveraRetornarRespostaComSucesso() throws Exception {
        throw new PendingException();
    }

}

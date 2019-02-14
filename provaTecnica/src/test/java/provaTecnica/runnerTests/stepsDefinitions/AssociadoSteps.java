package provaTecnica.runnerTests.stepsDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AssociadoSteps {

    @Dado("^que o Associado preenchou o formulario de investimento na poupanca$")
    public void associadoPreencherFormularioDeInvestimentoNaPoupanca(DataTable valoresInvestidos) {
    }

    @Quando("^o Associado realizar a simulção$")
    public void associadoRealizarSimulcao() {
    }

    @Então("^deverá exibir na tela o resultado da simulação e as perspectivas dos próximos quatro meses$")
    public void exibirResultadoDaSimulaçãoEPerspectivasDosProximosMeses() {

    }

    @Dado("^que o Associado simulou um investimento$")
    public void queOAssociadoSimulouUmInvestimento() {
    }

    @Quando("^informou o valor de (\\d+),(\\d+)$")
    public void informou_o_valor_de_R$(int arg1, int arg2) throws Exception {
    }

    @Então("^deverá apresentar a mensagem de “Valor mínimo de (\\d+)\\.(\\d+)”$")
    public void deveráApresentarAMensagemDeValorMínimoDe(int arg0, int arg1) {
    }
}
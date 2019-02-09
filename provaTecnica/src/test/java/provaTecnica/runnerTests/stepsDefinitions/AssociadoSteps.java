package provaTecnica.runnerTests.stepsDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AssociadoSteps {

    @Dado("^que o Associado preenchou o formulario de investimento na poupanca$")
    public void associadoPreencherFormularioDeInvestimentoNaPoupanca(DataTable valoresInvestidos){
        throw new PendingException();
    }

    @Quando("^o Associado realizar a simulção$")
    public void associadoRealizarSimulcao(){
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^deverá exibir na tela o resultado da simulação e as perspectivas dos próximos quatro meses$")
    public void exibirResultadoDaSimulaçãoEPerspectivasDosProximosMeses(){

        throw new PendingException();
    }
}
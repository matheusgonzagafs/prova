package provaTecnica.runnerTests.pageObjects;

import org.openqa.selenium.support.PageFactory;
import provaTecnica.runnerTests.utilitarios.UtilsSelenium;

import static org.junit.Assert.assertEquals;

public class SimuladorPoupancaPage extends SimuladorPoupancaElementMap {
    public SimuladorPoupancaPage() {
        PageFactory.initElements(UtilsSelenium.getDriver(), this);
    }

    public void preencherValorAplicado(int valorAplicado) {
        UtilsSelenium.waitElementVisible(campoValorParaAplicar);
        campoValorParaAplicar.sendKeys(String.valueOf(valorAplicado + ",00"));
    }

    public void preencherValorInvestido(int valorInvestido) {
        campoValorParaPouparMensal.sendKeys(String.valueOf(valorInvestido + ",00"));
    }

    public void preencherQuandidadeDeMeses(int quantidadeMeses) {
        campoTempoParaPoupar.sendKeys(String.valueOf(quantidadeMeses));
    }

    public void realizarSimulacao() {
        botaoSimular.click();
    }

    public void resultadoDasimulacaoPrimeiroMes() {
        UtilsSelenium.waitElementVisible(resultadoSimulacao);
        assertEquals("R$ 150", resultadoSimulacao.getText());
    }
}

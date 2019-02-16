package provaTecnica.runnerTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimuladorPoupancaElementMap {

    @FindBy(css = "#valorAplicar")
    protected WebElement campoValorParaAplicar;

    @FindBy(css = "#valorInvestir")
    protected WebElement campoValorParaPouparMensal;

    @FindBy(css = "#tempo")
    protected WebElement campoTempoParaPoupar;

    @FindBy(css = ".btnSimular")
    protected WebElement botaoSimular;

    @FindBy(css = ".valor")
    protected WebElement resultadoSimulacao;
}

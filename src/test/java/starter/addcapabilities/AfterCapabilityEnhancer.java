package starter.addcapabilities;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.webdriver.enhancers.AfterAWebdriverScenario;
import net.thucydides.model.domain.TestOutcome;
import net.thucydides.model.util.EnvironmentVariables;

public class AfterCapabilityEnhancer implements AfterAWebdriverScenario {

    @Override
    public void apply(EnvironmentVariables environmentVariables, TestOutcome testOutcome, WebDriver driver) {
        System.out.println("Print message after test");
    }
    


}

package starter.addcapabilities;

import org.openqa.selenium.MutableCapabilities;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.webdriver.SupportedWebDriver;
import net.thucydides.model.domain.TestOutcome;
import net.thucydides.model.util.EnvironmentVariables;

public class MyCapabilityEnhancer implements BeforeAWebdriverScenario {

    @Override
    public MutableCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver driver,
            TestOutcome testOutcome, MutableCapabilities capabilities) {
        
                System.out.println("TEST BEFORE WEBDRIVER TEST");
                return capabilities;
    }

}

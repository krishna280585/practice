import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucu","json:target/cucuber.json"},tags={"@smoke"}, features="src/test/resources/searchWithLogin")
public class RunTest {
}

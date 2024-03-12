package sunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="C:\\Users\\91735\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\cucumber_test_ng\\src\\test\\resources\\forms\\newform.feature",
		glue={"runner"}
		)
public class runner  extends AbstractTestNGCucumberTests{

}

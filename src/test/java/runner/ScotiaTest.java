package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"D:\\Selenium_Workspace\\CucumberProject\\src\\test\\java\\feature"},//the path of the feature files
		glue={"stepDefination"},//the path of the step definition files
		plugin= {"pretty"},
		monochrome = true, //display the console output in a proper readable format
		//strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		)

public class ScotiaTest {

	
}

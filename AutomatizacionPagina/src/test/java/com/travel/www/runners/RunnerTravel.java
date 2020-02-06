package com.travel.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "stepdefinitions" }, 
			//tags = "@tag2",
			features = {"src/test/resources/features/HU001_RegistrarUsuario.feature" }, 
			snippets = SnippetType.UNDERSCORE, monochrome = true, 
			dryRun = false, 
			plugin = {"pretty", "html:target/reports/html/", "junit:target/reports/junit/allcukes.xml",
							"json:target/reports/cukes.json" })



public class RunnerTravel {

}

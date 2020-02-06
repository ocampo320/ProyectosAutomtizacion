package com.sophossolutions.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	glue = { "com.sophossolutions.www.stepdefinitions" }, 
	features = { "src/test/resources/features/HU001-GestionSesion.feature" }
)
public class Runner {}


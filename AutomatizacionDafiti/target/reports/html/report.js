$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU004_CompraDespegar.feature");
formatter.feature({
  "name": "Comprar Vuelo",
  "description": "  Como estudiante de semillero\n  necesito aprender automatizaci�n a traves de ejemplos\n  para automatizar cualquier caso de prueba",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Agregar Vuelo a Compra",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesisto comprar un vuelo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDespegar.comprarvuelo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Vuelo entre Medellin y Cali",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionDespegar.entreCiudades(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP-LAFQ684S\u0027, ip: \u0027172.23.81.180\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\SEMILL~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55363}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f6b473452509f0d7320d91c582960702\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"clusters\"]/span[1]/span/cluster/div/div/div[2]/fare/span/span/div/buy-button/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:231)\r\n\tat net.serenitybdd.core.pages.WebElementResolverByLocator.resolveForDriver(WebElementResolverByLocator.java:16)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.getElement(WebElementFacadeImpl.java:208)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:63)\r\n\tat net.serenitybdd.core.pages.WebElementExpectations$3.apply(WebElementExpectations.java:55)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilEnabled(WebElementFacadeImpl.java:960)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.waitUntilElementAvailable(WebElementFacadeImpl.java:802)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.click(WebElementFacadeImpl.java:1039)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget.performAs(ClickOnTarget.java:13)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d$$FastClassByCGLIB$$eb009f51.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:449)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:434)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:409)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:150)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:137)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat net.serenitybdd.screenplay.actions.ClickOnTarget$$EnhancerByCGLIB$$e3f2ec6d.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat com.sophossolutions.www.task.ConfirmarVuelo.performAs(ConfirmarVuelo.java:19)\r\n\tat com.sophossolutions.www.task.ConfirmarVuelo$$EnhancerByCGLIB$$a1b088df.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat com.sophossolutions.www.task.ConfirmarVuelo$$EnhancerByCGLIB$$a1b088df$$FastClassByCGLIB$$f18c3c35.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.BaseMethodRunner.invokeMethod(BaseMethodRunner.java:10)\r\n\tat net.thucydides.core.steps.NormalMethodRunner.invokeMethodAndNotifyFailures(NormalMethodRunner.java:20)\r\n\tat net.thucydides.core.steps.StepInterceptor.runNormalMethod(StepInterceptor.java:361)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:132)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.sophossolutions.www.task.ConfirmarVuelo$$EnhancerByCGLIB$$a1b088df.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.performTask(Actor.java:176)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:157)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:138)\r\n\tat com.sophossolutions.www.stepdefinitions.StepDefinitionDespegar.entreCiudades(StepDefinitionDespegar.java:35)\r\n\tat ✽.Vuelo entre Medellin y Cali(src/test/resources/features/HU004_CompraDespegar.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Valido el valor del vuelo",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDespegar.validarValorVuelo()"
});
formatter.result({
  "status": "skipped"
});
});
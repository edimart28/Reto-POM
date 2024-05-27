package com.haceb.stepDefinitions;

import com.haceb.steps.RegistroSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistroStepDefinitions {

    WebDriver driver;

    @Steps
    private RegistroSteps registroSteps;
    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }
    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }
    @AfterEach
    void teardown() {
        driver.quit();
    }


    @Given("que el usuario abre la pagina de haceb")
    public void queElUsuarioAbreLaPaginaDeHaceb() {
        registroSteps.openUrl();
    }
    @When("clic en boton Entrar")
    public void clicEnBotonEntrar() {
        registroSteps.ClickEnEntrar();
    }
    @When("clic en boton Registrarte")
    public void clicEnBotonRegistrarte() {
        registroSteps.ClickEnRegistarte();
    }
    @When("clic en boton AUN NO TE HAS REGISTRADO")
    public void clicEnBotonAUNNOTEHASREGISTRADO() {
        registroSteps.ClickEnNoTeHasRgistrado();
    }
    @When("ingresa la informacion solictada para el primer registro")
    public void ingresaLaInformacionSolictadaParaElPrimerRegistro(DataTable dataTable) {
        registroSteps.IngresarInformacion(dataTable);
    }
    @When("marca el check box de terminos y condiciones")
    public void marcaElCheckBoxDeTerminosYCondiciones() {
        registroSteps.TyC();
    }
    @When("marca el check box de autorizacion de uso de datos")
    public void marcaElCheckBoxDeAutorizacionDeUsoDeDatos() {
        registroSteps.AutorizarUsoDatos();
    }
    @When("clic en boton REGISTRARME")
    public void clicEnBotonREGISTRARME() {
        registroSteps.ClickRegistrarme();
    }
    @When("ingreso nueva informacion para el registro")
    public void ingresoNuevaInformacionParaElRegistro(DataTable dataTable) {
        registroSteps.id(dataTable);
        registroSteps.genero(dataTable);
        registroSteps.fecha(dataTable);
        registroSteps.Departamento(dataTable);
    }
    @When("clic en boton ENVIAR")
    public void clicEnBotonENVIAR() {
        registroSteps.ClickEnEnviar();
    }
    @Then("se visualiza el mensaje Hola")
    public void seVisualizaElMensajeHola() {
        registroSteps.VisualizarMensaje();

    }
}

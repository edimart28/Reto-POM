package com.haceb.stepDefinitions;

import com.haceb.steps.AddProductSteps;
import com.haceb.steps.RegistroSteps;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductStepDefinitions {
    WebDriver driver;
    @Steps
    private AddProductSteps addProductSteps;
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


    @Given("que el usuario ingresa a la url de haceb")
    public void queElUsuarioIngresaALaUrlDeHaceb() {
        addProductSteps.openUrl2();
    }
    @When("click en Menu")
    public void clickEnMenu() {
        addProductSteps.clickMenu();
    }
    @When("click en Categorias")
    public void clickEnCategorias() {
        addProductSteps.clickEnCategoria();
    }
    @When("click en subcategoria")
    public void clickEnSubcategoria() {
        addProductSteps.clickEnSubCategoria();
    }
    @When("click en producto de la subcategoria")
    public void clickEnProductoDeLaSubcategoria() {
        addProductSteps.clickEnProducto();
    }
    @When("click en agregar al carrito")
    public void clickEnAgregarAlCarrito() {
        addProductSteps.clickEnAgregarAlCarrito();
    }
    @Then("se visualizara en el carrito el producto agregado")
    public void seVisualizaraEnElCarritoElProductoAgregado() {
        addProductSteps.clickEnCarrito();
        addProductSteps.validarProducto();

    }

}

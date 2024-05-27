package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPageObject extends PageObject {

    private final By btnPopup = By.xpath("//div/a[@role='button']");
    public By getBtnPopup() {
        return btnPopup;
    }
    private final By btnEntrar = By.xpath("//div[@class='flex pv2 items-center'][1]");
    public By getBtnEntrar() {
        return btnEntrar;
    }
    public final By btnRegistrarte = By.xpath("//button[contains(@class, 'vtex-button') and contains(@class, 'c-action-primary') and .//span[contains(text(), 'Entrar con')]]");
    public By getBtnRegistrarte() {
        return btnRegistrarte;
    }
    public final By linkAunNoTeHasRegistrado = By.xpath("//a[@class='gigya-composite-control gigya-composite-control-link hc-text-header']/h5");
    public By getLinkAunNoTeHasRegistrado() {
        return linkAunNoTeHasRegistrado;
    }
    public final By txtEmail = By.xpath("//input[@id='gigya-loginID-51216659851706440']");
    public final By txtNombre = By.xpath("//input[@placeholder='Nombre *']");
    public final By txtApellido = By.xpath("//input[@placeholder='Apellido *']");
    public final By txtClave = By.xpath("//input[@placeholder='Contraseña *']");
    public final By txtConfirmarClave = By.xpath("//input[@placeholder='Confirma la contraseña *']");
    public By getTxtEmail() {
        return txtEmail;
    }
    public By getTxtNombre() {
        return txtNombre;
    }
    public By getTxtApellido() {
        return txtApellido;
    }
    public By getTxtClave() {
        return txtClave;
    }
    public By getTxtConfirmarClave() {
        return txtConfirmarClave;
    }
    @FindBy(xpath = "//form[@class='gigya-register-form' and @id='gigya-register-form']/div/div/label/span[@class='gigya-label-text gigya-checkbox-text']")
    WebElementFacade checkBoxTerminos;
    public WebElementFacade getCheckBoxTerminos() { return checkBoxTerminos;}
    public final By lnkAutorizo = By.xpath("//label[@for='gigya-multiChoice-0-98366419479004930']");
    public By getLnkAutorizo() {
        return lnkAutorizo;
    }
    public final By btnRegistrarme = By.xpath("(//div/input[@class='gigya-input-submit hc-register-screen-submit invi'])[2]");
    public By getBtnRegistrarme() { return btnRegistrarme;}
    public final By txtIngresarId = By.xpath("(//input[@class='gigya-input-text'])[13]");
    public final By selGenero = By.xpath("(//select[@name='profile.gender'])[2]");
    public final By selFecha = By.xpath("//input[@id='gigya-textbox-29430652596742216']");
    public final By selDepartamento = By.xpath("(//select[@name='data.region'])[2]");
    public final By btnEnviar = By.xpath("(//input[@class='gigya-input-submit hc-c-register-screen-submit invi'])[2]");
    public By getTxtIngresarId() {
        return txtIngresarId;
    }
    public By getSelGenero() {
        return selGenero;
    }
    public By getSelFecha() {
        return selFecha;
    }
    public By getSelDepartamento() {
        return selDepartamento;
    }
    public By getBtnEnviar() {
        return btnEnviar;
    }
    public final By mensajeBienvenida = By.xpath("(//span[contains (text (), 'Hola,')])[1]");
    public By getMensajeBienvenida() {
        return mensajeBienvenida;
    }

}












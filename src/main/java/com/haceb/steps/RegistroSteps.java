package com.haceb.steps;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import com.haceb.pageObject.RegistroPageObject;
import com.haceb.utils.EsperasExplicitas;
import com.ibm.icu.impl.Assert;
import com.ibm.icu.impl.LocaleDisplayNamesImpl;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static com.haceb.utils.clickJS.clickJScheckBox;
import static net.serenitybdd.core.Serenity.getCurrentSession;
import static net.serenitybdd.core.Serenity.getDriver;



public class RegistroSteps {
    private List<String> InformacionAdicional;
    @Page
    private RegistroPageObject registroPageObject;

    @Step("open Browser y cerrar popup")
    public void openUrl() {
        registroPageObject.openUrl("https://www.haceb.com/");
        esperarElemento(registroPageObject.getDriver(), registroPageObject.getBtnPopup());
        registroPageObject.getDriver().findElement(registroPageObject.getBtnPopup()).click();
    }

    @Step("dar click en Entrar")
    public void ClickEnEntrar() {
        esperarElemento(registroPageObject.getDriver(), registroPageObject.getBtnEntrar());
        registroPageObject.getDriver().findElement(registroPageObject.getBtnEntrar()).click();
    }

    @Step("dar click en registrarte")
    public void ClickEnRegistarte() {
        esperarElemento(registroPageObject.getDriver(), registroPageObject.getBtnRegistrarte());
        registroPageObject.getDriver().findElement(registroPageObject.getBtnRegistrarte()).click();
    }

    @Step("dar click en aun no te has registrado")
    public void ClickEnNoTeHasRgistrado() {
        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());

        getDriver().switchTo().window(tabs.get(1));
        getDriver().manage().window().maximize();

        esperarElemento(registroPageObject.getDriver(), registroPageObject.linkAunNoTeHasRegistrado);
        registroPageObject.getDriver().findElement(registroPageObject.getLinkAunNoTeHasRegistrado()).click();
    }

    @Step("incluir informacion")
    public void IngresarInformacion(DataTable dataTable) {
        List<String> informacionDeRegistro = dataTable.row(1);

        esperarElemento(registroPageObject.getDriver(), registroPageObject.getTxtEmail());

        registroPageObject.getDriver().findElement(registroPageObject.getTxtEmail()).sendKeys(informacionDeRegistro.get(0));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtNombre()).sendKeys(informacionDeRegistro.get(1));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtApellido()).sendKeys(informacionDeRegistro.get(2));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtClave()).sendKeys(informacionDeRegistro.get(3));
        registroPageObject.getDriver().findElement(registroPageObject.getTxtConfirmarClave()).sendKeys(informacionDeRegistro.get(4));
    }
    @Step("clic en TyC")
    public void TyC() {
        WebElementFacade checkBoxTerminos1 = registroPageObject.getCheckBoxTerminos();
        clickJScheckBox(registroPageObject.getDriver(), checkBoxTerminos1);
    }
    @Step("Autorizar uso de datos")
    public void AutorizarUsoDatos() {
        registroPageObject.getDriver().findElement(registroPageObject.getLnkAutorizo()).click();
        esperarElemento(registroPageObject.getDriver(), registroPageObject.linkAunNoTeHasRegistrado);
    }
    @Step("Registrarme")
    public void ClickRegistrarme() {
        registroPageObject.getDriver().findElement(registroPageObject.getBtnRegistrarme()).click();
    }
    @Step("Ingresar datos adicionales")
    public void id(DataTable dataTable) {
        InformacionAdicional = dataTable.row(1);
        registroPageObject.getDriver().findElement(registroPageObject.getTxtIngresarId()).sendKeys(InformacionAdicional.get(0));
    }
    public void genero(DataTable dataTable) {
        InformacionAdicional = dataTable.row(1);
        registroPageObject.getDriver().findElement(registroPageObject.getSelGenero()).sendKeys(InformacionAdicional.get(1));
    }
    public void fecha(DataTable dataTable) {
        InformacionAdicional = dataTable.row(1);
        registroPageObject.getDriver().findElement(registroPageObject.getSelFecha()).sendKeys(InformacionAdicional.get(2));
    }
    public void Departamento(DataTable dataTable) {
        InformacionAdicional = dataTable.row(1);
        registroPageObject.getDriver().findElement(registroPageObject.getSelDepartamento()).sendKeys(InformacionAdicional.get(3));
    }
    @Step("Boton Enviar")
    public void ClickEnEnviar() {
        registroPageObject.getDriver().findElement(registroPageObject.getBtnEnviar()).click();
    }
    @Step("Cerrar popup y visualizar mensaje")
    public void VisualizarMensaje() {

        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles()); //trae las ventanas abiertas
        getDriver().switchTo().window(tabs.get(0)); //cambia a la nueva ventana

        esperarElemento(registroPageObject.getDriver(), registroPageObject.getBtnPopup());
        registroPageObject.getDriver().findElement(registroPageObject.getBtnPopup()).click();

        boolean mensaje = registroPageObject.getDriver().findElement(registroPageObject.getMensajeBienvenida()).isDisplayed();
        if (mensaje) {
            System.out.println("registro exitoso");
        } else {
            System.out.println("registro no exitoso");


        }


    }

}

































    




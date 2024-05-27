package com.haceb.steps;

import com.haceb.pageObject.AddProductPageObject;
import com.haceb.pageObject.RegistroPageObject;
import com.haceb.utils.SeleccionAleatoria;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static com.haceb.utils.EsperasExplicitas.esperarElemento;
import static com.haceb.utils.EsperasExplicitas.esperarClick;
import static com.haceb.utils.SeleccionAleatoria.selectRandomElement;
import static org.junit.Assert.assertEquals;


public class AddProductSteps {
    @Page
    private AddProductPageObject addProductPageObject;


    @Step("Usuario open Browser y cerrar popup")
    public void openUrl2() {
        addProductPageObject.openUrl("https://www.haceb.com/");
        esperarElemento(addProductPageObject.getDriver(), addProductPageObject.getBtnPopup());
        addProductPageObject.getDriver().findElement(addProductPageObject.getBtnPopup()).click();
    }
    @Step("Usuario da click en Menu categorias")
    public void clickMenu(){
        addProductPageObject.getDriver().findElement(addProductPageObject.getBtnMenu()).click();
    }
    @Step ("Usuario selecciona una categoria")
    public void clickEnCategoria(){
        List <WebElement>categorias = addProductPageObject.getDriver().findElements(addProductPageObject.getBtnCategoria());
        WebElement seleccion= selectRandomElement(categorias);
        seleccion.click();
    }
    @Step ("Usuario selecciona una subcategoria")
    public void clickEnSubCategoria(){
        List<WebElement>categorias = addProductPageObject.getDriver().findElements(addProductPageObject.getBtnSubCategoria());
        WebElement seleccion= selectRandomElement(categorias);
        seleccion.click();
    }
    @Step ("Usuario selecciona un producto")
    public void clickEnProducto(){
        esperarElemento(addProductPageObject.getDriver(),addProductPageObject.getBtnProducto());
        List<WebElement>categorias1 = addProductPageObject.getDriver().findElements(addProductPageObject.getBtnProducto());
        WebElement seleccion1= selectRandomElement(categorias1);
        seleccion1.click();
    }
    @Step("Usuario agrega producto al carrito")
    public void clickEnAgregarAlCarrito(){
        esperarElemento(addProductPageObject.getDriver(),addProductPageObject.getBtnAgregarAlcarrito());
        addProductPageObject.getDriver().findElement(addProductPageObject.getBtnAgregarAlcarrito()).click();
    }
    @Step("Usuario ingreso al carrito")
    public void clickEnCarrito(){
        esperarElemento(addProductPageObject.getDriver(),addProductPageObject.getBtnCarrito());
        addProductPageObject.getDriver().findElement(addProductPageObject.getBtnCarrito()).click();
    }
    @Step("Usuario valida producto agregado")
    public void validarProducto(){
        String txtProductoParaAgregar = String.valueOf(addProductPageObject.getDriver().findElement(addProductPageObject.getTituloProductoParaAgregar()).getText());
        String txtProductoAgregado = String.valueOf(addProductPageObject.getDriver().findElement(addProductPageObject.getTituloProductoAgregado()).getText());

        System.out.println("producto a seleccionar : " + txtProductoParaAgregar);
        System.out.println("seleccionado : " + txtProductoAgregado);

        assertEquals(txtProductoParaAgregar, txtProductoAgregado);
    }
}

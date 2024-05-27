package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddProductPageObject extends PageObject {
    private final By btnPopup = By.xpath("//div/a[@role='button']");
    public By getBtnPopup() {return btnPopup;    }
    private final By btnMenu = By.xpath("(//div/p[@class='lh-copy vtex-rich-text-0-x-paragraph vtex-rich-text-0-x-paragraph--text-trigger-destop vtex-rich-text-0-x-paragraph--link-header'])[2]");
    private final By btnCategoria = By.xpath("//div[@class='w-100 flex pointer hacebco-menu-drawer-0-x-menuItem hacebco-menu-drawer-0-x-menuItemSubMenuTrigger false']");
    private final By btnSubCategoria = By.xpath("//div[@class='flex mt0 mb0 pt0 pb0    justify-start vtex-flex-layout-0-x-flexRowContent vtex-flex-layout-0-x-flexRowContent--category items-stretch w-100']");
    public By getBtnMenu() {return btnMenu;   }
    public By getBtnCategoria() {return btnCategoria;
    }
    public By getBtnSubCategoria() {return btnSubCategoria;
    }
    private final By btnProducto = By.xpath("//div[@class='dib relative vtex-product-summary-2-x-imageContainer vtex-product-summary-2-x-imageContainer--product-summary-image-hover vtex-product-summary-2-x-imageStackContainer vtex-product-summary-2-x-hoverEffect']");
    public By getBtnProducto() {return btnProducto;
    }
    private final By btnAgregarAlcarrito = By.xpath("(//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box '])[2]");
    public By getBtnAgregarAlcarrito() {return btnAgregarAlcarrito;
    }
    public final By btnCarrito = By.xpath("(//span[@class='vtex-minicart-2-x-minicartIconContainer gray relative'])[1]");

    public By getBtnCarrito() {return btnCarrito;
    }
    public final By tituloProductoParaAgregar = By.xpath("//div[@class='flex mt0 mb0 pt0 pb0    justify-center vtex-flex-layout-0-x-flexRowContent vtex-flex-layout-0-x-flexRowContent--name-wishlist items-stretch w-100']");
    public final By tituloProductoAgregado = By.xpath("//*[@class='c-on-base t-title lh-copy fw6 no-underline fw5-m vtex-product-list-0-x-productName ']");
    public By getTituloProductoParaAgregar() {return tituloProductoParaAgregar;
    }
    public By getTituloProductoAgregado() {return tituloProductoAgregado;
    }
}



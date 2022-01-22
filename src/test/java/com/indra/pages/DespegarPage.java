package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.kayak.com.co/")
public class DespegarPage extends PageObject {
    public DespegarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//i[contains(@class,'radio-circle')])[2]")
    private WebElementFacade botonSoloIda;

    @FindBy(xpath = "(//input[@class='input-tag'])[1]")
    private WebElementFacade cajaoOrigen;

    @FindBy(xpath = "//li[@class='item -active']")
    private WebElementFacade seleccionaCiudad;

    @FindBy(xpath = " (//input[@class='input-tag'])[2]")
    private WebElementFacade cajaDestino;

    @FindBy(xpath = "  (//input[@class='input-tag'])[3]")
    private WebElementFacade botonCalendario;

    @FindBy(xpath = "//div[@class='sbox5-monthgrid-datenumber-number' and contains(.,'24')]")
    private WebElementFacade diaSalida;

    @FindBy(xpath = "//button[@class='sbox5-box-button-ovr--3LK5x sbox5-3-btn -secondary -icon -lg']")
    private WebElementFacade botonBuscar;

    @FindBy(xpath = " (//buy-button)[2]")
    private WebElementFacade segundaOferta;

    @FindBy(xpath = "//button[@class='eva-3-btn pricebox-sticky-button -lg -primary']")
    private WebElementFacade esperarVueloSeleccionado;

    public WebElementFacade getEsperarVueloSeleccionado() {
        return esperarVueloSeleccionado;
    }

    public WebElementFacade getSegundaOferta() {
        return segundaOferta;
    }

    public WebElementFacade getBotonBuscar() {
        return botonBuscar;
    }

    public WebElementFacade getDiaSalida() {
        return diaSalida;
    }

    public WebElementFacade getBotonCalendario() {
        return botonCalendario;
    }

    public WebElementFacade getCajaDestino() {
        return cajaDestino;
    }

    public WebElementFacade getSeleccionaCiudad() {
        return seleccionaCiudad;
    }

    public WebElementFacade getCajaoOrigen() {
        return cajaoOrigen;
    }

    public WebElementFacade getBotonSoloIda() {
        return botonSoloIda;
    }
}

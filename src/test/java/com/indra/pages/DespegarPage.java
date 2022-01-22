package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;


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

    @FindBy(xpath = " (//div[@class='sbox5-monthgrid-title-month'])[1]")
    private WebElementFacade mesCalendario;

    @FindBy(xpath = "(//a[@class='calendar-arrow-right'])[1]")
    private WebElementFacade siguiente;



    @FindBy(xpath = " (//div[@class='sbox5-monthgrid-title-month'])[2]")
    private List<WebElementFacade> listaMeses;

    @FindBy(xpath = "(//div[@class='sbox5-monthgrid'])[2]//div[@class='sbox5-monthgrid-datenumber-number']")
    private List<WebElementFacade> listadias;
    //div[@class='sbox5-monthgrid-dates sbox5-monthgrid-dates-30']oruginal
    //(//div[@class='sbox5-monthgrid'])[2]//div[@class='sbox5-monthgrid-datenumber-number'] p2

    //div[@class='sbox5-monthgrid-datenumber-number'] sirve ojo esta

    public List<WebElementFacade> getListadias() {
        return listadias;
    }

    public List<WebElementFacade> getListaMeses() {
        return listaMeses;
    }

    public WebElementFacade getSiguiente() {
        return siguiente;
    }

    public WebElementFacade getMesCalendario() {
        return mesCalendario;
    }

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

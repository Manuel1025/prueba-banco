package com.indra.actions;

import com.indra.models.DespegarModels;
import com.indra.pages.DespegarPage;


import org.openqa.selenium.WebDriver;



public class DespegarActions extends DespegarPage {
    public DespegarActions(WebDriver driver) {
        super(driver);
    }

    public void seleccionrSoloIda(){
        getBotonSoloIda().waitUntilPresent();
        getBotonSoloIda().click();
    }

    public void llenarOrigenDestino(DespegarModels despegarModels){
        getCajaoOrigen().waitUntilPresent();
        getCajaoOrigen().click();
        enter(despegarModels.getOrigen()).into(getCajaoOrigen());
        getSeleccionaCiudad().waitUntilPresent();
        getSeleccionaCiudad().click();

        getCajaDestino().click();
        enter(despegarModels.getDestino()).into(getCajaDestino());
        getSeleccionaCiudad().waitUntilPresent();
        getSeleccionaCiudad().click();





    }

    public  void seleccionarFecha(){
        getBotonCalendario().click();
        getDiaSalida().waitUntilPresent();
        getDiaSalida().click();


    }

    public  void verVuelos(){
        getBotonBuscar().click();
        getSegundaOferta().waitUntilPresent();
        getSegundaOferta().click();
        getEsperarVueloSeleccionado().waitUntilPresent();

    }

    public void  llenarFormuilario(DespegarModels despegarModels){
        seleccionrSoloIda();
        llenarOrigenDestino(despegarModels);
        seleccionarFecha();

    }








}

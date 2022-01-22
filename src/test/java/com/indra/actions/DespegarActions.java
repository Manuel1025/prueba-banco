package com.indra.actions;

import com.indra.models.DespegarModels;
import com.indra.pages.DespegarPage;


import net.serenitybdd.core.pages.WebElementFacade;
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

    public  void seleccionarFecha(DespegarModels despegarModels){

        getBotonCalendario().click();
        String mesFeature = despegarModels.getMes();
        for(int i=0; i<12; i++){
            for(int j=0; j< getListaMeses().size(); j++){
                if(!mesFeature.equals(getListaMeses().get(j).getText())){
                    getSiguiente().click();
                }
                else{
                    break;
                }
            }
        }



    }

    public  void dia(DespegarModels despegarModels){
        String diaPartida = despegarModels.getDia();
        for (int l=0; l<getListadias().size(); l++){
            diaPartida = despegarModels.getDia();
            String diaCalendario = getListadias().get(l).getText();

            if(diaPartida.equals(diaCalendario)){
                getListadias().get(l).click();
                break;
            }

        }






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
        seleccionarFecha(despegarModels);
        dia(despegarModels);

    }








}

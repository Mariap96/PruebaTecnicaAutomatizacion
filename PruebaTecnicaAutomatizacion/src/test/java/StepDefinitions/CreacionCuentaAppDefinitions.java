package StepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import Steps.*;
import net.thucydides.core.annotations.Steps;


public class CreacionCuentaAppDefinitions {

    @Steps
    AbrirPaginaStep abrirPagina;

    @Steps
    CreacionCuentaStep ingresoDatos;


    @Dado ("que quiero observar la obligatoriedad de campos en PruebaQaApp")
    public void ingresoPaginaVerificarObligatoriedad() {
        abrirPagina.ingresoPagina();
    }

    @Cuando ("ingrese los datos: (.*), (.*), (.*), (.*), (.*), (.*)")
    public void ingresoInformacionCamposVacios(String Nombre, String Apellido, String Email,
                                               String Pass, String Fecha_Nacimimento, String Genero) {
        ingresoDatos.ingresoInformacionFormulario (Nombre, Apellido, Email, Pass, Fecha_Nacimimento, Genero);
    }

    @Entonces ("observo el (.*) de obligatoriedad")
    public void observoMensajeObligatoriedad(String mensaje) {
        ingresoDatos.visualizacionMensaje (mensaje);
    }

    @Dado("que quiero registrarme en PruebaQaApp")
    public void ingresoPaginaRegistro() {
        abrirPagina.ingresoPagina();
    }

    @Cuando("ingrese los datos (.*), (.*), (.*), (.*), (.*), (.*)")
    public void ingresoDatosFormulario(String Nombre, String Apellido, String Email, String Pass, String Fecha_Nacimimento, String Genero) {
        ingresoDatos.ingresoInformacionFormulario (Nombre, Apellido, Email, Pass, Fecha_Nacimimento, Genero);

    }

    @Entonces("observo la (.*) de ingreso exitoso al sistema")
    public void confirmacionMensajeCreacionExitosa(String mensaje) {
        ingresoDatos.visualizacionMensajeEmergente (mensaje);
    }
}

package Steps;

import Pages.CreacionCuentaPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CreacionCuentaStep {


    CreacionCuentaPage ingresoInformacion;

    @Step
    public void ingresoInformacionFormulario (String Nombre, String  Apellido, String Email,
                                              String Pass, String Fecha, String Genero)
    {
        ingresoInformacion.ingresoNombre (Nombre);
        ingresoInformacion.ingresoApellido (Apellido);
        ingresoInformacion.ingresoEmail (Email);
        ingresoInformacion.ingresoPass (Pass);
        ingresoInformacion.ingresoFechaNacimiento (Fecha);
        ingresoInformacion.seleccionarGenero(Genero) ;
    }

    @Step
    public void visualizacionMensaje(String mensaje)
    {
        Assert.assertEquals ("El campo se encuentra vacio", mensaje, ingresoInformacion.verificarMensaje ());
    }

    @Step
    public void visualizacionMensajeEmergente(String mensaje)
    {
        ingresoInformacion.guardarInformacion ();
        Assert.assertEquals ("Se confirma el registro exitoso", mensaje, ingresoInformacion.visualizarVentana ());
        //ingresoInformacion.visualizarVentana ();
    }
}

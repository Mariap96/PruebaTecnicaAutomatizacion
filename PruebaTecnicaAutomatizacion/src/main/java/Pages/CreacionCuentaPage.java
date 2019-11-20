package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;

import java.io.IOError;

public class CreacionCuentaPage extends PageObject {

    @FindBy(id="id_nombre")
    WebElementFacade txt_Nombre;

    @FindBy (id="id_apellido")
    WebElementFacade txt_Apellido;

    @FindBy (id="id_email")
    WebElementFacade txt_Email;

    @FindBy (id="id_password")
    WebElementFacade txt_Pass;

    @FindBy (xpath = "//p [@class='input-group']//input [@name='birthdate']")
    WebElementFacade txt_Fecha_Nacimiento;

    @FindBy (id = "id_genero_mujer")
    WebElementFacade btnMujer;

    @FindBy (id = "id_genero_hombre")
    WebElementFacade btnHombre;

    @FindBy (xpath = "//button [text()='Crear cuenta']")
    WebElementFacade btnGuardar;

    @FindBy (xpath = "//span[@class='error']")
    WebElementFacade lblError;

    public void ingresoNombre(String Nombre)
    {
        txt_Nombre.sendKeys (Nombre);
    }

    public void ingresoApellido (String Apellido)
    {
        txt_Apellido.sendKeys (Apellido);
    }

    public void ingresoEmail (String Email)
    {
        txt_Email.sendKeys (Email);
    }

    public void ingresoPass (String Pass)
    {
        txt_Pass.sendKeys (Pass);
    }

    public void ingresoFechaNacimiento (String Fecha)
    {
        txt_Fecha_Nacimiento.sendKeys (Fecha);
    }

    public void seleccionarGenero(String genero) {
        if (genero.equals("Mujer")) {
            btnMujer.waitUntilClickable().click();
        }else if (genero.equals("Hombre")) {
            btnHombre.waitUntilClickable().click();
        }
    }

    public void guardarInformacion()
    {
        btnGuardar.click ();
    }

    public String verificarMensaje()
    {
        return lblError.getText ();
    }

    public String  visualizarVentana()
    {
        //getDriver ().switchTo ().alert ().accept ();
        return getDriver ().switchTo ().alert ().getText ();
    }
}

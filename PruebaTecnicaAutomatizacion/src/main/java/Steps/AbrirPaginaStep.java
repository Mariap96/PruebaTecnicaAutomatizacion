package Steps;

import Pages.AbrirPaginaPage;
import net.thucydides.core.annotations.Step;

public class AbrirPaginaStep {

    AbrirPaginaPage abrirPagina;

    @Step
    public void ingresoPagina ()
    {
        abrirPagina.open();
    }
}

# language: es



Característica: Crear cuenta en PruebaQa App

  Yo como usuario de PruebaQaAPP
  Quiero registrar mi informacin
  Para poder observar disfrutar de los servicios de la APP


  Esquema del escenario: Observar mensajes de Obligatoriedad
    Dado que quiero observar la obligatoriedad de campos en PruebaQaApp
    Cuando ingrese los datos: <Nombre>, <Apellido>, <Email>, <Pass>, <Fecha Nacimiento>, <Genero>
    Entonces observo el <Mensaje> de obligatoriedad

    Ejemplos:
      |    Nombre      |   Apellido     |         Email         |      Pass      |  Fecha Nacimiento |   Genero   |     Mensaje                               |
      |                |    Perez      	| pruebas@gmail.com     |   123456       | 1997-08-12        |   Mujer    |     El nombre es obligatorio              |
      |  Pepito        |               	| pruebas@gmail.com     |   123456       | 1997-08-12        |   Mujer    |     El apellido es obligatorio            |
      |  Pepito        |    Perez      	|                       |   123456       | 1997-08-12        |   Hombre    |     El correo electrónico es obligatorio  |
      |  Pepito        |    Perez      	| pruebas@gmail.com     |                | 1997-08-12        |   Mujer    |     La constraseña es obligatoria         |
      |  Pepito        |    Perez      	| pruebas@gmail.com     |   123456       |                   |   Mujer    |     La fecha de nacimiento es obligatoria |


  Esquema del escenario: Crear Cuenta Exitosa
    Dado que quiero registrarme en PruebaQaApp
    Cuando ingrese los datos <Nombre>, <Apellido>, <Email>, <Pass>, <Fecha Nacimiento>, <Genero>
    Entonces observo la <Confirmacion> de ingreso exitoso al sistema

    Ejemplos:
      |    Nombre      |   Apellido     |         Email         |      Pass      |  Fecha Nacimiento |   Genero   | Confirmacion     |
      |  Pepito        |    Perez      	| pruebas@gmail.com     |   123456       | 1997-08-12        |   Hombre    | Bienvenido Pepito Perez |
      |  Catalina        |    Gonzales      	| pruebas@gmail.com     |   123456       | 1997-07-29        |   Mujer    | Bienvenido Catalina Gonzales |

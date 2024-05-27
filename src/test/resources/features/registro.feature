Feature: Registro de usuario
@Registro
    Scenario: Registro nuevo usuario haceb
      Given que el usuario abre la pagina de haceb
      When clic en boton Entrar
      And clic en boton Registrarte
      And clic en boton AUN NO TE HAS REGISTRADO
      And ingresa la informacion solictada para el primer registro
        | email            | nombre  | apellido | clave       | confirmacion clave |
        | ghfgh7@gmail.com | edinson | martinez | edinson1234 | edinson1234        |
  And marca el check box de terminos y condiciones
      And marca el check box de autorizacion de uso de datos
      And clic en boton REGISTRARME
      And ingreso nueva informacion para el registro
        | cedula | genero   | fecha de nacimiento | departamento |
        | 454545 | femenino | 22/02/2000          | Huila        |


      And clic en boton ENVIAR
      Then se visualiza el mensaje Hola





  







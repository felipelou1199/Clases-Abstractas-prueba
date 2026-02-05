package org.feliperosas.pooclasesabstractas.form;

import org.feliperosas.pooclasesabstractas.form.elementos.ElementoForm;
import org.feliperosas.pooclasesabstractas.form.elementos.InputForm;
import org.feliperosas.pooclasesabstractas.form.elementos.SelectForms;
import org.feliperosas.pooclasesabstractas.form.elementos.TextAreaForm;
import org.feliperosas.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("M1nP1n" , "password");
        InputForm email = new InputForm("email" , "email");
        InputForm edad = new InputForm("edad" , "number");

        TextAreaForm experiencia = new TextAreaForm("exp",5,9);

        SelectForms lenguaje = new SelectForms("lenguaje");
        Opcion java =new Opcion("1","Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2","JavaScript"))
        .addOpcion(new Opcion("3","Php"))
        .addOpcion(new Opcion("4","TypeScript"));

        username.setValor("Beth Robles");
        password.setValor("popotes");
        email.setValor("bethRobles@correo.com");
        edad.setValor("26");
        experiencia.setValor("toda la experiencia del mundo");
        java.setSelected(true);

        List<ElementoForm> elemntos = new Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);

        for(ElementoForm e:elemntos){
            System.out.println(e.dibujarHtml());
        }
    }
}

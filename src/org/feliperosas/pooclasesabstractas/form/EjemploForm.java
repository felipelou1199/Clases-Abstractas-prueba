package org.feliperosas.pooclasesabstractas.form;

import org.feliperosas.pooclasesabstractas.form.elementos.ElementoForm;

public class EjemploForm {
    public static void main(String[] args) {
        ElementoForm el = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "";
            }
        };
    }
}

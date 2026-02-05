package org.feliperosas.pooclasesabstractas.form.validdador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "El campo es requerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && !valor.isEmpty());
    }
}

package org.feliperosas.pooclasesabstractas.form.elementos;

import org.feliperosas.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForms extends ElementoForm{

    private List<Opcion> opciones;

    public SelectForms(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForms(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForms addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }



    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        for(Opcion opcion:this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">").append(opcion.getNombre()).append("</option>");
        }
        sb.append("</selecte>");
        return sb.toString();
    }
}

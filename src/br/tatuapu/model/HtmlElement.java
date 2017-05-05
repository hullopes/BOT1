/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hullopes
 */
public class HtmlElement {
    private final String nomeElement;
    private final String conteudo;
    private List<Atributo> atributos;
    public HtmlElement(String nE, String conteudo){
        this.nomeElement = nE;
        this.conteudo = conteudo;
        this.atributos = new ArrayList();
    }
    public void setAtributo(Atributo atributo){
        this.atributos.add(atributo);
    }
    public void setAtributo(List<Atributo> atributos){
        this.atributos = atributos;
    }
    
}

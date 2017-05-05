/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.model;

import java.util.List;

/**
 *
 * @author hullopes
 */
public abstract class HtmlElement {
    private final String nomeElement;
    private List<String> atributos;
    public HtmlElement(String nE){
        this.nomeElement = nE;
    }
    
}

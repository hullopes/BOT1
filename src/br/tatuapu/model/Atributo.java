/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.model;

/**
 *
 * @author Informática
 */
class Atributo {
    private final String atributoNome;
    private final String valor;
    public Atributo(String aN, String v){
        this.atributoNome = aN;
        this.valor = v;
    }

    /**
     * @return the atributoNome
     */
    public String getAtributoNome() {
        return atributoNome;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }
}

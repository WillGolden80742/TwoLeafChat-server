/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author elder
 */
public class Messages implements Serializable {

    private String operation;
    private Status status;

    /* 
    chave : Object
     */
    Map<String, Object> params;

    public Messages(String operacao) {
        this.operation = operacao;
        params = new HashMap<>();
    }

    public Messages() {
        params = new HashMap<>();
    }

    public String getOperation() {
        return operation;
    }

    public void setStatus(Status s) {
        this.status = s;
    }

    public Status getStatus() {
        return status;
    }

    /*
        "NOME" --> "José"
        "IDADE" --> 35
     */
    public void setParam(String chave, Object valor) {
        params.put(chave, valor);
    }

    public Object getParam(String chave) {
        return params.get(chave);
    }

    @Override
    public String toString() {
        String m = "Operacao: " + operation;
        m += "\nStatus: " + status;

        m += "\nParâmetros:\n ";
        for (String p : params.keySet()) {
            m += p + ": " + params.get(p) + "\n";
        }
        return m;
    }

}
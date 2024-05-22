package com.MundoSenai.leads.Model;

import org.hibernate.dialect.function.array.AbstractArrayTrimFunction;

public class M_Resposta {

    private boolean sucesso;
    private String mensagem;

    public M_Resposta(boolean sucesso, String mensagem){
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


}

package br.com.alura.screenmatch.excecao;

import br.com.alura.screenmatch.principal.Principal;

public class ErroDeConversaoDeAnoException extends RuntimeException{
    private String mensagem;

    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}

package com.rocketseat.gestao_vagas.exceptions;

public class UserFoundException  extends RuntimeException  {
    public UserFoundException() {
        super("Usuário já cadastrado com este username ou email");
    }

    public UserFoundException(String message) {
        super(message);
    }

    public UserFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserFoundException(Throwable cause) {
        super(cause);
    }

}

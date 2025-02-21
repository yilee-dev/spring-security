package spring.auth.security.exceptions;

import org.springframework.security.core.AuthenticationException;

import java.nio.file.AccessDeniedException;

public class SecretException extends AuthenticationException {
    public SecretException(String message) {
        super(message);
    }
}

package org.skypro.skyshop.exception;

import java.io.IOException;

public class BestResultNotFound extends IOException {

    public BestResultNotFound(){
        super();
    }

    public BestResultNotFound(String message) {
        super(message);
    }

    public BestResultNotFound(String message, Throwable t) {
        super(message, t);
    }

    public BestResultNotFound(Throwable t) {
        super(t);
    }

}

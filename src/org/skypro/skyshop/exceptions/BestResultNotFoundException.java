package org.skypro.skyshop.exceptions;

import java.io.IOException;

public class BestResultNotFoundException extends IOException{
    public BestResultNotFoundException(){
        super();
    }
    public BestResultNotFoundException(String message){
        super(message);
    }
    public BestResultNotFoundException(String message, Throwable t){
        super(message, t);
    }
    public BestResultNotFoundException(Throwable t){
        super(t);
    }

}

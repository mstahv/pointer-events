package com.vaadin.pointerevents.client;

public class PrefixedSupportImpl extends ModernSupportImpl {
    
    @Override
    public String getNativeEventName(Events javaname) {
        return "MS" + javaname;
    }

}

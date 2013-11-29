package com.vaadin.pointerevents.client;

public class PrefixedSupportImpl extends ModernSupportImpl {
    
    @Override
    public String prefix(String javaname) {
        return "MS" + javaname;
    }

}

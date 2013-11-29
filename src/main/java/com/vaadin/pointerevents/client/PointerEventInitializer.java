package com.vaadin.pointerevents.client;

import com.google.gwt.core.client.EntryPoint;

public class PointerEventInitializer implements EntryPoint {
    
    @Override
    public void onModuleLoad() {
        PointerEventsSupport.init();
    }
    
    static {
    }
    
}

package com.vaadin.pointerevents.client;

import com.google.gwt.core.client.GWT;

public class PointerEventsSupport {

    static final PointerEventsSupport impl = GWT
            .create(PointerEventsSupport.class);

    public PointerEventsSupport() {
    }

    public String prefix(String javaname) {
        return javaname.toLowerCase();
    }

    public static boolean isSupported() {
        return impl.supports();
    }

    boolean supports() {
        return false;
    }
    
    public static void init() {
        impl.doInit();
    }

    void doInit() {
    };

}
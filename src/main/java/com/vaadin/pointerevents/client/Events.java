package com.vaadin.pointerevents.client;


enum Events {

    PointerDown, PointerMove, PointerOut, PointerOver, PointerUp, PointerCancel;

    String getNativeEventName() {
        return PointerEventsSupport.impl.getNativeEventName(this);
    }

}

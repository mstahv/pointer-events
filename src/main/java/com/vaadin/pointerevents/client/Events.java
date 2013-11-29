package com.vaadin.pointerevents.client;


enum Events {

    PointerDown, PointerMove, PointerOut, PointerOver, PointerUp, PointerCancel;

    public String eventName() {
        return PointerEventsSupport.impl.prefix(this.toString());
    }

}

package com.vaadin.pointerevents.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.impl.DOMImplStandard;

public class PointerEventInitializer implements EntryPoint {
    
    @Override
    public void onModuleLoad() {
    }
    
    static {
        initPointerEvents();
    }

    public static void initPointerEvents() {
        JavaScriptObject eventDispatcherMapExtensions = JavaScriptObject.createObject();
        JavaScriptObject captureEventDispatcherMapExtensions = JavaScriptObject.createObject();
        for(Events e : Events.values()) {
            addEventDispatcher(e.toString(), eventDispatcherMapExtensions);
            getPointerEventCaptureDispatchers(e.toString(), captureEventDispatcherMapExtensions);
        }
        DOMImplStandard.addBitlessEventDispatchers(eventDispatcherMapExtensions);
        DOMImplStandard.addCaptureEventDispatchers(captureEventDispatcherMapExtensions);
    }
    
    private static native void addEventDispatcher(String eventName, JavaScriptObject jso) 
    /*-{
        jso[eventName] = @com.google.gwt.user.client.impl.DOMImplStandard::dispatchEvent(*);
    }-*/;

    private static native void getPointerEventCaptureDispatchers(String eventName, JavaScriptObject jso) 
    /*-{
        jso[eventName] = @com.google.gwt.user.client.impl.DOMImplStandard::dispatchCapturedMouseEvent(*);
    }-*/;

}

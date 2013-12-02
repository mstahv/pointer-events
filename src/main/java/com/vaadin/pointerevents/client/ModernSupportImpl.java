package com.vaadin.pointerevents.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.impl.DOMImplStandard;

public class ModernSupportImpl extends PointerEventsSupport {
    
    @Override
    protected boolean supports() {
        return true;
    }

    void doInit() {
        JavaScriptObject eventDispatcherMapExtensions = JavaScriptObject
                .createObject();
        JavaScriptObject captureEventDispatcherMapExtensions = JavaScriptObject
                .createObject();
        for (Events e : Events.values()) {
            addEventDispatcher(e.getNativeEventName(), eventDispatcherMapExtensions);
            getPointerEventCaptureDispatchers(e.getNativeEventName(),
                    captureEventDispatcherMapExtensions);
        }
        DOMImplStandard
                .addBitlessEventDispatchers(eventDispatcherMapExtensions);
        DOMImplStandard
                .addCaptureEventDispatchers(captureEventDispatcherMapExtensions);
    }

    private static native void addEventDispatcher(String eventName,
            JavaScriptObject jso)
    /*-{
        jso[eventName] = @com.google.gwt.user.client.impl.DOMImplStandard::dispatchEvent(*);
    }-*/;

    private static native void getPointerEventCaptureDispatchers(
            String eventName, JavaScriptObject jso)
    /*-{
        jso[eventName] = @com.google.gwt.user.client.impl.DOMImplStandard::dispatchCapturedMouseEvent(*);
    }-*/;

}

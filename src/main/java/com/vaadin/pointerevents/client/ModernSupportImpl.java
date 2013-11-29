package com.vaadin.pointerevents.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.impl.DOMImplStandard;

public class ModernSupportImpl extends PointerEventsSupport {

    @Override
    protected boolean supports() {
        return true;
    }

    void doInit() {
        Window.alert("Setting up pointer event support...");
        JavaScriptObject eventDispatcherMapExtensions = JavaScriptObject
                .createObject();
        JavaScriptObject captureEventDispatcherMapExtensions = JavaScriptObject
                .createObject();
        for (Events e : Events.values()) {
            Window.alert(e.eventName());

            addEventDispatcher(e.eventName(), eventDispatcherMapExtensions);
            getPointerEventCaptureDispatchers(e.eventName(),
                    captureEventDispatcherMapExtensions);
        }
        DOMImplStandard
                .addBitlessEventDispatchers(eventDispatcherMapExtensions);
        DOMImplStandard
                .addCaptureEventDispatchers(captureEventDispatcherMapExtensions);

        Window.alert(" Example " + Events.PointerCancel.eventName());

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

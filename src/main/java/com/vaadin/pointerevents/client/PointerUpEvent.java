package com.vaadin.pointerevents.client;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native PointerUpEvent.
 */
public class PointerUpEvent extends PointerEvent<PointerUpHandler> {

  /**
   * Event type for PointerUpEvent. Represents the meta-data associated with
   * this event.
   */
  private static final Type<PointerUpHandler> TYPE = new Type<PointerUpHandler>(
      Events.PointerUp.getNativeEventName(), new PointerUpEvent());

  /**
   * Gets the event type associated with PointerUpEvent.
   *
   * @return the handler type
   */
  public static Type<PointerUpHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire pointer down events.
   */
  protected PointerUpEvent() {
  }

  @Override
  public final Type<PointerUpHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(PointerUpHandler handler) {
    handler.onPointerUp(this);
  }

}

package com.vaadin.pointerevents.client;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native MsPointerUpEvent.
 */
public class MsPointerUpEvent extends MsPointerEvent<MsPointerUpHandler> {

  /**
   * Event type for MsPointerUpEvent. Represents the meta-data associated with
   * this event.
   */
  private static final Type<MsPointerUpHandler> TYPE = new Type<MsPointerUpHandler>(
      Events.MSPointerUp.toString(), new MsPointerUpEvent());

  /**
   * Gets the event type associated with MsPointerUpEvent.
   *
   * @return the handler type
   */
  public static Type<MsPointerUpHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire pointer down events.
   */
  protected MsPointerUpEvent() {
  }

  @Override
  public final Type<MsPointerUpHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MsPointerUpHandler handler) {
    handler.onPointerUp(this);
  }

}

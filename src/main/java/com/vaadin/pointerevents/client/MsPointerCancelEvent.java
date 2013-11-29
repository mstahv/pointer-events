package com.vaadin.pointerevents.client;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * Represents a native MsPointerCancelEvent.
 */
public class MsPointerCancelEvent extends MsPointerEvent<MsPointerCancelHandler> {

  /**
   * Event type for MsPointerCancelEvent. Represents the meta-data associated with
   * this event.
   */
  private static final Type<MsPointerCancelHandler> TYPE = new Type<MsPointerCancelHandler>(
      Events.MsPointerCancel.toString(), new MsPointerCancelEvent());

  /**
   * Gets the event type associated with pointer cancel events.
   *
   * @return the handler type
   */
  public static Type<MsPointerCancelHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire pointer up events.
   */
  protected MsPointerCancelEvent() {
  }

  @Override
  public final Type<MsPointerCancelHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MsPointerCancelHandler handler) {
    handler.onPointerCancel(this);
  }

}

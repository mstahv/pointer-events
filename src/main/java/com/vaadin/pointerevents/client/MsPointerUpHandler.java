package com.vaadin.pointerevents.client;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler interface for {@link MsPointerUpEvent} events.
 */
public interface MsPointerUpHandler extends EventHandler {

  /**
   * Called when MsPointerUpEvent is fired.
   *
   * @param event the {@link MsPointerUpEvent} that was fired
   */
  void onPointerUp(MsPointerUpEvent event);
}
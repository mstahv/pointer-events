package com.vaadin.addon.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "com.vaadin.pointerevents.PointerEvents";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}

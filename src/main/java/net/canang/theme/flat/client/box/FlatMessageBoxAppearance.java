/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.box;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import net.canang.theme.flat.client.window.FlatWindowAppearance;

public class FlatMessageBoxAppearance extends FlatWindowAppearance {

  public interface FlatMessageBoxResources extends FlatWindowResources, ClientBundle {

    @Source({
        "com/sencha/gxt/theme/base/client/panel/ContentPanel.css",
        "com/sencha/gxt/theme/flat/client/window/FlatWindow.css"})
    @Override
    FlatWindowStyle style();

  }

  public FlatMessageBoxAppearance() {
    super((FlatMessageBoxResources) GWT.create(FlatMessageBoxResources.class));
  }
}

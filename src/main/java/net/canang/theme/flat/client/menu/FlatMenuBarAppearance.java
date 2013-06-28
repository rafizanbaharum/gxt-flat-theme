/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.menu.MenuBarBaseAppearance;

public class FlatMenuBarAppearance extends MenuBarBaseAppearance {

  public interface FlatMenuBarResources extends MenuBarResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/menu/MenuBar.css", "FlatMenuBar.css"})
    FlatMenuBarStyle css();

    @ImageOptions(repeatStyle=RepeatStyle.Horizontal)
    ImageResource background();

  }

  public interface FlatMenuBarStyle extends MenuBarStyle {
  }

  public FlatMenuBarAppearance() {
    this(GWT.<FlatMenuBarResources> create(FlatMenuBarResources.class));
  }

  public FlatMenuBarAppearance(FlatMenuBarResources resources) {
    super(resources);
  }

}

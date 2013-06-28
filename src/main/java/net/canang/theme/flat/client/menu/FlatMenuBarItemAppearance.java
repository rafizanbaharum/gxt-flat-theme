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
import com.sencha.gxt.theme.base.client.menu.MenuBarItemBaseAppearance;

public class FlatMenuBarItemAppearance extends MenuBarItemBaseAppearance {

  public interface FlatMenuBarItemResources extends MenuBarItemResources, ClientBundle {
    @Source({"com/sencha/gxt/theme/base/client/menu/MenuBarItem.css", "FlatMenuBarItem.css"})
    FlatMenuBarItemStyle css();
  }
  
  public interface FlatMenuBarItemStyle extends MenuBarItemStyle {
  }
  
  public FlatMenuBarItemAppearance() {
    this(GWT.<FlatMenuBarItemResources>create(FlatMenuBarItemResources.class));
  }
  
  public FlatMenuBarItemAppearance(FlatMenuBarItemResources resources) {
    super(resources);
  }

}

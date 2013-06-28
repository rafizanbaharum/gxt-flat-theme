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
import com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance;
import net.canang.theme.flat.client.menu.FlatMenuItemAppearance.FlatMenuItemResources;

public class FlatCheckMenuItemAppearance extends CheckMenuItemBaseAppearance {

  public interface FlatCheckMenuItemResources extends CheckMenuItemResources, FlatMenuItemResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/menu/CheckMenuItem.css", "FlatCheckMenuItem.css"})
    FlatCheckMenuItemStyle checkStyle();

  }

  public interface FlatCheckMenuItemStyle extends CheckMenuItemStyle {
  }

  public FlatCheckMenuItemAppearance() {
    this(GWT.<FlatCheckMenuItemResources> create(FlatCheckMenuItemResources.class),
        GWT.<MenuItemTemplate> create(MenuItemTemplate.class));
  }

  public FlatCheckMenuItemAppearance(FlatCheckMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
  }

}

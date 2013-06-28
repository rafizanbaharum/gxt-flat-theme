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
import com.sencha.gxt.theme.base.client.menu.MenuItemBaseAppearance;

public class FlatMenuItemAppearance extends MenuItemBaseAppearance {

  public static class FlatMenuItemAppearanceHelper {

    public static String getMenuParent() {
      return new StringBuilder("url(").append(GWT.getModuleBaseURL()).append("flat/images/menu/menuParent.gif);").toString();
    }

  }

  public interface FlatMenuItemResources extends MenuItemBaseAppearance.MenuItemResources, ClientBundle {

    ImageResource menuParent();

    @Source({"com/sencha/gxt/theme/base/client/menu/MenuItem.css", "FlatMenuItem.css"})
    FlatMenuItemStyle style();

  }

  public interface FlatMenuItemStyle extends MenuItemBaseAppearance.MenuItemStyle {
  }

  public FlatMenuItemAppearance() {
    this(GWT.<FlatMenuItemResources> create(FlatMenuItemResources.class),
        GWT.<MenuItemTemplate> create(MenuItemTemplate.class));
  }

  public FlatMenuItemAppearance(FlatMenuItemResources resources, MenuItemTemplate template) {
    super(resources, template);
  }

}

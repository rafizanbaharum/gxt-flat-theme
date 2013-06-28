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
import com.sencha.gxt.theme.base.client.menu.SeparatorMenuItemBaseAppearance;

public class FlatSeparatorMenuItemAppearance extends SeparatorMenuItemBaseAppearance {

  public interface FlatSeparatorMenuItemResources extends ClientBundle, SeparatorMenuItemResources {

    @Source({"com/sencha/gxt/theme/base/client/menu/SeparatorMenuItem.css", "FlatSeparatorMenuItem.css"})
    FlatSeparatorMenuItemStyle style();

  }

  public interface FlatSeparatorMenuItemStyle extends SeparatorMenuItemStyle {
  }

  public FlatSeparatorMenuItemAppearance() {
    this(GWT.<FlatSeparatorMenuItemResources> create(FlatSeparatorMenuItemResources.class),
        GWT.<SeparatorMenuItemTemplate> create(SeparatorMenuItemTemplate.class));
  }

  public FlatSeparatorMenuItemAppearance(FlatSeparatorMenuItemResources resources,
                                         SeparatorMenuItemTemplate template) {
    super(resources, template);
  }

}

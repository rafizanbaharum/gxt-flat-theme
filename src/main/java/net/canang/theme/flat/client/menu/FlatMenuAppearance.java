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
import com.sencha.gxt.theme.base.client.menu.MenuBaseAppearance;

public class FlatMenuAppearance extends MenuBaseAppearance {

  public interface FlatMenuResources extends MenuBaseAppearance.MenuResources, ClientBundle {

    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
    ImageResource itemOver();

    @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
    ImageResource menu();

    ImageResource miniBottom();

    ImageResource miniTop();

    @Source({"com/sencha/gxt/theme/base/client/menu/Menu.css", "FlatMenu.css"})
    FlatMenuStyle style();

  }

  public interface FlatMenuStyle extends MenuStyle {
  }

  public FlatMenuAppearance() {
    this(GWT.<FlatMenuResources> create(FlatMenuResources.class), GWT.<BaseMenuTemplate> create(BaseMenuTemplate.class));
  }

  public FlatMenuAppearance(FlatMenuResources resources, BaseMenuTemplate template) {
    super(resources, template);
  }

}

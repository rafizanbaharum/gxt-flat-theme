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
import com.sencha.gxt.theme.base.client.menu.ItemBaseAppearance;

public class FlatItemAppearance extends ItemBaseAppearance {

  public interface FlatItemResources extends ItemBaseAppearance.ItemResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/menu/Item.css", "FlatItem.css"})
    FlatItemStyle style();

    ImageResource itemOver();

  }

  public interface FlatItemStyle extends ItemStyle {

    String active();

  }

  public FlatItemAppearance() {
    this(GWT.<FlatItemResources> create(FlatItemResources.class));
  }

  public FlatItemAppearance(FlatItemResources resources) {
    super(resources);
  }

}

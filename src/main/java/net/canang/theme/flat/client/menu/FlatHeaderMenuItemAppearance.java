/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.user.client.Element;
import com.sencha.gxt.widget.core.client.menu.HeaderMenuItem.HeaderMenuItemAppearance;

public class FlatHeaderMenuItemAppearance extends FlatItemAppearance implements HeaderMenuItemAppearance {

  public interface FlatHeaderMenuItemResources extends FlatItemResources {

    @Source("FlatHeaderMenuItem.css")
    FlatHeaderMenuItemStyle headerStyle();

  }

  public interface FlatHeaderMenuItemStyle extends CssResource {

    public String menuText();

  }

  private FlatHeaderMenuItemStyle headerStyle;

  public FlatHeaderMenuItemAppearance() {
    this(GWT.<FlatHeaderMenuItemResources> create(FlatHeaderMenuItemResources.class));
  }

  public FlatHeaderMenuItemAppearance(FlatHeaderMenuItemResources resources) {
    super(resources);
    headerStyle = resources.headerStyle();
    headerStyle.ensureInjected();
  }

  @Override
  public void applyItemStyle(Element element) {
    element.addClassName(headerStyle.menuText());
  }

}

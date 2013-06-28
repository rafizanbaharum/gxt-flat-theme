/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance;

public class FlatSeparatorToolItemAppearance extends SeparatorToolItemDefaultAppearance {

  public interface FlatSeparatorToolItemResources extends SeparatorToolItemResources {
    @Override
    @Source(value = "separatorBackground.gif")
    public ImageResource background();
  }
  
  public FlatSeparatorToolItemAppearance() {
    this(GWT.<FlatSeparatorToolItemResources>create(FlatSeparatorToolItemResources.class), GWT.<Template>create(Template.class));
  }
  
  public FlatSeparatorToolItemAppearance(FlatSeparatorToolItemResources resources, Template template) {
    super(resources, template);
  }

}

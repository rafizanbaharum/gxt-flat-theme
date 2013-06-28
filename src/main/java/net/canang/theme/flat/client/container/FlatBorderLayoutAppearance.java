/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.container;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.container.BorderLayoutBaseAppearance;

public class FlatBorderLayoutAppearance extends BorderLayoutBaseAppearance {

  public interface FlatBorderLayoutResources extends BorderLayoutResources {
    @Override
    @Source({"com/sencha/gxt/theme/base/client/container/BorderLayout.css", "FlatBorderLayout.css"})
    public FlatBorderLayoutStyle css();
  }

  public interface FlatBorderLayoutStyle extends BorderLayoutStyle {

  }

  public FlatBorderLayoutAppearance() {
    super(GWT.<FlatBorderLayoutResources> create(FlatBorderLayoutResources.class));
  }

}

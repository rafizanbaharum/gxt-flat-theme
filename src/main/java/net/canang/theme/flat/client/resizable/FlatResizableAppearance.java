/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.resizable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.resizable.ResizableBaseAppearance;

public class FlatResizableAppearance extends ResizableBaseAppearance {

  public interface FlatResizableResources extends ResizableResources, ClientBundle {

    ImageResource handleEast();

    ImageResource handleNortheast();

    ImageResource handleNorthwest();

    ImageResource handleSouth();

    ImageResource handleSoutheast();

    ImageResource handleSouthwest();

    @Source({"com/sencha/gxt/theme/base/client/resizable/Resizable.css", "FlatResizable.css"})
    FlatResizableStyle style();

  }

  public interface FlatResizableStyle extends ResizableStyle {
  }

  public FlatResizableAppearance() {
    this(GWT.<FlatResizableResources> create(FlatResizableResources.class));
  }

  public FlatResizableAppearance(ResizableResources resources) {
    super(resources);
  }

}

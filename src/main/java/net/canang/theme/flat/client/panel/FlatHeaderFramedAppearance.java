/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

public class FlatHeaderFramedAppearance extends FlatHeaderAppearance {

  public interface FlatHeaderFramedStyle extends HeaderStyle {

  }

  public interface FlatFramedHeaderResources extends HeaderResources {

    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css", "FlatHeader.css", "FlatFramedHeader.css"})
    FlatHeaderFramedStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource headerBackground();
  }

  public FlatHeaderFramedAppearance() {
    this(GWT.<FlatFramedHeaderResources> create(FlatFramedHeaderResources.class), GWT.<Template> create(Template.class));
  }

  public FlatHeaderFramedAppearance(FlatFramedHeaderResources resources, Template template) {
    super(resources, template);
  }
}

/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.colorpalette;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.sencha.gxt.theme.base.client.colorpalette.ColorPaletteBaseAppearance;

public class FlatColorPaletteAppearance extends ColorPaletteBaseAppearance {

  public interface FlatColorPaletteResources extends ColorPaletteBaseAppearance.ColorPaletteResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/colorpalette/ColorPalette.css", "FlatColorPalette.css"})
    FlatColorPaletteStyle style();

  }

  public interface FlatColorPaletteStyle extends ColorPaletteStyle {
  }

  public FlatColorPaletteAppearance() {
    this(GWT.<FlatColorPaletteResources> create(FlatColorPaletteResources.class),
        GWT.<BaseColorPaletteTemplate> create(BaseColorPaletteTemplate.class));
  }

  public FlatColorPaletteAppearance(FlatColorPaletteResources resources, BaseColorPaletteTemplate template) {
    super(resources, template);
  }

}

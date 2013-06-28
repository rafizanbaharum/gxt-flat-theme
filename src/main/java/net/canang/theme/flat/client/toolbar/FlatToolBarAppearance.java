/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.core.client.resources.StyleInjectorHelper;
import com.sencha.gxt.theme.base.client.toolbar.ToolBarBaseAppearance;

public class FlatToolBarAppearance extends ToolBarBaseAppearance {

  public interface FlatToolBarResources extends ClientBundle {
    @Source({"com/sencha/gxt/theme/base/client/toolbar/ToolBarBase.css", "FlatToolBar.css"})
    FlatToolBarStyle style();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource background();

  }

  public interface FlatToolBarStyle extends ToolBarBaseStyle, CssResource {

  }

  private final FlatToolBarStyle style;
  private final FlatToolBarResources resources;

  public FlatToolBarAppearance() {
    this(GWT.<FlatToolBarResources> create(FlatToolBarResources.class));
  }

  public FlatToolBarAppearance(FlatToolBarResources resources) {
    this.resources = resources;
    this.style = this.resources.style();
   
    StyleInjectorHelper.ensureInjected(style, true);
  }

  @Override
  public String toolBarClassName() {
    return style.toolBar();
  }

}

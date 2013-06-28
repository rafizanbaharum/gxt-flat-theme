/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.frame.NestedDivFrame;
import com.sencha.gxt.theme.base.client.frame.NestedDivFrame.NestedDivFrameStyle;
import com.sencha.gxt.theme.base.client.panel.FramedPanelBaseAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderResources;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance.HeaderStyle;
import net.canang.theme.flat.client.panel.FlatFramedPanelAppearance.FramedPanelStyle;
import com.sencha.gxt.widget.core.client.Window.WindowAppearance;

public class FlatWindowAppearance extends FramedPanelBaseAppearance implements WindowAppearance {

  public interface FlatWindowDivFrameStyle extends NestedDivFrameStyle {

  }

  public interface FlatWindowDivFrameResources extends FramedPanelDivFrameResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/frame/NestedDivFrame.css", "FlatWindowDivFrame.css"})
    @Override
    FlatWindowDivFrameStyle style();

    @Source("com/sencha/gxt/theme/base/client/shared/clear.gif")
    ImageResource background();

    @Override
    ImageResource topLeftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Override
    ImageResource topBorder();

    @Override
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource topRightBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource leftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Both)
    @Override
    ImageResource rightBorder();

    @Override
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource bottomLeftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Both)
    @Override
    ImageResource bottomBorder();

    @Override
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource bottomRightBorder();

  }

  public interface FlatWindowStyle extends FramedPanelStyle {
    String ghost();
  }

  public interface FlatHeaderStyle extends HeaderStyle {

  }

  public interface FlatHeaderResources extends HeaderResources {
    @Source({"com/sencha/gxt/theme/base/client/widget/Header.css", "FlatWindowHeader.css"})
    FlatHeaderStyle style();
  }

  public interface FlatWindowResources extends ContentPanelResources, ClientBundle {

    @Source({
        "com/sencha/gxt/theme/base/client/panel/ContentPanel.css",
        "com/sencha/gxt/theme/base/client/window/Window.css", "FlatWindow.css"})
    @Override
    FlatWindowStyle style();

  }

  private FlatWindowStyle style;

  public FlatWindowAppearance() {
    this((FlatWindowResources) GWT.create(FlatWindowResources.class));
  }

  public FlatWindowAppearance(FlatWindowResources resources) {
    super(resources, GWT.<FramedPanelTemplate> create(FramedPanelTemplate.class), new NestedDivFrame(
        GWT.<FlatWindowDivFrameResources> create(FlatWindowDivFrameResources.class)));

    this.style = resources.style();
  }

  @Override
  public HeaderDefaultAppearance getHeaderAppearance() {
    return new HeaderDefaultAppearance(GWT.<FlatHeaderResources> create(FlatHeaderResources.class));
  }

  @Override
  public String ghostClass() {
    return style.ghost();
  }
}

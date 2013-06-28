/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance;
import com.sencha.gxt.theme.base.client.button.ButtonGroupBaseTableFrameResources;
import com.sencha.gxt.theme.base.client.frame.TableFrame;

public class FlatButtonGroupAppearance extends ButtonGroupBaseAppearance {

  public interface FlatButtonGroupTableFrameResources extends ButtonGroupBaseTableFrameResources {

    @Source({
        "com/sencha/gxt/theme/base/client/frame/TableFrame.css",
        "com/sencha/gxt/theme/base/client/button/ButtonGroupTableFrame.css"})
    @Override
    ButtonGroupTableFrameStyle style();

    @Source("com/sencha/gxt/theme/base/client/shared/clear.gif")
    @ImageOptions(repeatStyle = RepeatStyle.Both)
    ImageResource background();

    @Source("groupTopLeftBorder.gif")
    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Override
    ImageResource topLeftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("groupTopBorder.gif")
    @Override
    ImageResource topBorder();

    @Override
    @Source("groupTopRightBorder.gif")
    ImageResource topRightBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Source("groupLeftBorder.gif")
    @Override
    ImageResource leftBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    @Source("groupRightBorder.gif")
    @Override
    ImageResource rightBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("groupBottomBorder.gif")
    @Override
    ImageResource bottomBorder();

    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    @Source("groupTopNoHeadBorder.gif")
    ImageResource topNoHeadBorder();
  }

  public interface FlatButtonGroupResources extends ButtonGroupResources {
    @Source({"com/sencha/gxt/theme/base/client/button/ButtonGroup.css", "FlatButtonGroup.css"})
    ButtonGroupStyle css();
  }

  public FlatButtonGroupAppearance() {
    this(GWT.<FlatButtonGroupResources> create(FlatButtonGroupResources.class));
  }

  public FlatButtonGroupAppearance(FlatButtonGroupResources resources) {
    super(resources, GWT.<GroupTemplate> create(GroupTemplate.class), new TableFrame(
        GWT.<FlatButtonGroupTableFrameResources> create(FlatButtonGroupTableFrameResources.class)));
  }

}

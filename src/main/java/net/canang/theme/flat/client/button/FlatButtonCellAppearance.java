/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.button.ButtonCellDefaultAppearance;
import com.sencha.gxt.theme.base.client.frame.TableFrame;

public class FlatButtonCellAppearance extends ButtonCellDefaultAppearance {

    public interface FlatButtonCellResources extends ButtonCellResources {
        @Source({"com/sencha/gxt/theme/base/client/button/ButtonCell.css", "FlatButtonCell.css"})
        FlatButtonCellStyle style();
    }

    public interface FlatButtonTableFrameResources extends TableFrame.TableFrameResources, ClientBundle {
        @Source({"com/sencha/gxt/theme/base/client/frame/TableFrame.css", "com/sencha/gxt/theme/base/client/button/ButtonTableFrame.css", "FlatButtonTableFrame.css"})
        @Override
        FlatButtonTableFrameStyle style();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource background();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource backgroundOverBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource backgroundPressedBorder();

        @Override
        ImageResource topLeftBorder();

        ImageResource topLeftOverBorder();

        ImageResource topLeftPressedBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        @Override
        ImageResource topBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource topOverBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource topPressedBorder();

        @Override
        ImageResource topRightBorder();

        ImageResource topRightOverBorder();

        ImageResource topRightPressedBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        @Override
        ImageResource leftBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        ImageResource leftOverBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        ImageResource leftPressedBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        @Override
        ImageResource rightBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        ImageResource rightOverBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Vertical)
        ImageResource rightPressedBorder();

        @Override
        ImageResource bottomLeftBorder();

        ImageResource bottomLeftOverBorder();

        ImageResource bottomLeftPressedBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        @Override
        ImageResource bottomBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource bottomOverBorder();

        @ImageResource.ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource bottomPressedBorder();

        @Override
        ImageResource bottomRightBorder();

        ImageResource bottomRightOverBorder();

        ImageResource bottomRightPressedBorder();
    }


    public interface FlatButtonCellStyle extends ButtonCellStyle {
        String button();
    }

    public interface FlatButtonTableFrameStyle extends TableFrame.TableFrameStyle {
    }

    public FlatButtonCellAppearance() {
        this(GWT.<FlatButtonCellResources>create(FlatButtonCellResources.class));
    }

    public FlatButtonCellAppearance(FlatButtonCellResources resources) {
        super(resources, GWT.<ButtonCellTemplates>create(ButtonCellTemplates.class), new TableFrame(GWT.<FlatButtonTableFrameResources>create(FlatButtonTableFrameResources.class)));
    }
}

/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.progress;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.theme.base.client.progress.ProgressBarDefaultAppearance;

public class FlatProgressBarAppearance extends ProgressBarDefaultAppearance {

  public interface FlatProgressBarResources extends ProgressBarResources, ClientBundle {

    @Source({"com/sencha/gxt/theme/base/client/progress/ProgressBar.css", "ProgressBar.css"})
    @Override
    ProgressBarStyle style();

    @Source("progress-bg.gif")
    @Override
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource bar();
    
    @Source("bg.gif")
    @ImageOptions(repeatStyle = RepeatStyle.Horizontal)
    ImageResource innerBar();
  }

  public FlatProgressBarAppearance() {
    super(GWT.<ProgressBarResources> create(FlatProgressBarResources.class),
        GWT.<ProgressBarTemplate> create(ProgressBarTemplate.class));
  }

}

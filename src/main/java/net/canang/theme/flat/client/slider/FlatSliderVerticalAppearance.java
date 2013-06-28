/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.slider;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;
import com.sencha.gxt.cell.core.client.SliderCell.VerticalSliderAppearance;
import com.sencha.gxt.theme.base.client.slider.SliderVerticalBaseAppearance;

public class FlatSliderVerticalAppearance extends SliderVerticalBaseAppearance implements VerticalSliderAppearance {

  public static class FlatSliderVerticalAppearanceHelper {

    public static String getTrackVerticalBottom() {
      return new StringBuilder("url(").append(GWT.getModuleBaseURL()).append(
          "/flat/images/slider/trackVerticalBottom.png);").toString();
    }

    public static String getTrackVerticalMiddle() {
      return new StringBuilder("url(").append(GWT.getModuleBaseURL()).append(
          "/flat/images/slider/trackVerticalMiddle.png);").toString();
    }

    public static String getTrackVerticalTop() {
      return new StringBuilder("url(").append(GWT.getModuleBaseURL()).append(
          "/flat/images/slider/trackVerticalTop.png);").toString();
    }

  }

  public interface FlatSliderVerticalResources extends SliderVerticalResources, ClientBundle {

    @Source({
        "com/sencha/gxt/theme/base/client/slider/Slider.css",
        "com/sencha/gxt/theme/base/client/slider/SliderVertical.css", "FlatSliderVertical.css"})
    FlatVerticalSliderStyle style();

    ImageResource thumbVertical();

    ImageResource thumbVerticalDown();

    ImageResource thumbVerticalOver();

    ImageResource trackVerticalBottom();

    @ImageOptions(repeatStyle = RepeatStyle.Vertical)
    ImageResource trackVerticalMiddle();

    ImageResource trackVerticalTop();

  }

  public interface FlatVerticalSliderStyle extends BaseSliderVerticalStyle, CssResource {
  }

  public FlatSliderVerticalAppearance() {
    this(GWT.<FlatSliderVerticalResources> create(FlatSliderVerticalResources.class),
        GWT.<SliderVerticalTemplate> create(SliderVerticalTemplate.class));
  }

  public FlatSliderVerticalAppearance(FlatSliderVerticalResources resources, SliderVerticalTemplate template) {
    super(resources, template);
  }

}

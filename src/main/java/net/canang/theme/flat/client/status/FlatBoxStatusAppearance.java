/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.status;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance;
import com.sencha.gxt.widget.core.client.Status.BoxStatusAppearance;

public class FlatBoxStatusAppearance extends BoxStatusBaseAppearance implements BoxStatusAppearance {

  public interface FlatBoxStatusStyle extends BoxStatusStyle {

    String status();

    String statusIcon();

    String statusText();

    String statusBox();

  }

  public interface FlatBoxStatusResources extends BoxStatusResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/status/Status.css", "FlatBoxStatus.css"})
    FlatBoxStatusStyle style();

    @Override
    @Source("com/sencha/gxt/theme/base/client/grid/loading.gif")
    ImageResource loading();

  }

  public FlatBoxStatusAppearance() {
    this(GWT.<FlatBoxStatusResources> create(FlatBoxStatusResources.class), GWT.<BoxTemplate> create(BoxTemplate.class));
  }

  public FlatBoxStatusAppearance(FlatBoxStatusResources resources, BoxTemplate template) {
    super(resources, template);
  }

}

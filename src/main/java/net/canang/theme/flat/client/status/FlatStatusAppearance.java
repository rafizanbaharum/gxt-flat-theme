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
import com.sencha.gxt.theme.base.client.status.StatusBaseAppearance;

public class FlatStatusAppearance extends StatusBaseAppearance {

  public interface FlatStatusResources extends StatusBaseAppearance.StatusResources, ClientBundle {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/status/Status.css", "FlatStatus.css"})
    StatusStyle style();

    @Override
    @Source("com/sencha/gxt/theme/base/client/grid/loading.gif")
    ImageResource loading();

  }

  public FlatStatusAppearance() {
    super(GWT.<StatusResources> create(FlatStatusResources.class), GWT.<Template> create(Template.class));
  }
  
  public FlatStatusAppearance(FlatStatusResources resources, Template template) {
    super(resources, template);
  }

}

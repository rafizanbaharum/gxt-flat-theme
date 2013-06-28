/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.panel;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.panel.ContentPanelBaseAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;

public class FlatContentPanelAppearance extends ContentPanelBaseAppearance {

  public interface FlatContentPanelResources extends ContentPanelResources {

    @Source({"com/sencha/gxt/theme/base/client/panel/ContentPanel.css", "FlatContentPanel.css"})
    @Override
    FlatContentPanelStyle style();

  }

  public interface FlatContentPanelStyle extends ContentPanelStyle {

  }

  public FlatContentPanelAppearance() {
    super(GWT.<FlatContentPanelResources> create(FlatContentPanelResources.class),
        GWT.<ContentPanelTemplate> create(ContentPanelTemplate.class));
  }

  public FlatContentPanelAppearance(FlatContentPanelResources resources) {
    super(resources, GWT.<ContentPanelTemplate> create(ContentPanelTemplate.class));
  }

  @Override
  public HeaderDefaultAppearance getHeaderAppearance() {
    return new FlatHeaderAppearance();
  }

}

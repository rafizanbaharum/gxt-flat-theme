/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.panel;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.panel.AccordionLayoutBaseAppearance;
import com.sencha.gxt.theme.base.client.widget.HeaderDefaultAppearance;

public class FlatAccordionLayoutAppearance extends AccordionLayoutBaseAppearance {
  
  public interface FlatAccordionLayoutResources extends ContentPanelResources {

    @Source({"com/sencha/gxt/theme/base/client/panel/ContentPanel.css", "FlatContentPanel.css"})
    @Override
    FlatAccordionLayoutStyle style();

  }

  public interface FlatAccordionLayoutStyle extends ContentPanelStyle {

  }
  
  public FlatAccordionLayoutAppearance() {
    super(GWT.<FlatAccordionLayoutResources> create(FlatAccordionLayoutResources.class));
  }

  public FlatAccordionLayoutAppearance(FlatAccordionLayoutResources resources) {
    super(resources);
  }
  
  @Override
  public HeaderDefaultAppearance getHeaderAppearance() {
    return new FlatAccordionHeaderAppearance();
  }
}

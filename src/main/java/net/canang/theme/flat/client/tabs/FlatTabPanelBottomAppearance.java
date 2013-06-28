/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.widget.core.client.TabPanel.TabPanelBottomAppearance;

public class FlatTabPanelBottomAppearance extends FlatTabPanelAppearance implements TabPanelBottomAppearance {

  public interface BottomTemplate extends Template {

    @XTemplate(source = "TabPanelBottom.html")
    SafeHtml render(TabPanelStyle style);

  }

  public FlatTabPanelBottomAppearance() {
    this(GWT.<FlatTabPanelResources> create(FlatTabPanelResources.class), GWT
        .<BottomTemplate> create(BottomTemplate.class), GWT.<ItemTemplate> create(ItemTemplate.class));
  }

  public FlatTabPanelBottomAppearance(FlatTabPanelResources resources, BottomTemplate template,
                                      ItemTemplate itemTemplate) {
    super(resources, template, itemTemplate);
  }

  @Override
  public XElement getBar(XElement parent) {
    return parent.selectNode("." + style.tabFooter());
  }

  @Override
  public XElement getStrip(XElement parent) {
    return parent.selectNode("." + style.tabStripBottom());
  }

}

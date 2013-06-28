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
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import net.canang.theme.flat.client.tabs.FlatPlainTabPanelAppearance.FlatPlainTabPanelResources;
import net.canang.theme.flat.client.tabs.FlatPlainTabPanelAppearance.FlatPlainTabPanelStyle;
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel.PlainTabPanelAppearance;

/**
 * A flat-coloured appearance for {@link PlainTabPanel} with tabs below the
 * content area. This appearance differs from
 * {@link FlatTabPanelBottomAppearance} in that it has a simplified tab strip.
 */
public class FlatPlainTabPanelBottomAppearance extends FlatTabPanelBottomAppearance implements PlainTabPanelAppearance {

  public interface PlainTabPanelBottomTemplates extends BottomTemplate {

    @XTemplate(source = "TabPanelBottom.html")
    SafeHtml render(TabPanelStyle style);

    @XTemplate(source = "PlainTabPanelBottom.html")
    SafeHtml renderPlain(FlatPlainTabPanelStyle style);

  }

  protected PlainTabPanelBottomTemplates template;
  protected FlatPlainTabPanelResources resources;

  public FlatPlainTabPanelBottomAppearance() {
    this(GWT.<FlatPlainTabPanelResources> create(FlatPlainTabPanelResources.class),
        GWT.<PlainTabPanelBottomTemplates> create(PlainTabPanelBottomTemplates.class),
        GWT.<ItemTemplate> create(ItemTemplate.class));
  }

  public FlatPlainTabPanelBottomAppearance(FlatPlainTabPanelResources resources, PlainTabPanelBottomTemplates template,
                                           ItemTemplate itemTemplate) {
    super(resources, template, itemTemplate);
    this.resources = resources;
    this.template = template;
  }

  @Override
  public void render(SafeHtmlBuilder builder) {
    builder.append(template.renderPlain(resources.style()));
  }

}

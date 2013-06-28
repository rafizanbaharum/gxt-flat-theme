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
import com.sencha.gxt.widget.core.client.PlainTabPanel;
import com.sencha.gxt.widget.core.client.PlainTabPanel.PlainTabPanelAppearance;

/**
 * A flat-colored appearance for {@link PlainTabPanel}. This appearance differs
 * from {@link FlatTabPanelAppearance} in that it has a simplified tab strip.
 */
public class FlatPlainTabPanelAppearance extends FlatTabPanelAppearance implements PlainTabPanelAppearance {

  public interface FlatPlainTabPanelResources extends FlatTabPanelResources {

    @Source({
        "com/sencha/gxt/theme/base/client/tabs/TabPanel.css", "FlatTabPanel.css",
        "com/sencha/gxt/theme/base/client/tabs/PlainTabPanel.css", "FlatPlainTabPanel.css"})
    FlatPlainTabPanelStyle style();

  }

  public interface FlatPlainTabPanelStyle extends FlatTabPanelStyle {

    String tabStripSpacer();

  }

  public interface PlainTabPanelTemplates extends Template {

    @XTemplate(source = "com/sencha/gxt/theme/base/client/tabs/TabPanel.html")
    SafeHtml render(TabPanelStyle style);

    @XTemplate(source = "com/sencha/gxt/theme/base/client/tabs/PlainTabPanel.html")
    SafeHtml renderPlain(FlatPlainTabPanelStyle style);

  }

  private final PlainTabPanelTemplates template;
  private final FlatPlainTabPanelStyle style;

  public FlatPlainTabPanelAppearance() {
    this(GWT.<FlatPlainTabPanelResources> create(FlatPlainTabPanelResources.class),
        GWT.<PlainTabPanelTemplates> create(PlainTabPanelTemplates.class),
        GWT.<ItemTemplate> create(ItemTemplate.class));
  }

  public FlatPlainTabPanelAppearance(FlatPlainTabPanelResources resources, PlainTabPanelTemplates template,
                                     ItemTemplate itemTemplate) {
    super(resources, template, itemTemplate);
    this.style = resources.style();
    this.template = template;
  }

  @Override
  public void render(SafeHtmlBuilder builder) {
    builder.append(template.renderPlain(style));
  }

}

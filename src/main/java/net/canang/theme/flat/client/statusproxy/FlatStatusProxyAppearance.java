/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.statusproxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance;

public class FlatStatusProxyAppearance extends StatusProxyBaseAppearance {

  public interface FlatStatusProxyResources extends StatusProxyResources, ClientBundle {

    ImageResource dropAllowed();

    ImageResource dropDisallowed();

    @Source({"com/sencha/gxt/theme/base/client/statusproxy/StatusProxy.css", "FlatStatusProxy.css"})
    FlatStatusProxyStyle style();

  }

  public interface FlatStatusProxyStyle extends StatusProxyStyle {
  }

  public FlatStatusProxyAppearance() {
    this(GWT.<FlatStatusProxyResources> create(FlatStatusProxyResources.class),
        GWT.<StatusProxyTemplates> create(StatusProxyTemplates.class));
  }

  public FlatStatusProxyAppearance(FlatStatusProxyResources resources, StatusProxyTemplates templates) {
    super(resources, templates);
  }

}

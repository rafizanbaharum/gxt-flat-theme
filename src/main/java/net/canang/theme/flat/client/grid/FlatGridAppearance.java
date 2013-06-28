/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.grid;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.grid.GridBaseAppearance;

public class FlatGridAppearance extends GridBaseAppearance {

  public interface FlatGridStyle extends GridStyle {
    
  }
  
  public interface FlatGridResources extends GridResources  {
    
    @Source({"com/sencha/gxt/theme/base/client/grid/Grid.css", "FlatGrid.css"})
    @Override
    FlatGridStyle css();
  }
  
  
  public FlatGridAppearance() {
    this(GWT.<FlatGridResources> create(FlatGridResources.class));
  }

  public FlatGridAppearance(FlatGridResources resources) {
    super(resources);
  }
}

/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.field;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance;

public class FlatFieldSetAppearance extends FieldSetDefaultAppearance {

  public interface FlatFieldSetResources extends FieldSetResources {
    
    @Override
    @Source({"com/sencha/gxt/theme/base/client/field/FieldSet.css", "FlatFieldSet.css"})
    public FlatFieldSetStyle css();
  }
  
  public interface FlatFieldSetStyle extends FieldSetStyle {
    
  }
  
  
  public FlatFieldSetAppearance() {
    this(GWT.<FlatFieldSetResources>create(FlatFieldSetResources.class));
  }
  
  public FlatFieldSetAppearance(FlatFieldSetResources resources) {
    super(resources);
  }
  
}

/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */
package net.canang.theme.flat.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance;

public class FlatColumnHeaderAppearance extends ColumnHeaderDefaultAppearance {

    public interface FlatColumnHeaderResources extends ColumnHeaderResources {
        @Source({"com/sencha/gxt/theme/base/client/grid/ColumnHeader.css", "FlatColumnHeader.css"})
        ColumnHeaderStyle style();

        @ImageOptions(repeatStyle = ImageResource.RepeatStyle.Horizontal)
        ImageResource columnHeader();
    }

    public interface FlatColumnHeaderStyle extends ColumnHeaderStyle {

    }

    public FlatColumnHeaderAppearance() {
        this(GWT.<FlatColumnHeaderResources>create(FlatColumnHeaderResources.class));
    }

    public FlatColumnHeaderAppearance(FlatColumnHeaderResources resources) {
        super(resources);
    }
}

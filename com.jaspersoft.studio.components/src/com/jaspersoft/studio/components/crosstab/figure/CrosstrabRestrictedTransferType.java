/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.components.crosstab.figure;

import org.eclipse.swt.dnd.ByteArrayTransfer;

/**
 * Define a transfer type, has essentially the goal to separate a drop of a CrossTab Template form 
 * any other drag and drop operations
 * 
 * @author Orlandin Marco
 *
 */
public class CrosstrabRestrictedTransferType extends ByteArrayTransfer{

	/**
	 * The name of the transfer type
	 */
	private static final String TYPE_NAME = "crosstab-style-transfer-format";

	/**
	 * The transfer type id
	 */
	private static final int TYPEID = registerType(TYPE_NAME);
	
	private CrosstrabRestrictedTransferType() {
		super();
	}
	
	/**
	 * an instance of the transfer type
	 */
    private static CrosstrabRestrictedTransferType instance = new CrosstrabRestrictedTransferType();
    
    /**
     * Returns the singleton instance.
     *
     * @return the singleton instance
     */
    public static CrosstrabRestrictedTransferType getInstance() {
        return instance;
    }

    protected int[] getTypeIds() {
        return new int[] { TYPEID };
    }

    protected String[] getTypeNames() {
        return new String[] { TYPE_NAME };
    }

}

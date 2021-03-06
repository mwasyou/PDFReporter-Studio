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
package com.jaspersoft.studio.server.model.datasource.filter;

import java.util.HashSet;
import java.util.Set;

import com.jaspersoft.jasperserver.api.metadata.xml.domain.impl.ResourceDescriptor;

public class DatasourceVDSFilter implements IDatasourceFilter {
	private final static Set<String> types = new HashSet<String>();
	static {
		types.add(ResourceDescriptor.TYPE_DATASOURCE);
		types.add(ResourceDescriptor.TYPE_DATASOURCE_BEAN);
		types.add(ResourceDescriptor.TYPE_DATASOURCE_JNDI);
		types.add(ResourceDescriptor.TYPE_DATASOURCE_JDBC);
	}

	public static Set<String> getTypes() {
		return types;
	}

	@Override
	public boolean isDatasource(ResourceDescriptor r) {
		return types.contains(r.getWsType().toLowerCase());
	}

	@Override
	public Set<String> getFilterTypes() {
		return types;
	}

}

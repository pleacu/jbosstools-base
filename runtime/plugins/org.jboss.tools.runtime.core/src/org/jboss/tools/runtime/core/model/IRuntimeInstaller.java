/*******************************************************************************
 * Copyright (c) 2015 Red Hat 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat
 *******************************************************************************/
package org.jboss.tools.runtime.core.model;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.jboss.tools.foundation.core.tasks.TaskModel;

public interface IRuntimeInstaller {
	
	/**
	 * Download and install the given runtime. 
	 * 
	 * @param dlrt
	 * @param selectedDirectory
	 * @param destinationDirectory
	 * @param deleteOnExit
	 * @param taskModel
	 * @param monitor
	 * @return
	 */
	public IStatus installRuntime(
			DownloadRuntime dlrt,
			final String selectedDirectory,
			final String destinationDirectory, 
			final boolean deleteOnExit, 
			TaskModel taskModel, IProgressMonitor monitor);

}

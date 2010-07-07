/*
* Copyright (c) 2006-2010 Nokia Corporation and/or its subsidiary(-ies). 
* All rights reserved.
* This component and the accompanying materials are made available
* under the terms of "Eclipse Public License v1.0"
* which accompanies this distribution, and is available
* at the URL "http://www.eclipse.org/legal/epl-v10.html".
*
* Initial Contributors:
* Nokia Corporation - initial contribution.
*
* Contributors:
*
* Description:
*
*/
package com.nokia.tools.screen.ui.views;

import org.eclipse.osgi.util.NLS;

/**
 * NLS messages.
 * 
 */
public class ViewMessages extends NLS {
	/**
	 * No theme opened
	 */
	public static String ResourceView_NoTheme;
	/**
	 * Default text shown when resource view is not available
	 */
	public static String ResourceView_defaultText;

	
	public static String ResView_toggleSync_tooltip;
	
	public static String ResourceView_SkinBySubmenu;

	static {
		NLS
				.initializeMessages(ViewMessages.class.getName(),
						ViewMessages.class);
	}
}

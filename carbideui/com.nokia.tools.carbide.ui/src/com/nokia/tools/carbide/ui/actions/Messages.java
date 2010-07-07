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

package com.nokia.tools.carbide.ui.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	
	public static String RegistrationStatusDialog_title;
	public static String RegistrationStatusAlreadyRegistered_info;
	

	static {
		NLS.initializeMessages(Messages.class.getName(), Messages.class);
	}
}

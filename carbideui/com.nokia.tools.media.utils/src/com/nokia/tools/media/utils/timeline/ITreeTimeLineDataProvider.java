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

package com.nokia.tools.media.utils.timeline;

import org.eclipse.jface.viewers.ILabelProvider;

public interface ITreeTimeLineDataProvider extends ITimeLineDataProvider {

	ITimeLineTreeContentProvider getTreeContentProvider();
	
	ILabelProvider getTreeLabelProvider();
	
	ITimeLineRow getRowForTreeElement(Object object);
	
}

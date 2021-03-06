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

package com.nokia.tools.media.utils.tooltip;

import org.eclipse.jface.action.IAction;

import com.nokia.tools.ui.tooltip.CompositeTooltip;

public interface IDynamicTooltipToolbarAction extends IAction {
	
	public void setTooltip(CompositeTooltip tooltip);
	
	public void setUIContainer(Object uiContainer);

	public void setSelection(Object selection);

}

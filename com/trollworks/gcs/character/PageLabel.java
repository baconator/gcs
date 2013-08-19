/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is GURPS Character Sheet.
 *
 * The Initial Developer of the Original Code is Richard A. Wilkes.
 * Portions created by the Initial Developer are Copyright (C) 1998-2002,
 * 2005-2008 the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */

package com.trollworks.gcs.character;

import com.trollworks.gcs.utility.Fonts;
import com.trollworks.gcs.widgets.LinkedLabel;

import javax.swing.JComponent;

/** A label for a field in a page. */
public class PageLabel extends LinkedLabel {
	/**
	 * Creates a new label for the specified field.
	 * 
	 * @param title The title of the field.
	 * @param field The field.
	 */
	public PageLabel(String title, JComponent field) {
		super(title, Fonts.KEY_LABEL, field);
	}

	/**
	 * Creates a new label for the specified field.
	 * 
	 * @param title The title of the field.
	 * @param field The field.
	 * @param alignment The horizontal alignment to use.
	 */
	public PageLabel(String title, JComponent field, int alignment) {
		super(title, Fonts.KEY_LABEL, field, alignment);
	}
}

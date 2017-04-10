/**
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * 
 * @author Alessandro Secco: seccoale@gmail.com
 */
package org.mozilla.zest.core.v1;

import java.net.MalformedURLException;
// TODO: Auto-generated Javadoc

/**
 * empty class: represents a BREAK inside the loop.
 */
public class ZestControlLoopBreak extends ZestControl {

	@Override
	void setPrefix(String oldPrefix, String newPrefix)
			throws MalformedURLException {		
	}

	@Override
	public ZestControlLoopBreak deepCopy() {
		ZestControlLoopBreak copy = new ZestControlLoopBreak();
		copy.setEnabled(this.isEnabled());
		return copy;
	}

	@Override
	public boolean isPassive() {
		return true;
	}
	
}
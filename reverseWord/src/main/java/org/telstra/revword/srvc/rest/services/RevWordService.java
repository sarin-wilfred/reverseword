/**
 * 
 */
package org.telstra.revword.srvc.rest.services;

import org.telstra.revword.srvc.rest.exceptions.RevWordException;

/**
 * @author Sarin
 *
 */
public interface RevWordService {
	
	/**
	 * @param scentence
	 * @return String
	 * @throws RevWordException
	 */
	public String process(String scentence) throws RevWordException;

}

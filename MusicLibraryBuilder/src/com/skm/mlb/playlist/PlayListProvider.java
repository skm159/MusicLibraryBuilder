/**
 * 
 */
package com.skm.mlb.playlist;

import java.util.List;

/**
 * @author intel
 *
 */
public interface PlayListProvider {

	public List<Song> availableSongs();
	
	public List<Song> unAvailableSongs();
	
}

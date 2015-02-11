/**
 * 
 */
package com.skm.mlb.playlist;

import java.util.List;

/**
 * @author intel
 *
 */
public class Playlist {

	private String name;
	private List<Song> songList;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the songList
	 */
	public List<Song> getSongList() {
		return songList;
	}

	/**
	 * @param songList
	 *            the songList to set
	 */
	public void setSongList(List<Song> songList) {
		this.songList = songList;
	}

	/**
	 * 
	 */
	public Playlist() {
		// TODO Auto-generated constructor stub
	}

}

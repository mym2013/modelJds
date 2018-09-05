// lo primero que hacemos es crear un indicador mostrando donde estamos ubicados (una especia de mapa virtual)
package com.teamLaunch.model;

public class Song{
	private String mArtist;
	private String mTitle;
	private String mVideoUrl;
	
	public Song( String artist, String title, String videoUrl){
		
		mArtist = artist;
		mTitle = title;
		mVideoUrl = videoUrl;
	
}
	
	public String getTitle(){
		return mTitle;
	}
	
	public String getArtist(){
		return mArtist;
	}
	public String getVideoUrl(){
		return mVideoUrl;
	}
	@Override
	public String toString(){
	return String.format("Canción %s por %s", mTitle, mArtist);
	}
}
	
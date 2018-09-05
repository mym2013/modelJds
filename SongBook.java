// lo primero que hacemos es crear un indicador mostrando donde estamos ubicados (una especia de mapa virtual)
package com.teamLaunch.model;

import java.util.List;
import java.util.ArrayList;

public class SongBook{
	private List<Song> mSongs; 
	
	public SongBook(){
		mSongs = new ArrayList<Song>();

	}
	
//	ahora creamos un metodo apra agregar canciones, así cuando llamemos a este metodo se agregará una canción(deberá aceptar como parametro una canción) 
//	La canción deberá ser ingresada de acuerdo al formato que le dimos a la clase Song

	public void addSong(Song cancion){
		mSongs.add(cancion);
  }
	
//	Ahora creamos un par de metodos para mostrar algunas caracteristica de nuestra clase, por ejemplo el largo de la lista de canciones
	
 public int  getSongCount(){
	return mSongs.size();
 }
	
	
	
	
}
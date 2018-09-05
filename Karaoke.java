import com.teamLaunch.model.Song;
import com.teamLaunch.model.SongBook;


public class Karaoke {
//	*****************asi debe estar formateada la estructura de la canción**************
//		public Song( String artist, String title, String videoUrl){
//		mArtist = artist;
//		mTitle = title;
//		mVideoUrl = videoUrl;

	public static void main(String[] args){
		
		Song cancion = new Song(
			"Michael Jackson",
			"Beat it",
			"https://www.youtube.com/watch?v=SaEC9i9QOvK");
		
			 SongBook songBook = new SongBook();
		   System.out.printf("Agregando %s %n", cancion);
			songBook.addSong(cancion);	
		System.out.printf("ahora tenemos %d cancion(es). %n", songBook.getSongCount());
		
	}
	
	
	
	
	
	
}
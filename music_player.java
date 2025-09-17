package Lab4;
interface Media{
void play();
void stop();
default void pause() {
	System.out.println("Media paused");
}
static void about() {
	System.out.println("This is a media interface");
}
}

interface AdvancedMedia extends Media{
	void nextTrack();
}
class MP implements AdvancedMedia{
	public void play() {
		System.out.println("MUSIC STARTED");
	}
	public void stop() {
		System.out.println("Music Stopped");
	}
	public void nextTrack() {
		System.out.println("Next song");
	}
}
public class music_player {
	public static void main(String[]args) {
		MP music=new MP();
		music.play();
		music.nextTrack();
	
		music.pause();
		Media.about();
		music.stop();
	}

}

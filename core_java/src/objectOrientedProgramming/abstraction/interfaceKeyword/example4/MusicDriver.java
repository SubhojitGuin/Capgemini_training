package objectOrientedProgramming.abstraction.interfaceKeyword.example4;

public class MusicDriver {

	public static void main(String[] args) {
		MusicPlayer musicPlayer = new SpotifyPlayer();
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.stop();
		
		System.out.println();
		musicPlayer = new YoutubeMusicPlayer();
		musicPlayer.play();
		musicPlayer.pause();
		musicPlayer.stop();
	}

}

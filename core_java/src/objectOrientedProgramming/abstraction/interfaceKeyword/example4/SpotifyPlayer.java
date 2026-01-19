package objectOrientedProgramming.abstraction.interfaceKeyword.example4;

public class SpotifyPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("Play spotify");
	}

	@Override
	public void pause() {
		System.out.println("Pause spotify");
	}

	@Override
	public void stop() {
		System.out.println("Stop spotify");
	}

}

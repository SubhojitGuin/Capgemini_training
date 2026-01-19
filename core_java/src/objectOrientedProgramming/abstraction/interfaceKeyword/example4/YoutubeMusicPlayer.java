package objectOrientedProgramming.abstraction.interfaceKeyword.example4;

public class YoutubeMusicPlayer implements MusicPlayer {

	@Override
	public void play() {
		System.out.println("Play Youtube Music");
	}

	@Override
	public void pause() {
		System.out.println("Pause Youtube Music");
	}

	@Override
	public void stop() {
		System.out.println("Stop Youtube Music");
	}

}

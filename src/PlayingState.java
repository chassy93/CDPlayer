
public class PlayingState implements State {
	CDPlayer cdPlayer;
	
	public PlayingState(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	public void pressedPlay() {
		System.out.println("Song is already playing");
	}
	public void songOver() {
		System.out.println("Song has ended");
		cdPlayer.setState(cdPlayer.getnotPlayingState());
	}
	public void pressedNext() {
		System.out.println("Playing next song");
		cdPlayer.setState(cdPlayer.getplayingState());
	}
	public void playlistOverState() {
		System.out.println("The playlist is over");
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}

	public String toString() {
		return "Waiting for play button to be pressed";
	}
}

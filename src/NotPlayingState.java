
public class NotPlayingState implements State {
	CDPlayer cdPlayer;
	
	public NotPlayingState(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	
	public void pressedPlay() {
		System.out.println("You pressed play, playing song");
		cdPlayer.setState(cdPlayer.getplayingState());
	}
	public void songOver() {
		System.out.println("Song has ended");
		cdPlayer.setState(cdPlayer.getnotPlayingState());
	}
	public void pressedNext() {
		System.out.println("Skipping song");
		cdPlayer.setState(cdPlayer.getplayingState());
	}
	public void playlistOverState() {
		System.out.println("The playlist is over.");
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}
	public String toString() {
		return "No songs are playing";
	}
}

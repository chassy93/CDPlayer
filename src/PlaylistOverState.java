
public class PlaylistOverState implements State {
	CDPlayer cdPlayer;
	
	public PlaylistOverState(CDPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	public void pressedPlay() {
		System.out.println("There are not more songs.");
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}
	public void songOver() {
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}
	public void pressedNext() {
		System.out.println("There are no more songs");
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}
	public void playlistOverState() {
		System.out.println("The playlist is over.");
		cdPlayer.setState(cdPlayer.getplayListOverState());
	}
	public String toString() {
		return "Your playlist is over.";
	}
}

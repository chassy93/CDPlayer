
public class CDPlayer {
	State playingState;
	State notPlayingState;
	State playlistOverState;
	
	State state = notPlayingState;
	int count = 0;
	
	public CDPlayer(int numberSongs) {
		playingState = new PlayingState(this);
		notPlayingState = new NotPlayingState(this);
		playlistOverState = new PlaylistOverState(this);
		
		this.count = numberSongs;
		if(numberSongs > 0) {
			state = notPlayingState;
		}
	}
	
	public void pressedPlay() {
		if(count <= 0) {
			state = playlistOverState;
		}else {
			state.pressedPlay();
		}
	}
	public void songOver() {
		state.songOver();
	}
	public void pressedNext() {
		if(count <= 0) {
			state = playlistOverState;
		}else {
			state.pressedNext();
		}
	}
	public void playlistOverState() {
		state.playlistOverState();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void playSong() {
		System.out.println("Playing a song.");
		if (count != 0) {
			count = count - 1;
		}
	}
	 int getCount() {
		 return count;
	 }
	 
	 public State getState() {
		 return state;
	 }
	 
	 public State getplayingState() {
		 return playingState;
	 }
	 
	 public State getnotPlayingState() {
		 return notPlayingState;
	 }
	 
	 public State getplayListOverState() {
		 return playlistOverState;
	 }
	 
	 public String toString() {
		 StringBuffer result = new StringBuffer();
		 result.append("\nCDPlayer");
		 result.append("\nPlayList: "+count+" song");
		 if(count != 1) {
			 result.append("s");
		 }
		 result.append("\n");
		 result.append(state+"\n");
		 return result.toString();
	 }
}

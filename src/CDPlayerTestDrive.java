
public class CDPlayerTestDrive {
	public static void main(String[] args) {
		CDPlayer cdPlayer = new CDPlayer(5);
		System.out.println(cdPlayer);
		
		cdPlayer.pressedPlay();
		cdPlayer.songOver();
		cdPlayer.pressedNext();
		cdPlayer.songOver();
		
		System.out.println(cdPlayer);
		
		cdPlayer.playSong();
		cdPlayer.songOver();
		cdPlayer.playSong();
		cdPlayer.songOver();
		
		System.out.println(cdPlayer);
		
		cdPlayer.playSong();
		cdPlayer.songOver();
		cdPlayer.playSong();
		cdPlayer.songOver();
		
		System.out.println(cdPlayer);
		
		cdPlayer.playSong();
		cdPlayer.songOver();
		cdPlayer.playSong();
		cdPlayer.songOver();
		
		System.out.println(cdPlayer);
	}
}

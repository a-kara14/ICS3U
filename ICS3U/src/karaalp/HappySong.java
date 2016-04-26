package karaalp;
/*HappySong.java
 * Made a program that sings the happy song
 * Adem Karaalp
 * April 26 2016
 */

public class HappySong {

	public static void main(String[] args) {
		
		String [] verses = new String [] {"clap your hands", "stomp your feet", "jump around", "run around", "sing a song", "put left hand up", "put your right hand up","put your left foot in", "put your right foot in", "slap your head"}; 
		
		for (int i=0; i!=10; i++)
		{
			System.out.println("If your happy and you know it " + verses[i]);
			System.out.println("If your happy and you know it " + verses[i]);
			System.out.println("If your happy and you know it and you really want to show it " + verses[i]);
			System.out.println("If your happy and you know it " + verses[i]);
			System.out.println(" ");
		}
	}

}

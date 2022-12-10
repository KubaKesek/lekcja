import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.VoiceStatus;

public class szkola {

	String nazwa;
List<user> lista = new ArrayList<user>();
	public szkola(String nazwa) {
		super();
		this.nazwa = nazwa;
	}
	
	public void pobierzusera(user user)
	{
		lista.add(user);
	}
	public void wyswietluser() {
		
		
		for(user u:lista)
		{
			System.out.println(u);
			
			
		}
	}
}

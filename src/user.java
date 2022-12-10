import java.lang.invoke.StringConcatFactory;
import java.util.InputMismatchException;

import javax.sound.midi.VoiceStatus;
import javax.sql.rowset.JoinRowSet;

public class user {

	String imie;
	String nazwisko;
	int wiek;
	public user(String imie, String nazwisko, int wiek) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	@Override
	public String toString() {
		return "user [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	public static void pokaz() {
	System.out.println("podaj imie nazwisko");	
		
	
	}
}

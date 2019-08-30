package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//Somando uma unidade de tempo
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);	//pega os minutos
		int mouth = 1 + cal.get(Calendar.MONTH); //pega o mes, acrescenta +1 o mes começa do zero
		System.out.println("Minutes: " + minutes);
		System.out.println("Mouth: " + mouth);
	}

}

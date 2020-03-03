package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


public class ProgramDatas {

	public static void main(String[] args) throws ParseException {
		
		//JAVA COMEÇA A CONTAR A DATA APARTIR DE 01/01/1970 (GMT)
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // SETA HORAS PADRÃO GMT
		Date x1 = new Date(); //MOSTRA HORA BRASIL PADRÃO DD MM HH:mm:ss
		Date x2 = new Date(System.currentTimeMillis()); //MOSTRA HORA BRASIL PADRÃO DD MM HH:mm:ss
		Date x3 = new Date(0L); //MOSTRA HORA PADRÃO 01/01/1970 00:00:00
		
		//ACRESCENTANDO 5 HORAS A HORA PADRÃO 01/01/1970
		//1 SEG = 1000 MILISEGUNDOS 
		//(1000L[1SEG] * 60L[1MINUTO] * 60L[1HORA] * 5L[QTD HORAS]) 
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("----HORÁRIO DO BRASIL SEM FORMATAÇÃO---------");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("----HORÁRIO DO BRASIL---------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("----HORARIO GMT +3HS RLAÇÃO AO BRASIL---------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
		
		// SOMANDO UNIDADES DE TEMPO EM UMA DATA
		System.out.println(">>>>>>>>>----------MANIPULAÇÃO DE DADTAS<<<<<<<<<<---------");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		System.out.println("Data Inicial: " + sdf.format(d));
		System.out.println("SOMA 4 DIAS NA DATA - cal.add(Calendar.HOUR_OF_DAY, 4)");
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		System.out.println("EXTRAI OS MINUTOS DA DATA - cal.get(Calendar.MINUTE)");
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		
		System.out.println("EXTRAI O MES DA DATA (MES NO JAVA COMEÇA EM 0, DAE SOMAMOS 1) - 1 + cal.get(Calendar.MONTH)");		
		int month = 1 + cal.get(Calendar.MONTH);		
		System.out.println("Month: " + month);
		
	}

}

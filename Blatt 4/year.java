import java.util.*;

public class year {
	
	public static boolean IsLeapYear(int year) {
		// true, wenn year ein Schaltjahr ist, sonst false.
		// durch 4 && nicht durch 100, aber Ausnahme bei durch 400
		return (((year %4 == 0) && (year %100 != 0)) || year %400 == 0);
	}
	public static int year (int days) {
		// Gibt die aktuelle Jahreszahl zurueck, wenn
		// seit dem 1.1.1980 inklusive "days" Tage vergangen sind.
		// D.h. 1 entspricht dem 1. Jaenner 1980,
		// 366 entspricht dem 31. Dezember 1980 (1980 war ein Schaltjahr),
		// 367 ist der 1. Jaenner 1981, ...
		// days ist immer > 0
		
		int year = 1980;
		
		while (days > 365) {
			if (IsLeapYear(year)) {
				if (days >= 366) {
					if (days == 366) {
						year -= 1;
					}
					days -= 366;
					year += 1;
				}
			} else {
				days -= 365;
				year += 1;
			}
		}
		return year;
	}
	
	public static void main(String[] args){
		System.out.println("365 Jahr 1980: " + year(365));
		System.out.println("366 Jahr 1980: " + year(366));
		System.out.println("367 Jahr 1981: " + year(367));
		System.out.println("730 Jahr 1981: " + year(730));
		System.out.println("731 Jahr 1981: " + year(731));
		System.out.println("732 Jahr 1982: " + year(732));
		System.out.println("733 Jahr 1982: " + year(733));
		System.out.println("734 Jahr 1982: " + year(734));
	}
}

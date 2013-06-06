public class Termination {

  public static boolean isLeapYear(int year) {
    // true, wenn year ein Schaltjahr ist, sonst false.
    return true;
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
      if (isLeapYear(year)) {
        if (days > 366) {
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
}

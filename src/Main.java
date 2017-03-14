import java.time.*;

/**
 * Created by forestnewark on 3/13/17.
 * Lets Learn some about Java Time Package
 */
public class Main {
    public static void main(String[] args) {
        /*
        *
        *The java.time classes covered here are:
        *
        *  "LocalDate" - Year/Month/Day
        *
        *  "LocalDateTime" - Year/Month/Day/Time
        *
        *  "MonthDay" - Month/Day
        *
        *  "Year" - Only Year
        *
        * "YearMonth" - Year/Month
        *
        */

        //Which Class you use will change depending on what your program needs to. "The right tool for the job"




        /*"LocalDate" - Year/Month/Day
        *
        * A Class that can hold and work with Year/Month/Day data
        *
        */

        System.out.println("--LocalDate class--");
        System.out.println();

        //Initialize with .now() method - Gets Current Year/Month/Date
        LocalDate currentDate = LocalDate.now();

        System.out.println("Printout of currentDate is : " + currentDate);

        //Create a new localDate object using the ".of" Method - .of(int year, int month, int dayOfMonth)"
        LocalDate oldDate = LocalDate.of(1989, Month.AUGUST,23);

        System.out.println("Printout of old LocalDate is : " + oldDate);

        //Compare dates using the ".isAfter()" method and the ".isBefore()" method.

        System.out.println("currentDate.isAfter(oldDate) ? : " + currentDate.isAfter(oldDate));
        System.out.println("currentDate.isBefore(oldDate) ? : " + currentDate.isBefore(oldDate));

        System.out.println("------");
        System.out.println();


        /*"LocalDateTime" - Year/Month/Day/Time
        *
        * A class that hold and work with Year/Month/Day/ and time data
        */

        System.out.println("--LocalDateTime class--");
        System.out.println();

        //Initialize with .now() method - Gets Current Year/Month/Date/Time
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Printout of currentDateTime is : " + currentDateTime);

        //Create a new localDateTime object using the ".of" Method "of(int year, int month, int dayOfMonth,int hour, int minute)"
        LocalDateTime oldDateTime = LocalDateTime.of(1989,Month.AUGUST,23,4,30);

        System.out.println("Printout of oldDateTime : " + oldDateTime);

        //Compare dates using the ".isAfter()" method and the ".isBefore()" method.
        System.out.println("currentDateTime.isAfter(oldDate) ? : " + currentDateTime.isAfter(oldDateTime));
        System.out.println("currentDateTime.isBefore(oldDate) ? : " + currentDateTime.isBefore(oldDateTime));

        System.out.println("------");
        System.out.println();

        /*"MonthDay" - Month/Day
        *
        * A Class that can hold and work with Month/Day data
        *
        */

        System.out.println("--MonthDay class--");
        System.out.println();

        //Initialize with .now() method - Gets Current Year/Month/Date
        MonthDay currentMonthDay = MonthDay.now();

        System.out.println("Printout of currentMonthDay is : " + currentMonthDay);

        //Create a new localDateTime object using the ".of" Method "of(int month, int dayOfMonth)"
        MonthDay oldMonthDay = MonthDay.of(Month.AUGUST,23);

        System.out.println("Printout of oldMonthDay is : " + oldMonthDay);

        //Compare dates using the ".isAfter()" method and the ".isBefore()" method.

        System.out.println("currentMonthDay.isAfter(oldMonthDay) ? : " + currentMonthDay.isAfter(oldMonthDay));
        System.out.println("currentMonthDay.isBefore(oldMonthDay) ? : " + currentMonthDay.isBefore(oldMonthDay));

        System.out.println("------");
        System.out.println();



        /*"YearMonth" - Year/Month
        *
        * A Class that can hold and work with Year/Month data
        *
        */
        System.out.println("--YearMonth class--");
        System.out.println();

        //Initialize with .now() method - Gets Current Year/Month/Date
        YearMonth currentYearMonth = YearMonth.now();

        System.out.println("Printout of currentYearMonth is : " + currentYearMonth);

        //Create a new localDateTime object using the ".of" Method "of(int year, int Month)"
        YearMonth oldYearMonth = YearMonth.of(1989,Month.AUGUST);

        System.out.println("Printout of oldYearMonth is : " + oldYearMonth);

        //Compare dates using the ".isAfter()" method and the ".isBefore()" method.

        System.out.println("currentYearMonth.isAfter(oldYearMonth) ? : " + currentYearMonth.isAfter(oldYearMonth));
        System.out.println("currentYearMonth.isBefore(oldYearMonth) ? : " + currentYearMonth.isBefore(oldYearMonth));

        System.out.println("------");
        System.out.println();


         /*"Year" - Year only!
        *
        * A Class that can hold and work with year data
        *
        */
        System.out.println("--Year class--");
        System.out.println();

        //Initialize with .now() method - Gets Current Year/Month/Date
        Year currentYear = Year.now();

        System.out.println("Printout of currentYear is : " + currentYear);

        //Create a new localDateTime object using the ".of" Method "of(int year)"
        Year oldYear = Year.of(1989);

        System.out.println("Printout of oldYear is : " + oldYear);

        //Compare dates using the ".isAfter()" method and the ".isBefore()" method.

        System.out.println("currentYear.isAfter(oldYear) ? : " + currentYear.isAfter(oldYear));
        System.out.println("currentYear.isBefore(oldYear) ? : " + currentYear.isBefore(oldYear));

    }
}

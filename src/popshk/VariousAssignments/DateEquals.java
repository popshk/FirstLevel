package popshk.VariousAssignments;

import java.time.LocalDate;

public class DateEquals {
    public static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2017,6,26);
        System.out.println(d1);
        System.out.println(d2);

        if (d1.getYear()!=d2.getYear()) System.out.print("NOW YEAR : "+ d1.getYear()+" YOUR VALUE : "+ d2.getYear()+"/");
        if (d1.getMonthValue()!=d2.getMonthValue()) System.out.print(" NOW MONTH : "+ d1.getMonthValue()+" YOUR VALUE : "+ d2.getMonthValue() +"/");
        if (d1.getDayOfMonth()!=d2.getDayOfMonth()) System.out.print(" NOW DAY : "+ d1.getDayOfMonth()+" YOUR VALUE  : "+ d2.getDayOfMonth() );
    }
}

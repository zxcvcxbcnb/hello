import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] arr =appointmentDateDescription.split(" ",2);
        String[] arr_a=arr[0].split("/",3);
        String[] arr_b=arr[1].split(":",3);
        return LocalDateTime.of(
            Integer.parseInt(arr_a[2]),
            Integer.parseInt(arr_a[0]),
            Integer.parseInt(arr_a[1]),
            Integer.parseInt(arr_b[0]),
            Integer.parseInt(arr_b[1]),
            Integer.parseInt(arr_b[2])
        );
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
        
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int year = appointmentDate.getYear();
        int month = appointmentDate.getMonthValue();
        int day = appointmentDate.getDayOfMonth();
        LocalDateTime qian = LocalDateTime.of(year,month,day,12,0,0);
        LocalDateTime hou = LocalDateTime.of(year,month,day,18,0,0);
        if(((appointmentDate.isBefore(hou)) && (appointmentDate.isAfter(qian))) || (appointmentDate.isEqual(qian))){
            return true;
        }else{
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        LocalDate localDate = appointmentDate.toLocalDate();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        Month month = appointmentDate.getMonth();
        int hour = appointmentDate.getHour();
        int day = appointmentDate.getDayOfMonth();
        int year = appointmentDate.getYear();
        int minute = appointmentDate.getMinute();
        //上下午
        String wu = null;
        int time = 0;
        if(hour>12){
            time = hour-12;
            wu = "PM";
        }else{
            time = hour;
            wu = "AM";
        }
        return "You have an appointment on "
        + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH)
        + ", "
        + month.getDisplayName(TextStyle.FULL, Locale.ENGLISH)
        + " "
        + day + ", "
        + year + ", at "
        + time + ":"
        + String.format("%02d", minute)
        + " "
        + wu + ".";
    }

    public LocalDate getAnniversaryDate() {
        int currentYear = LocalDate.now().getYear();
    return LocalDate.of(currentYear, 9, 15);
    }
}

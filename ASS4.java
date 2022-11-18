import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Pro4 {
   public static void main(String[] args) throws Exception {
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
      System.out.println("Today's date = "+simpleformat.format(cal.getTime()));
      
      Format f = new SimpleDateFormat("HH.mm.ss");
      String strResult = f.format(new Date());
      System.out.println("Time = "+strResult);
     
      f = new SimpleDateFormat("H");
      String strHour = f.format(new Date());
      System.out.println("Current Hour = "+strHour);
     
      f = new SimpleDateFormat("mm");
      String strMinute = f.format(new Date());
      System.out.println("Current Minutes = "+strMinute);

      f = new SimpleDateFormat("ss");
      String strSeconds = f.format(new Date());
      System.out.println("Current Seconds = "+strSeconds);
   }
}

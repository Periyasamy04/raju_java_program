package regexTask;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateReplacement {
    String replaceDates(String text){
        String dateregex="(\\d{2})/(\\d{2})/(\\d{4})";
        Pattern pattern= Pattern.compile(dateregex);
        Matcher matcher=pattern.matcher(text);

        return matcher.replaceAll("$3-$2-$1");
    }

    public static void main(String[] args) {
        DateReplacement dateReplacement= new DateReplacement();
        System.out.println(dateReplacement.replaceDates("The event is scheduled for 12/09/2024 and another one for 25/12/2024."));
    }
}

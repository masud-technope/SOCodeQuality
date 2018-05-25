import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Days;

Date past = new Date(110, 5, 20); // June 20th, 2010
Date today = new Date(110, 6, 24); // July 24th 
int days = Days.daysBetween(new DateTime(past), new DateTime(today)).getDays(); // => 34
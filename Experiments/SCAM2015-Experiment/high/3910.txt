public class PrayerTime extends AsyncTask<String, String, String>  {

OnPrayerTimeTaskFinished listener;

    public interface OnPrayerTimeTaskFinished{
        public void onPlayerTimeTaskFinished(String myString);
    }

    public void setOnPrayerTimeTaskFinishedListener(OnPrayerTimeTaskFinished callback){
        listener = callback
    }

    protected void onPostExecute(String s){
        listener.onPlayerTimeTaskFinished(s);
    }
}
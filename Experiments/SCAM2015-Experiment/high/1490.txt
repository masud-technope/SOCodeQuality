public String alarmClock(int day, boolean vacation) {
            if (day >=1 && day <=5) {
                return vacation ? "10:00" : "7:00";
            } else {
                return vacation ? "off" : "10:00";
            }  
        }
Date whateverDateYouWant = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(whateverDateYouWant);

int unroundedMinutes = calendar.get(Calendar.MINUTE);
int mod = unroundedMinutes % 15;
calendar.add(Calendar.MINUTE, mod < 8 ? -mod : (15-mod));
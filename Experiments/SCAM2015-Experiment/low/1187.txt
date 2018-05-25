public boolean trueDate(String date){
  String nums = "0123456789";
  String[] temp;
  temp = date.split("/");
  String year = temp[0];
  String month = temp[1];
  String day = temp[2];

  bool isValid = true;
  for(int i = 0; i < year.length(); i++)
  {
    if(nums.indexOf(year.charAt(i)) == -1)
    {
      isValid = false;
    }
  }

  for(int i = 0; i < month.length(); i++)
  {
    if(nums.indexOf(month.charAt(i)) == -1)
    {
      isValid = false;
    }
  }

  for(int i = 0; i < day.length(); i++)
  {
    if(nums.indexOf(day.charAt(i)) == -1)
    {
      isValid = false;
    }
  }

  return isValid;
}
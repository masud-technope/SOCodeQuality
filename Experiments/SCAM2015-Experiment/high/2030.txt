for (int i = 0; i < grades.length; i++) {      //loop through all the grades
   if(grade[i] < 60) {                         //if the grade is over 60
       sum = sum + grades[i];                  //add the grade to the sum
       count++                                 //remember how many grades so we can get average
   }
}
public float getPercentFailing(float[] grades) {
    int count=0;
    float sum= 0;
    for (int i = 0; i < grades.length; i++) {
          if(grade[i] < 60) {
             sum = sum + grades[i];
             count++
          }
    }
    return sum/count;

}
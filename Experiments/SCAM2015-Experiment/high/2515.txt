public class A {
 private B myB = new B();
 private String myUnformattedName = "some information";
 private String myUnformattedNameOne = "some information";
 private String myUnformattedNameTwo = "some information";
 private String myUnformattedNameThree = "some information";
 private String myUnformattedNameFour = "some information";
 private String myUnformattedNameFive = "some information";
 private String myUnformattedNameSix = "some information";

 public String getFormattedInfo() {
   //pass the object itself and use get methods
   return myB.formatInfo(this); 
 }

 public String getFormattedInfoLong() {
   //this is OK but gets difficult to read the longer the 
   //parameter list gets
   return myB.formatInfo(myUnformattedName, myUnformattedNameOne, 
      myUnformattedTwo, myUnformattedNameThree, myUnformattedNameFour,
      myUnformattedNameFive, myUnformattedNameSix); 
 }

 //getters
 public String getUnformattedName() {
    return myUnformattedName;
 }

 public String getUnformattedNameOne() {
    return myUnformattedNameOne;
 }

 //etc

}
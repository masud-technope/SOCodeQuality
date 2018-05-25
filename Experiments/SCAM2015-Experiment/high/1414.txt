public AbstractStringBuilder append(String str) {
    if (str == null) str = "null"; //will literally append "null" in case of null
    int len = str.length(); //get the string length
    if (len == 0) return this; //if it's zero, I'm done
    int newCount = count + len; //tentative new length
    if (newCount > value.length) //would the new length fit?
        expandCapacity(newCount); //oops, no, resize my array
    str.getChars(0, len, value, count); //now it will fit, copy the chars 
    count = newCount; //update the count
    return this; //return a reference to myself to allow chaining
}
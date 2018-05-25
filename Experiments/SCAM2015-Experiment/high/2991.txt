String describePerson(String name, boolean gender, int age) {
    String yearString = (age == 1 ?  "year" : "years");

    if (gender) return (name + " is female. She is " + age + year + " old.");
    else return (name + " is male. He is " + age + year + " old.");
}
List<Person> sortedByAgePersons = new ArrayList<Person>(persons);
Collections.sort(sortedByAgePersons, new Comparator<Person>() {
        public int compare(Person p1, Person p2) {
           return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());
        }
});
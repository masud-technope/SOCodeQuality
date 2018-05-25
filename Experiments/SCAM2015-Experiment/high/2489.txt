public void sortByLastName(){
    Collections.sort(list, new Comparator<Person>() {
        public int compare(Person lhs, Person rhs){
            return lhs.lastName.compareTo(rhs.lastName);
        }
    } );
}
List<Person> persons = new ArrayList<Person>();

while (resultSet.next()) {
    Person person = new Person();
    person.setId(resultSet.getLong("id"));
    person.setFirstName(resultSet.getString("fistName"));
    person.setLastName(resultSet.getString("lastName"));
    person.setDataOfBirth(resultSet.getDate("dateOfBirth"));
    persons.add(person);
}

// Close resultSet/statement/connection in finally block.

return persons;
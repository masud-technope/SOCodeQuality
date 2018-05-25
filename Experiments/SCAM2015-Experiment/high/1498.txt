Iterable<String> collectionOfNames = ...; // Some method call
String lastNameInCollection;
for (String name : collectionOfNames)
{
    lastNameInCollection = name;
}
System.out.println("The last name was: " + lastNameInCollection);
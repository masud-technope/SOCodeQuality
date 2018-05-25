class MyClass{ 
List<Integer> fields = new ArrayList<Integer>();
//two constructors
MyClass(int singleVal)
{
fields.add(singleVal);
}


MyClass(MyClass a, MyClass b)
{
fields.addAll(a.fields);
fields.addAll(b.fields);
}
//getters setters depends what you need


}
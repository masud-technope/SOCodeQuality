MyClass obj = new MyClass() {{
  // in Java these would be more like this: setFieldX(value);
  field1 = "hello";
  field2 = "world";
  field3 = new MyOtherClass() ...
}};
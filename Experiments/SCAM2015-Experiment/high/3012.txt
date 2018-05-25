public class MyTestClass
{
    @Tested MyClass myClass;
    @Mocked CustomObject object1;
    @Mocked CustomObject object2;

    @Test
    public void test_MyClass_methodA_enters_if_condition() {
        new NonStrictExpectations() {{
            Something thing = new Something();
            object1.getSomething(); result = thing;
            object2.getSomething(); result = thing;
        }};

        assertEquals("Result", myClass.methodA(object1, object2));
    }

    @Test
    public void test_MyClass_methodA_skips_if_condition() {
        new NonStrictExpectations() {{
            object1.getSomething(); result = new Something();
            object2.getSomething(); result = new Something();
        }};

        assertEquals("Different Result", myClass.methodA(object1, object2));
    }
}
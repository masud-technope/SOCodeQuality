public class MyClassTest
{
    @Tested MyClass myClass;

    @Test
    public void test_MyClass_methodA_enters_if_condition() {
        final CustomObject object1 = new CustomObject("input1");
        final CustomObject object2 = new CustomObject("input2");

        new NonStrictExpectations(myClass) {{
            invoke(myClass, "methodB", object1, object2); result = true;
        }};

        assertEquals("Result", myClass.methodA(object1, object2));
    }

    @Test
    public void test_MyClass_methodA_skips_if_condition() {
        final CustomObject object1 = new CustomObject("input1");
        final CustomObject object2 = new CustomObject("input2");

        new NonStrictExpectations(myClass) {{
            invoke(myClass, "methodB", object1, object2); result = false;
        }};

        assertEquals("Different Result", myClass.methodA(object1, object2));
    }
}
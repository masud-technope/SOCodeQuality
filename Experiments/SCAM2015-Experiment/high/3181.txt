Integer x = 5;
Integer y = 5;
if (x == y) // == compares the *reference (pointer) value* not the contained int value 
{
    System.out.println("They point to the same object");
}

x = 500;
y = 500;
if (x != y)
{
    System.out.println("They don't point to the same object");
    if (x.equals(y)) // Compares the contained int value
    {
        System.out.println("But they have the same value!");
    }
}
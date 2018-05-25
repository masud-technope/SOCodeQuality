private enum Fruit {
    apple, carrot, mango, orange;
}

String value; // assume input
Fruit fruit = Fruit.valueOf(value); // surround with try/catch

switch(fruit) {
    case apple:
        method1;
        break;
    case carrot:
        method2;
        break;
    // etc...
}
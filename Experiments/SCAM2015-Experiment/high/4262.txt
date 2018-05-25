int lhs = int.MaxValue - 10;
int rhs = int.MinValue + 10;

// Since lhs > rhs, we expect (lhs-rhs) to be +ve, but:

Console.WriteLine(lhs - rhs); // Prints -21: WRONG!
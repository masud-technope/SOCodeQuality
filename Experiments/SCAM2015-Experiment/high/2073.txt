boolean isYearWithinRange(int modelYear, int start, int end)
{
    return modelYear>=start && modelYear<=end;
}

if(isYearWithinRange(modelYear, 1995, 1998) || isYearWithinRange(modelYear, 2004, 2006))
{
    System.out.println("Recall");
}
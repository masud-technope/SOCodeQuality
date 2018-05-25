if (userNumber >= 100 && userNumber <= 999)
{
System.out.println("User number is: " + userNumber);
int unitdigit = userNumber%10;
userNumber = userNumber/10;
int tenthdigit = userNumber%10;
int lastdigit = userNumber/10;
reversedNum = (unitdigit*100) + (tenthdigit*10) + lastdigit;
System.out.println("reversed numnber "+reversedNum);
}
int i=0;
boolean found10,found20;
found10=false;
found20=false;
while(i<a.size&&(!found20))
{
    if(a.get(i)==10)
        found10 = true;
    if(found10)
        System.out.println(a.get(i));
    if(a.get(i)==20)
        found20 = true;
    i++;
}
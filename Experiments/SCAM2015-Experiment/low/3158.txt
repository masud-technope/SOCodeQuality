public static int numGen(int Array[])
{

    int random = (int)(1+Math.random()*6);

    for(int loop = 0; loop <Array.length ; loop++)
    {
        if(Array[loop] == random)
        {
            return numGen(Array);
        } 
    }


    return random;
}
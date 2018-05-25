int [] deviceID= new int[14];//total element 14 (index 0 to 13)
int j=0;//counter which provides index during loop
for(int i = 292; i <= 305; i++)
{
   if(j<deviceID.length)//chech whether j<14 as we want to add upto index 13   
   deviceID[j++]=i;//store i to the array at index j 
   //increments j to provide next index
}
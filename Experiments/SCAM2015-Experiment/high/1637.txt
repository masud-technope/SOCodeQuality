if (distance > (r1 + r2)) 
{
    // No overlap
    System.out.println("Circle2 does not overlap Circle1");
}
else if ((distance <= Math.abs(r1 - r2)) 
{
    // Inside
    System.out.println("Circle2 is inside Circle1");
}
else              // if (distance <= r1 + r2)
{
   // Overlap
   System.out.println("Circle2 overlaps Circle1");
}
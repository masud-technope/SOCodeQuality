lastFrame = System.currentTimeMillis();

while(true) 
{
   repaint();

   long msSleep = 16 - (System.currentTimeMillis() - lastFrame);
   lastFrame = System.currentTimeMillis();

   if(nsToSleep > 0)
   {
      Thread.sleep(msSleep);
   }
   else
   {
      Thread.yield();  // Only necessary if you want to guarantee that
                       // the thread yields the CPU between every frame
   }
}
char array [] = {'a','b','c','d','e','f'};
SyncCharArray sca = new SyncCharArray(array);

 // then pass sca to any threads that require swapping
 // then within a thread

sca.swap(15,3);
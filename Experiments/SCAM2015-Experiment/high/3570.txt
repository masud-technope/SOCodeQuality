boolean exists = false;
int j = 0;
while (!exists && j < I) { //we now also stop if we have already found a match
    exists = letters == newAlphabet[i]; 
    //as we are stopping at the first match, 
    //we no longer need to allow for previous matches
}
if (!exists) newAlphabet[I] = letters;
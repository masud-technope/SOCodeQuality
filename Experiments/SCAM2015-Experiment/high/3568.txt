boolean exists = false; //indicates whether we have found a match
for (int j = 0; j < 26; j++) { //for each letter in the new alphabet
    //true if this one, or a previous one is a match
    exists = exists || letters == newAlphabet[i]; 
}
//if we don't have a match, add the new letter
if (!exists) newAlphabet[I] = letters;
Initial values:
    werte = {1,2,3,4,7,5}
    werte1 = {0,0,0,0,0,0}

for i = 0:
    for j from 5 to 1:
        werte1[j] = werte[0]

intermediate result: werte1 = {0,1,1,1,1,1}

for i = 1:
    for j fom 5 to 2:
        werte1[j] = werte[1]

intermediate result: werte1 = {0,1,2,2,2,2}

for i = 2:
    for j from 5 to 3:
        werte1[j] = werte[2]

intermediate result: werte1 = {0,1,2,3,3,3}

for i = 3:
    for j from 5 to 4:
        werte1[j] = werte[3]

intermediate result: werte1 = {0,1,2,3,4,4}

for i = 4:
    for j from 5 to 5:
        werte1[j] = werte[4]

final result: werte1 = {0,1,2,3,4,7}

for i = 5 it will do nothing, since j starts at 5.
boolean n1 = (ans1 & (1<<31))!=0;
 boolean n2 = (ans2 & (1<<31))!=0;
 ans1 = Math.abs(ans1);
 ans2 = Math.abs(ans2);

 int c=0;
 while(ans1 >= ans2){
     ans1 -= ans2;
     c++;
 }
 if(!n1 && n2) c = -c;
 else if(n1 && !n2){
     c = -c;
     if(ans1 > 0){
         ans1 = ans2 - ans1;
         c--;
     }
 }else if(n1 && n2){
     if(ans1 > 0){
         ans1 = ans2 - ans1;
         c++;
     }
 }
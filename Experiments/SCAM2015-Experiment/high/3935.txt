boolean persist = true;

if (a>b){
  em.setAlpha();
}else{
  persist = false;
}

if (c>d){
  em.setBeta();
}else{
  persist = false;
}

if (e>f){
  em.setOmega();
}else{
  persist = false;
}

if (persist) {
  database.persist(em);
}
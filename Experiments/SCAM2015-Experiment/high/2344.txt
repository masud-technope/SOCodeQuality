List<MyBean> deleteCandidates = new ArrayList<>();
 List<MyBean> myBeans = getThemFromSomewhere();

 // Pass 1 - collect delete candidates
 for (MyBean myBean : myBeans) {
    if (shallBeDeleted(myBean)) {
       deleteCandidates.add(myBean);
    }
 }

 // Pass 2 - delete
 for (MyBean deleteCandidate : deleteCandidates) {
    myBeans.remove(deleteCandidate);
 }
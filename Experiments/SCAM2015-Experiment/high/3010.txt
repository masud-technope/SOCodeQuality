Iterator<Clientuser> iterator = EIQserver.OnlineusersList.iterator();
while (iterator.hasNext()) {
    Clientuser next = iterator.next();
    if(next.ID.equals(thsisUser.ID)) {
        Omsg.setBody("@@!&$$$$@@@####$$$$"); 
        sendMessage(Omsg); 
        iterator.remove();// remove the partner
    }
}
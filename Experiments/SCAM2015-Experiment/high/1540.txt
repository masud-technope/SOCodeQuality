// check if personal number already exist
for (int i=0; i<customerList.size();i++) {
    if(customerList.get(i).getCustomerPersonalNumber().equals(inPersonalNumber)){
        return true;
    }
    else {
        return false;
    }
}
return false;
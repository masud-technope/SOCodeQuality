//Create a new list to store our "simplified" results into
ArrayList<Trade> newTradeList = new ArrayList<Trade>(tradeList.size());

//For each trade in the old list, call it "trade" and...
for(Trade trade : tradeList){

    //First we ask, is there already a trade in this list with the same source?
    //indexOf finds where in the array the element lives. I store that result in index
    int index = newTradeList.indexOf(trade);

    //If the element isn't in our list yet, indexOf will return -1.
    //If the result is NOT -1, then we have already seen a trade with this source before
    if(index != -1) {
         //In that case, get that element. We know what index it lives at so grab it.
         Trade t = newTradeList.get(index);
         //Then, do whatever operations to combine the two trades. I assumed you add the quantities. 
         //So the trade in our new list's quantity should be what it was, plus the new trade's quantity
         t.setQuantity(t.getQuantity() + trade.getQuantity());
    } 

    //But if we have never seen this source before, let's add it to our our new list
    else {
         newTradeList.add(trade);
    }
}
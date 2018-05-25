int foundAtIndex = -1;
for(int i = 0; i < bookObj.length; i++) {
    if(bookObj[i].getName().equals(input)) {
        foundAtIndex = i;  // store the actual index for later use
        break;             // no need to search further
    }
}
if(foundAtIndex >= 0)
    System.out.println("Book Found!");
else
    System.out.println("Book not Found!");
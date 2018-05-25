String word="i love apples i love orange";
String w=scan.next();
String[] words = word.split(" ");
int count = 0;
for (int i=0; i< words.length; i++){
    if (words[i].equals(w)){
        System.out.println(i);
        count ++;
    }
}
System.out.println("Count = "+count);
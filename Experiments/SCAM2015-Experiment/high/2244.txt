String word="i love apples i love orange";
String w=scan.next();
String[] words = word.split(" ");
for (int i=0; i< words.length; i++){
    if (words[i].equals(w)){
        System.out.println(i);
    }
}
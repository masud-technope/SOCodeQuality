public static String[] words = {"cat","dog","banana"};
public static int[] value = {3,4,5};
public static void main(String[] args){
    if(valOf("Cat") > valOf("Dog")){
        System.out.print("Cat is greater than Dog");
    }
    else{
        System.out.print("Cat is not greater than Dog");
    }
}
public static int valOf(String str){
    for(int x=0;x<words.length;x++){
        if(str.equalsIgnoreCase(words[x])){
            return value[x];
        }
    }
    return -1;
}
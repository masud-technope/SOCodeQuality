public class Shuffle {
    public static void main(String[] args) {
        Shuffle s = new Shuffle();
        s.shuffle("hello");

    }
    public void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
}
/*
Sample outputs
hlleo
llheo
leohl
lleho
*/
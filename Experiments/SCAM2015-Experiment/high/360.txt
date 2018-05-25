interface IGrammar { 

    public void foo();
    public Grammar doCopy();

}

class GrammarA implements IGrammar { 

    public Grammar doCopy(Grammar g) { 

        return new GrammarA(g);

    }

}
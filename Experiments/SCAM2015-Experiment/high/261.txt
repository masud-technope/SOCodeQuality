public static Verbosity findByAbbr(String abbr){
    for(Verbosity v : values()){
        if( v.abbr().equals(abbr)){
            return v;
        }
    }
    return null;
}
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface StringReplacer { 
    public CharSequence getReplacement( Matcher matcher );
}

class Replacementifier { 

    static Comparator keyComparator = new Comparator() { 
         public int compare( Object o1, Object o2 ) {
             String s1   = (String)o1;
             String s2   = (String)o2;
             int    diff = s1.length() - s2.length();
             return diff != 0 ? diff : s1.compareTo( s2 );
         }
    };
    Map replaceMap = null;

    public Replacementifier( Map aMap ) { 
        if ( aMap != null ) { 
            setReplacements( aMap ); 
        }
    }

    public setReplacements( Map aMap ) { 
        replaceMap = aMap;
    }

    private static String createKeyExpression( Map m ) { 
        Set          set = new TreeSet( keyComparator );
        set.addAll( m.keySet());
        Iterator     sit = set.iterator();
        StringBuffer sb  = new StringBuffer( "(" + sit.next());

        while ( sit.hasNext()) { 
            sb.append( "|" ).append( sit.next());
        }
        sb.append( ")" );
        return sb.toString();
    }

    public String replace( Pattern pattern, CharSequence input, StringReplacer replaceFilter ) {
        StringBuffer output  = new StringBuffer();
        Matcher      matcher = pattern.matcher( inputString );
        int          lastEnd = 0;
        while ( matcher.find()) {
            int mstart = matcher.start();
            if ( lastEnd < mstart ) { 
                output.append( inputString.substring( lastEnd, mstart ));
            }
            CharSequence cs = replaceFilter.getReplacement( matcher );
            if ( cs != null ) { 
                output.append( cs );
            }
            lastEnd = matcher.end();
        }
        if ( lastEnd < inputString.length() ) { 
            sbuff.append( inputString.substring( lastEnd ));
        }
    }

    public String replace( Map rMap, CharSequence input ) {
        // pre-condition
        if ( rMap == null && replaceMap == null ) return input;

        Map     repMap = rMap != null ? rMap : replaceMap;
        Pattern pattern  
            = Pattern.compile( createKeyExpression( repMap ))
            ;
        StringReplacer replacer = new StringReplacer() { 
            public CharSequence getReplacement( Matcher matcher ) {
                String key   = matcher.group( 1 );
                return (String)repMap.get( key );
            }
        };
        return replace( pattern, input, replacer ); 
    }
}
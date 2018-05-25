import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
R1  => R2
R2  => R3
R3  => R1
R12 => R21
R21 => R12
*/

String inputString 
    = "mv A, R3\n"
    + "mv R2, B\n"
    + "mv R1, R3\n"
    + "mv B, R4\n"
    + "add A, R1\n"
    + "add B, R1\n"
    + "add R1, R2\n"
    + "add R3, R3\n"
    + "add R21, X\n"
    + "add R12, Y\n"
    + "mv X, R2"
    ;

System.out.println( "inputString = \"" + inputString + "\"" );

HashMap h = new HashMap();
h.put( "R1",  "R2" );
h.put( "R2",  "R3" );
h.put( "R3",  "R1" );
h.put( "R12", "R21" );
h.put( "R21", "R12" );

Pattern      p       = Pattern.compile( "\\b(R(?:12?|21?|3))\\b");
Matcher      m       = p.matcher( inputString );
StringBuffer sbuff   = new StringBuffer();
int          lastEnd = 0;
while ( m.find()) {
    int mstart = m.start();
    if ( lastEnd < mstart ) { 
        sbuff.append( inputString.substring( lastEnd, mstart ));
    }
    String key   = m.group( 1 );
    String value = (String)h.get( key );
    sbuff.append( value );
    lastEnd = m.end();
}
if ( lastEnd < inputString.length() ) { 
    sbuff.append( inputString.substring( lastEnd ));
}

System.out.println( "sbuff = \"" + sbuff + "\"" );
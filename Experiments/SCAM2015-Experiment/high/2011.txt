import java.util.regex.*;
public class TEST {
    public static void main(String[] args) {
        Pattern re = Pattern.compile(
            "  # Match URI having command=shutdown query variable value. \n" +
            "  ^                          # Anchor to start of string.   \n" +
            "  (?:[^:/?\\#\\s]+:)?        # URI scheme (Optional).       \n" +
            "  (?://[^/?\\#\\s]*)?        # URI authority (Optional).    \n" +
            "  [^?\\#\\s]*                # URI path.                    \n" +
            "  \\?                        # Literal start of URI query.  \n" +
            "    # Match var=value pairs preceding 'command=xxx'.        \n" +
            "  (?:                        # Zero or more 'var=values'    \n" +
            "    (?!command=)             # only if not-'command=xxx'.   \n" +
            "    [^&\\#\\s]*              # Next var=value.              \n" +
            "    &                        # var=value separator.         \n" +
            "  )*                         # Zero or more 'var=values'    \n" +
            "  command=shutdown           # variable and value to match. \n" +
            "    # Match var=value pairs following 'command=shutdown'.   \n" +
            "  (?:                        # Zero or more 'var=values'    \n" +
            "    &                        # var=value separator.         \n" +
            "    (?!command=)             # only if not-'command=xxx'.   \n" +
            "    [^&\\#\\s]*              # Next var=value.              \n" +
            "  )*                         # Zero or more 'var=values'    \n" +
            "  (?:\\#\\S*)?               # URI fragment (Optional).     \n" +
            "  $                          # Anchor to end of string.", 
            Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE | Pattern.COMMENTS);
        String s = "/exec?version=0.4&command=shutdown&out=JSON&zcommand=1";
            // Should match
//      String s = "/exec?version=0.4&command=startup&out=JSON&zcommand=1&commando=shutdown";
            // Should fail to match 
//      String s = "/exec?command=shutdown&out=JSON";
            // Should match
//      String s = "/exec?version=0.4&command=admin&out=JSON&zcommand=1&command=shutdown";
        // Should fail to match";
        Matcher m = re.matcher(s);
        if (m.find()) {
            // Successful match
            System.out.print("Match found.\n");
        } else {
            // Match attempt failed
            System.out.print("No match found.\n");
        } 
    }
}
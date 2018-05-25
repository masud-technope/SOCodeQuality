//            | one or more non-digits
//            |   | followed by one or more digits
//            |   |   | followed by one or more non-digits
//            |   |   |    | or the end of the input      
//            |   |   |    |     | replace with single white space
s.replaceAll("\\D+\\d+(\\D+|$)", " ");
function (
    needle, // x
    haystack // s
) {
    j = 0
    for (i = 0; i < haystack.length && j < needle.length; i++) {
         if (haystack[i] == needle[j]) {
             j++
         }
    }

    return j == needle.length
}
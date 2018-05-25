Alpha newA1 = new Alpha(1.0, "a", null);
// oldAlpha == null so we only newA1.y = "a"
Alpha newA2 = new Alpha(2.0, "b", newA1);
// oldAlpha is newA1 => newA1.y = "b"+"a"; newA2.y = "b"
Alpha newA3 = new Alpha(3.0, "c", newA2);
// oldAlpha is newA2 => newA2.y = "c"+"b", newA3.y = "c"; newA1.y = "ba" (still)
System.out.println(newA1.y + newA2.y + newA3.y);
// newA1.y = "ba", newA2.y = "cb", newA3.y = "c"
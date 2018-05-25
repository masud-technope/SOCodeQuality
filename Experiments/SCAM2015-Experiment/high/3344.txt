String entryLower = entry.toLowerCase();
String entryNoSpace = entryLower.replace(" ", "");
String entryFinal = entryNoSpace.replace(",", "");

//Convert String to StringBuilder to use reverse method
StringBuilder sbEntry = new StringBuilder(entryFinal);
StringBuilder sbEntryReverse = sbEntry.reverse();
boolean isPalindrome = entryFinal.equals( sbEntryReverse.toString() );
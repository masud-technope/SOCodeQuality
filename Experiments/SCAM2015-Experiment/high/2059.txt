Pattern p = Pattern.compile(
    "ns1:(tearline|.*spare)", Pattern.CASE_INSENSITIVE
);
Matcher m = p.matcher("");

String[] inputs = {
    "[[#text: ns1:Spare3]]",
    "[[#text: ns1:Spare4]]",
    "[[#text: ns1:Spare5]]",
    "[[#text: ns1:Street]]",
    "[[#text: ns1:Anything]]",
    "[[#text: ns1:TearLineDateUpdated]]",
    "[[#text: ns1:SourceReportTearline]]",
    "[[#text: ns1:AnyFilter]]",
    "[[#text: ns1:UpdatedByTelecom]]",
    "[[#text: ns1:UpdatedByName]]"
};

for (String s : inputs)
{
  System.out.printf( "%n%5b => %s%n", !m.reset(s).find(), s );
}
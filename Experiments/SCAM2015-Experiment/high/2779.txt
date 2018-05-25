if (fsTitle != null)
{
    sp.setFireStudyTitle("Available");
    String sppAcronym = results.getString("ACRONYM");

    FireStudyQueryBuilder qb = new FireStudyQueryBuilder();

    this.magicString = qb.buildMagicString(sppAcronym); //Passes the sppAcronym object to the buildMagicString() method.
}
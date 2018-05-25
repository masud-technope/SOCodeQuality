public void setTitle(final String title)
{
  if (title.matches("^Mrs|Mr|Miss|Ms$"))
  {
    this.title = title;
  }
  else
  {
    this.title = "Not Set";
    System.err.format("%s is not a valid title, expecting Mrs,Mr,Miss,Ms\n", title);
  }
}
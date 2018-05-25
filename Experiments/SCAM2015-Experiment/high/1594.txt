public class DecoratedWriter extends Writer
{
   private final Writer delegate;

   private final StringWriter archive = new StringWriter();

   //pass in the original PrintWriter here
   public DecoratedWriter( Writer delegate )
   {
      this.delegate = delegate;
   }

   public String getForArchive()
   { 
      return this.archive.toString();
   } 

   public void write( char[] cbuf, int off, int len ) throws IOException
   {
      this.delegate.write( cbuf, off, len );
      this.archive.write( cbuf, off, len );
   }

   public void flush() throws IOException
   {
      this.delegate.flush();
      this.archive.flush();

   } 

   public void close() throws IOException
   {
      this.delegate.close();
      this.archive.close();
   }
}
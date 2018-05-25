package path.to;

import java.util.ArrayList;
import java.util.List;

public class ESAPIDefaultEncoderImpl extends org.owasp.esapi.reference.DefaultEncoder
{
private static List<String> codecs;
private static ESAPIDefaultEncoderImpl singletonInstance ;

static
{
    codecs = new ArrayList<String>();
    codecs.add("HTMLEntityCodec ");
    codecs.add("JavaScriptCodec");
    singletonInstance = new ESAPIDefaultEncoderImpl();
}

public static ESAPIDefaultEncoderImpl getInstance()
      {
        return singletonInstance;
      }
      private ESAPIDefaultEncoderImpl()
      {
         super(codecs);
      }
}
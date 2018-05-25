public final class Jackson
{
    private static final String JSONCONTENT
        = "{" +
            "\"type\":\"complicated\"," +
            "\"params\":[" +
            "{\"type\":\"simple\"," + "\"content\":\"i still love apples\"}," +
            "{\"type\":\"simple\",\"content\":\"i love spam too\"}" +
            "]" +
        "}";
    public static void main(final String... args)
        throws IOException
    {
        final ObjectMapper mapper = new ObjectMapper();
        final Complicated complicated
            = mapper.readValue(JSONCONTENT, Complicated.class);
        System.out.println("Deserialization done");
        System.out.println("Serializing");
        System.out.println(mapper.writeValueAsString(complicated));
    }
}

class Complicated
{
    private final String type;
    private final List<Simple> params;

    @JsonCreator
    Complicated(@JsonProperty("type") final String type,
        @JsonProperty("params") final List<Simple> params)
    {
        this.type = type;
        this.params = new ArrayList<Simple>(params);
    }

    public String getType()
    {
        return type;
    }

    public List<Simple> getParams()
    {
        return Collections.unmodifiableList(params);
    }
}

class Simple
{
    private final String type;
    private final String content;

    @JsonCreator
    Simple(@JsonProperty("type") final String type,
        @JsonProperty("content") final String content)
    {
        this.type = type;
        this.content = content;
    }

    public String getType()
    {
        return type;
    }

    public String getContent()
    {
        return content;
    }
}
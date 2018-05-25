public static Pattern loadMidi(InputStream in) throws IOException, InvalidMidiDataException
{
    MidiParser parser = new MidiParser();
    MusicStringRenderer renderer = new MusicStringRenderer();
    parser.addParserListener(renderer);
    parser.parse(MidiSystem.getSequence(in));
    Pattern pattern = new Pattern(renderer.getPattern().getMusicString());
    return pattern;
}

public static Pattern loadMidi(URL url) throws IOException, InvalidMidiDataException
{
    MidiParser parser = new MidiParser();
    MusicStringRenderer renderer = new MusicStringRenderer();
    parser.addParserListener(renderer);
    parser.parse(MidiSystem.getSequence(url));
    Pattern pattern = new Pattern(renderer.getPattern().getMusicString());
    return pattern;
}
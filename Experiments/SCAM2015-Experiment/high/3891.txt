File fileIn = new File("your file");
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(fileIn);
// do something
File fileOut = new File("new file");
if (AudioSystem.isFileTypeSupported(AudioFileFormat.Type.WAVE, audioInputStream)) {
    AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, fileOut);
}
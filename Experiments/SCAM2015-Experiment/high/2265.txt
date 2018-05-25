private void initialize() {
    camera.unlock();

    recorder.setCamera(camera);
    recorder.setAudioSource(MediaRecorder.AudioSource.CAMCORDER);
    recorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);
    recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
    recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
    recorder.setVideoEncoder(MediaRecorder.VideoEncoder.H264);
    recorder.setVideoFrameRate(20);
    recorder.setOutputFile(filePath);

    try {
        recorder.prepare();
    } catch (IllegalStateException e) {
        e.printStackTrace();
        finish();
    } catch (IOException e) {
        e.printStackTrace();
        finish();
    }
}
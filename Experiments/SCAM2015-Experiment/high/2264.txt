public void surfaceCreated(SurfaceHolder holder) {
    try {
        camera = Camera.open();

        parameters = camera.getParameters();
        parameters.setFlashMode(Parameters.FLASH_MODE_OFF);

        camera.setParameters(parameters);
        camera.setPreviewDisplay(holder);
        camera.startPreview();

        recorder = new MediaRecorder();
    } catch (IOException e) {
        e.printStackTrace();
    }       
}
public void record(View view) {
    if (recording) {
        recorder.stop();

        //TODO: do stuff....

        recording = false;
    } else {
        recording = true;

        initialize();
        recorder.start();
    }
}
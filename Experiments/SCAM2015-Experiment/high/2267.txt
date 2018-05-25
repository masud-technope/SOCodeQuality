public void flash(View view) {
    if(!recording) {
        camera.lock();
    }

    parameters.setFlashMode(parameters.getFlashMode().equals(Parameters.FLASH_MODE_TORCH) ? Parameters.FLASH_MODE_OFF : Parameters.FLASH_MODE_TORCH);
    camera.setParameters(parameters);

    if(!recording) {
        camera.unlock();
    }
}
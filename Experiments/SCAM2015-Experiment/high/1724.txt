synchronized (lock) {
    if (isOn) {
        isOn = false;
        statusMessage = "I'm off";
        // Do everything else to turn the thing off
    } else {
        isOn = true;
        statusMessage = "I'm on";
        // Do everything else to turn the thing on
    }
}
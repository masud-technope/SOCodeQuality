timer.schedule(new TimerTask() {
    @Override
    public void run() {
        // Your logic here...

        // When you need to modify a UI element, do so on the UI thread. 
        // 'getActivity()' is required as this is being ran from a Fragment.
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // This code will always run on the UI thread, therefore is safe to modify UI elements.
                myTextBox.setText("my text");
            }
        });
    }
}, 0, 3000); // End of your timer code.
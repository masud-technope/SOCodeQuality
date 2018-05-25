boolean hasMenuKey = ViewConfiguration.get(context).hasPermanentMenuKey();
boolean hasBackKey = KeyCharacterMap.deviceHasKey(KeyEvent.KEYCODE_BACK);

if(!hasMenuKey && !hasBackKey) {
    // Do whatever you need to do, this device has a navigation bar
}
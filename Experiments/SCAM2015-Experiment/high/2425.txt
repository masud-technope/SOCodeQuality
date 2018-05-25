String value = "This Is A Test";
StringBuilder sb = new StringBuilder(value);
for (int index = 0; index < sb.length(); index++) {
    char c = sb.charAt(index);
    if (Character.isLowerCase(c)) {
        sb.setCharAt(index, Character.toUpperCase(c));
    } else {
        sb.setCharAt(index, Character.toLowerCase(c));
    }
}

SecondTextField.setText(sb.toString());
public static final String TITLE = "Title";

public static Pattern loadPattern(File file) throws IOException {
    InputStream in = new FileInputStream(file);
    try {
        return loadPattern(in);
    } finally {
        in.close();
    }
}

public static Pattern loadPattern(URL url) throws IOException {
    InputStream in = url.openStream();
    try {
        return loadPattern(in);
    } finally {
        in.close();
    }
}

public static Pattern loadPattern(InputStream in) throws IOException {
    return loadPattern(new InputStreamReader(in, "UTF-8")); // or ISO-8859-1 ?
}

public static Pattern loadPattern(Reader reader) throws IOException {
    if (reader instanceof BufferedReader) {
        return loadPattern(reader);
    } else {
        return loadPattern(new BufferedReader(reader));
    }
}

public static Pattern loadPattern(BufferedReader bread) throws IOException {
    StringBuffer buffy = new StringBuffer();

    Pattern pattern = new Pattern();
    while (bread.ready()) {
        String s = bread.readLine();
        if ((s != null) && (s.length() > 1)) {
            if (s.charAt(0) != '#') {
                buffy.append(" ");
                buffy.append(s);
            } else {
                String key = s.substring(1, s.indexOf(':')).trim();
                String value = s.substring(s.indexOf(':')+1, s.length()).trim();
                if (key.equalsIgnoreCase(TITLE)) {
                    pattern.setTitle(value);
                } else {
                    pattern.setProperty(key, value);
                }
            }
        }
    }
    return pattern;
}
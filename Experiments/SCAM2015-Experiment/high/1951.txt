static String[] combinations = new String[] {
    "<body>","</body>","< body>","< /body>","<body >"
};

for (int i = 0; i < combinations.length; i++) {
    if (!input.contains(combinations[i])) {  
        output = output.replace(combinations[i], "");    
    }    
}
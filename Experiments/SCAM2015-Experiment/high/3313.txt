public static int intconvert(String numb, int index, int times) {
        if (index == numb.length()) { return x; }
        integer = Integer.parseInt(String.valueOf(numb.charAt(index))); //
        x += integer * times; // add int and multiply it
        return intconvert(numb, index++, times * 10); //

    }
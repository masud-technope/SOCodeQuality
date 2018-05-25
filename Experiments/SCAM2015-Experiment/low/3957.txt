for (int c = 0; c < (yourArrayList.size() - 1); c++) {
            for (int d = 0; d < (yourArrayList.size() - c - 1); d++) {

                if (Integer.parseInt(yourArrayList.get(d).get("number")) > Integer
                        .parseInt(yourArrayList.get(d + 1).get("number"))) {

                    temporary = yourArrayList.get(d);
                    yourArrayList.set(d, yourArrayList.get(d + 1));
                    yourArrayList.set(d + 1, temporary);

                }
            }
        }
int horizontalMovement = 0;
    for (int moduleMark : moduleMarks) {
        Bar bar = new Bar();
        bar.makeVisible();
        bar.moveVertical(200 - moduleMark);
        bar.changeSize(15, moduleMark);
        bar.moveHorizontal(horizontalMovement);
        horizontalMovement = horizontalMovement + 35;
        if (moduleMark < 35) {
            bar.changeColour(Colour.RED);
        } else if (moduleMark < 40) {
            bar.changeColour(Colour.YELLOW);
        } else if (moduleMark < 70) {
            bar.changeColour(Colour.GREEN);
        } else {
            bar.changeColour(Colour.MAGENTA);
        }
    }
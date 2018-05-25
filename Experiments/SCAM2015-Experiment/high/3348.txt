try {
    op1 = Integer.parseInt(jTextField1.getText());
} catch (NumberFormatException e) {
    System.out.println("Wrong number");
    op1 = 0;
}
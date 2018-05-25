if (productName.contains(brandName)) {
      System.out.println("Matched");
      productName = productName.replace (brandName, "");
} else {
      System.out.println("Didnot Match !!");
}
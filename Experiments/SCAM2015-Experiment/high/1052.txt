if (cost !=null && !"".equals(cost) ){
        try {
           Integer intCost = Integer.parseInt(cost);
           List<Book> books = bookService . findBooksCheaperThan(intCost);  
        } catch (NumberFormatException e) {
           System.out.println("This is not a number");
           System.out.println(e.getMessage());
        }
    }
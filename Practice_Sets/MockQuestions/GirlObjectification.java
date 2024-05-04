class LikesToDo {
    String name;
    boolean isBoy;
    int borrowedBooks = 0; // Assuming a maximum of 5 books can be borrowed
    final int MAX_BORROWED_BOOKS = 5;
  
    public LikesToDo(Girl girl) {
      this.name = girl.name;
      this.isBoy = false;
      likesToDoForGirl(girl);
    }
  
    public LikesToDo(Boy boy) {
      this.name = boy.name;
      this.isBoy = true;
      likesToDoForBoy(boy);
    }
  
    private void likesToDoForGirl(Girl girl) {
      System.out.println(name + " likes to go to school.");
      System.out.println(name + " likes to go to the library.");
      System.out.println(checkBookLimitAndIssueBook());
    }
  
    private String checkBookLimitAndIssueBook() {
      if (borrowedBooks < MAX_BORROWED_BOOKS) {
        borrowedBooks++;
        return name + " can borrow a book.";
      } else {
        return name + " has reached the borrowing limit of " + MAX_BORROWED_BOOKS + " books.";
      }
    }
  
    private void likesToDoForBoy(Boy boy) {
      System.out.println(name + " likes to go to school.");
      System.out.println(name + " likes to go to the playground.");
      // Implement logic for checking weather and playing indoor/outdoor games
    }
  
    // Method to return a book
    public void returnBook() {
      if (borrowedBooks > 0) {
        borrowedBooks--;
        System.out.println(name + " has successfully returned a book.");
      } else {
        System.out.println(name + " doesn't have any borrowed books.");
      }
    }
  }
  
  class Girl {
    String name;
  
    public Girl(String name) {
      this.name = name;
    }
  }
  
  class Boy {
    String name;
  
    public Boy(String name) {
      this.name = name;
    }
  }
  
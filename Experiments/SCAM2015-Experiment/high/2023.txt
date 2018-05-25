abstract class MenuItem {
  int index;

  protected MenuItem(int index) {
    this.index = index;
  }

  abstract void action();
}

class ExitMenuItem {
  ExitMenuItem() {
    super(3); // the index value of the menu item
  }

  void action() {
    System.exit(0);
  }
}
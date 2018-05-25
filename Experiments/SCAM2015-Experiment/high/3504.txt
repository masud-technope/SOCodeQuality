HorizontalLayout hor = new HorizontalLayout();
final Link link = new Link("Click on Me!", new ExternalResource("http://www.google.com"));
hor.addComponent(link);
hor.addLayoutClickListener(new LayoutClickListener() {
    @Override
    public void layoutClick(LayoutClickEvent event) {
        // capture the click here and do whatever you'd like to do, e.g.
        // if ( event.getClickedComponent() != null ) {
        // if(event.getClickedComponent().equals(link)) {}
    }
});
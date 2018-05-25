final HorizontalPanel hp = new HorizontalPanel();
final Button saveButton = new Button("save");
final Button cancelButton = new Button("cancel");

// just to see the bounds of the HorizontalPanel
hp.setWidth("600px");
hp.setBorderWidth(2);

// It only applies to widgets added after this property is set.
hp.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);

hp.add(saveButton);
hp.add(cancelButton);

RootPanel.get().add(hp);
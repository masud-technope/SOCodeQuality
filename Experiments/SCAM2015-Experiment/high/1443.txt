Component[] components = panel.getComponents();
panel.removeAll();
Component temp = components[oldIndex];
components[oldIndex] = components[newIndex];
components[newIndex] = temp;
for (Component comp : components) {
    panel.add(comp);
}                
panel.validate();
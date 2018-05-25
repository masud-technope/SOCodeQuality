//in Container class
public Component add(Component comp) {
    addImpl(comp, null, -1); //where it's added
    return comp;
}

//In JFrame class (overriding)
protected void addImpl(Component comp, Object constraints, int index) {
    if(isRootPaneCheckingEnabled()) {
        getContentPane().add(comp, constraints, index); //adds to content pane instead
    } else {
        super.addImpl(comp, constraints, index); //if root panes were not supported, which they currently are
    }
}
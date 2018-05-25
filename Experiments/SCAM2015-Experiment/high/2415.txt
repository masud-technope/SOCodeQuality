protected void forceWrapContent(View v) {
    // Start with the provided view
    View current = v;

    // Travel up the tree until fail, modifying the LayoutParams
    do {
        // Get the parent
        ViewParent parent = current.getParent();    

        // Check if the parent exists
        if (parent != null) {
            // Get the view
            try {
                current = (View) parent;
            } catch (ClassCastException e) {
                // This will happen when at the top view, it cannot be cast to a View
                break;
            }

            // Modify the layout
            current.getLayoutParams().width = LayoutParams.WRAP_CONTENT;
        }
    } while (current.getParent() != null);

    // Request a layout to be re-done
    current.requestLayout();
}
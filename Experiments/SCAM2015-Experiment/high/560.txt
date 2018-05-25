Tab selected_tab = null;

for ( Tab tab: tabList ) {
    if (tab_I_want(tab)) {
       selected_tab = tab;
       break;
    }
}

// selected_tab is either null or the tab you want
package com.example.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class Controller implements EntryPoint {
    private static Controller instance;
    private static final Logger log = Logger.getLogger(Controller.class.getName());

    // I have a feeling GWT does not respect private constructors, or else it uses some other voodoo.
    private Controller(){}

    public static Controller getInstance() {
        if (instance == null) instance = new Controller();
        return instance;
    }

    @Override
    public void onModuleLoad() {
        String token = History.getToken();
        log.info("****************************** token:"+token);
        History.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                navigate(event.getValue());
            } // onValueChange
        });
        if (token == null || token.length() == 0) History.newItem(Login.TOKEN); // no token
        else navigate(token); // restore app state
    }

    private static void navigate(String token) {
        RootPanel rootPanel = RootPanel.get("gwtApp");
        if (rootPanel.getWidgetCount() > 0) rootPanel.remove(0); // clear the page

        if (Login.TOKEN.equals(token)) {
            Login page = Login.getInstance();
            page.onModuleLoad();
        } else if (MainApp.TOKEN.equals(token)) {
            MainApp page = MainApp.getInstance();
            page.onModuleLoad(); // display the page
//          page.setAuthenticated(true);
//          page.setUsername(email);
        }

    }

} // Controller
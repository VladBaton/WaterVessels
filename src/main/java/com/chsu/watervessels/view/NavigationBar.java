package com.chsu.watervessels.view;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class NavigationBar extends HorizontalLayout {

    public NavigationBar(String activePage) {
        Button homeButton = createNavigationButton("Главная", "", activePage);
        Button portsButton = createNavigationButton("Суда", "employees", activePage);
        add(homeButton, portsButton);
        setSpacing(true);
        setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        setAlignItems(FlexComponent.Alignment.CENTER);
        setWidthFull();
    }

    private Button createNavigationButton(String label, String route, String activePage) {
        Button button = new Button(label);
        if (label.equals(activePage)) {
            button.getStyle()
                    .set("background-color", "#005FDB")
                    .set("color", "white");
        } else {
            button.addClickListener(e -> UI.getCurrent().navigate(route));
        }
        return button;
    }
}
package com.chsu.watervessels.view;

import com.chsu.watervessels.mapper.EntityToPojoMapper;
import com.chsu.watervessels.pojo.Port;
import com.chsu.watervessels.repositiry.PortRepository;
import com.chsu.watervessels.service.PortService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

import java.util.List;

@Route("ports")
@SpringComponent
@UIScope
public class PortView extends VerticalLayout {

    private final Grid<Port> grid;
    private final PortService portService;
    private final PortRepository portRepository;

    public PortView(PortService portService, PortRepository portRepository) {
        this.portService = portService;
        this.portRepository = portRepository;
        NavigationBar navigationBar = new NavigationBar("Порты");
        add(navigationBar);

        List<Port> ports = portRepository.findAll().stream().map(EntityToPojoMapper.INSTANCE::portToPojo).toList();

        grid = new Grid<>(Port.class);
        grid.setColumns("portName", "countryName");
        grid.setItems(ports);
        add(grid);
    }

}

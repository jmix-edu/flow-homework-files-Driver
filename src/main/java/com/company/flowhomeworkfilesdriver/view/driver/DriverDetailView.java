package com.company.flowhomeworkfilesdriver.view.driver;

import com.company.flowhomeworkfilesdriver.entity.Driver;

import com.company.flowhomeworkfilesdriver.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "drivers/:id", layout = MainView.class)
@ViewController("Driver.detail")
@ViewDescriptor("driver-detail-view.xml")
@EditedEntityContainer("driverDc")
public class DriverDetailView extends StandardDetailView<Driver> {
}
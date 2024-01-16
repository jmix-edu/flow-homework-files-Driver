package com.company.flowhomeworkfilesdriver.view.driver;

import com.company.flowhomeworkfilesdriver.entity.Driver;

import com.company.flowhomeworkfilesdriver.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "drivers", layout = MainView.class)
@ViewController("Driver.list")
@ViewDescriptor("driver-list-view.xml")
@LookupComponent("driversDataGrid")
@DialogMode(width = "64em")
public class DriverListView extends StandardListView<Driver> {
}
package com.company.flowhomeworkfilesdriver.view.document;

import com.company.flowhomeworkfilesdriver.entity.Document;

import com.company.flowhomeworkfilesdriver.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "documents/:id", layout = MainView.class)
@ViewController("Document.detail")
@ViewDescriptor("document-detail-view.xml")
@EditedEntityContainer("documentDc")
public class DocumentDetailView extends StandardDetailView<Document> {
}
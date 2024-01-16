### Prepared project
The project contains set of prepared elements related to "storing drivers data" area:
- Driver, LicenseInfo, and Document entities
- Views for drivers listing and editing, as well as for their license and documents.

### Task
In this homework task you need to add to the model new attributes, that will be used to storing files with data, and support these attributes inside the application's UI.

#### 1. Driver's photo
Storing, uploading and showing the photo using byte[] data type.

- Add to the Driver entity new attribute: name - photo, datatype - byte[].
- Add to DriverDetailView components for photo uploading, as well as for uploaded photo demonstration.
- Upload field must limit allowed files extensions - only PNG and JPG
- Image display component settings:
    - Place it on the right side of form.
    - Set up component's size (max 300 X 300 px) and scaling mode.
    - (*) (Optional) hide the component when photo was not uploaded yet or after photo deletion.

**NOTE**: In real production application for storing files bigger than 1000 Bytes - FileRef data type must be preferred over byte[] and highly recommended to use.

#### 2. Driver documents
Storing, up and downloading of driver documents (driver license, insurance, passport, etc.), using FileRef data type.

- Add to the Document entity new attribute - name - file, data type - FileRef.
- Add to Document detail view new component for the file upload.
- Add to Driver detail view inner table, that contains documents themselves, new functionality for documents preview and download.
  Task is achievable with Renderer usage.
    - Use LinkButton as returning component.
    - Link name - document's filename.
    - When link is clicked - initialize the document file preview in browser/downloading.
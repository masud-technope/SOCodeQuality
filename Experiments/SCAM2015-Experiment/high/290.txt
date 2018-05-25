// Create a factory for disk-based file items
DiskFileItemFactory factory = new DiskFileItemFactory();
factory.setRepository(dir);

// Create a new file upload handler
DiskFileUpload upload = new DiskFileUpload(factory);

// Parse the request
List /* FileItem */ items = upload.parseRequest(request);
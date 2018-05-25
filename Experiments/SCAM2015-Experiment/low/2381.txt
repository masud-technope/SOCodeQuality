<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Delete</title>
</head>
<body>
    <form method="post" action="DeleteServlet"
        enctype="multipart/form-data">
        Select file to delete: <input type="file" name="dataFile"
            id="fileChooser" /><br />
        <br /> <input type="submit" value="Delete" />
    </form>
</body>
</html>
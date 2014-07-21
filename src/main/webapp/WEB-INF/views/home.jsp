<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Eduqi Service Home</title>
</head>
<body>
<h1>
	Eduqi Service
</h1>
<br/>

#Eduqi Service calls:
<br/>
<br/>
CEP:  	http://{host}:{port}/eduqiservice/v1/getcep/{idEscola}
<br/>
Stats:   http://{host}:{port}/eduqiservice/v1/schoolanswers/{schoolID}<br/>
		http://{host}:{port}/eduqiservice/v1/generalstats<br/>
		
<br/>

Typeahead:  http://{host}:{port}/eduqiservice/v1/eduqiservice/v1/schoolname/{query}			   		   

<br/><br/>


</body>
</html>

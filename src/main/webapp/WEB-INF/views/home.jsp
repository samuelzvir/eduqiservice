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
Stats:   http://{host}:{port}/eduqiservice/v1/getaveragestats<br/>
		http://{host}:{port}/eduqiservice/v1/getpmathstats<br/>
		http://{host}:{port}/eduqiservice/v1/getportuguesestats<br/>
<br/><br/>	
School Stats:  http://{host}:{port}/eduqiservice/v1/getinfrastatus/{idEscola}
<br/><br/>

Type ahead:  http://{host}:{port}/eduqiservice/v1/getshoolname/{term}			   		   

<br/><br/>


</body>
</html>

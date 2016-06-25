<html>
<head>
	<script src="../CounterWebApp/static/js/bower_components/webcomponentsjs/webcomponents-lite.min.js" type="text/javascript"></script>
	<script src="../CounterWebApp/static/js/jquery.js" type="text/javascript"></script>
	<link rel="import" href="../CounterWebApp/static/js/bower_components/polymer/polymer.html">
	<link rel="import" href="../CounterWebApp/static/components/ficha-cliente.html">		
</head>

<body>
	<ficha-cliente id="fichaCliente"></ficha-cliente>
<%-- 	<h3>Message : ${message}</h3> --%>
<%-- 	<h3>Counter : ${counter}</h3> --%>
</body>
	<script >
	function obtenerDocumentos(){
		$.ajax({
			type: "POST", 
		    url: "/CounterWebApp/index",
		    success: function(response) {
		    	var documentos = [];
		    	$.each(response, function(index, valor) {			    		
		    		documentos[index] = valor.nombre;
		         });
		    	var ficha = document.getElementById('fichaCliente');
				console.log(ficha);
				ficha.nombre = 'Victor';
				ficha.paterno = 'Rodriguez';
				ficha.materno = 'Lozano';
				var combobox = document.getElementById('cmbDocumento');
				combobox.items = documentos;
		    }
		});
	}
	obtenerDocumentos();
	</script>
</html>
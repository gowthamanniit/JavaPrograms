<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
var  a=prompt("Enter the value is:\n")


var v=parseInt(a);

switch(v)
{
case 1:
	document.write("You Press case 1");
	break;
case 2:
	document.write("You Press case 2");
	break;
case 3:
	document.write("You Press case 3");
	break;
default:
	document.write("You Press case default");
	break;
}



// if(a%2==0)
// 	{
// 	  alert("Even")
// 	}
// else
// 	{
// 	alert("odd")
// 	}


//document.write(a);

</script>
</body>
</html>
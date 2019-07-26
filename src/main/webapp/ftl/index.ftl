<!DOCTYPE html>
<html>
<head>

<title>votingSystem</title>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script>
	function findById(){
		$.ajax({
			type : "GET",
			   url : "querySubjectById",
		   cache: false,
			data : "v_sid="+$("#sid").val(),
       success : function(obj) {
						   if(obj!=null){
							   alert(obj.getName);
						   }else{
							   alert("没查到")
						   }
						}
		  });
	}
</script>
</head>
<body>
	<center>
		<h1>全部主题 >></h1>
		<input type="text" id="sid"/>
		<table>
			<tr>
			<#list subjectList as item>
					<td>${item.id}</td>
					<td>${item.title}</td>
					<td>${item.totalVotes}</td>
					<td>${item.viewTimes}</td>
					<td>${item.createDate?string('yyyy-MM-dd HH:mm:ss')}</td>
			</#list>
			</tr>
		</table>
		<input type="button" value="提交" onclick="findById()"/>
	</center>
</body>
</html>
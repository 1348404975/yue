<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	<h1>课程静态页面</h1>
		<table>
			<tr>
				<td>课程名称</td>
				<td>课程类别</td>
				<td>课时</td>
				<td>讲课老师</td>
				<td>图片</td>
				<td>开课日期</td>
				<td>操作</td>
			</tr>
			<tr>
				<td>${clas.name}</td>
				<td>${clas.lb}</td>
				<td>${clas.ks}</td>
				<td>${clas.ls}</td>
				<td>
					<img width="100px" height="100px" src="${clas.img}">
				</td>
				<td>${clas.date}</td>
				<td><a href="http://localhost:9102/gou.html#?id=${clas.id}">购买</a></td>
			</tr>
		</table>
	</body>
</html>
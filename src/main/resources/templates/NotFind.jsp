<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="shortcut icon" href="/favicon.ico" />
		<meta charset="UTF-8">
	<title>404未找到相关内容</title>
	<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
	<link rel="stylesheet" type="text/css" href="./css/index.css" />
	</head>
	<body>
	<div class="continer">
		<div id="head">
			<div id="headlogo"><img alt="logo" src = "imgs/headtik.jpg"/></div>
			<div>
				<form action="searchblog" method="POST">
					<input type="text" hidden="true" value="POST"/>
					<input name="搜索" type="submit" value="搜索" />
					<input name="btitle" type="search"/>
				</form>
			</div>
			<div id="headmenu">
				<span>首页</span>
				<span>分类</span>
			</div>
		</div>
		<div id="container">
			<div id="left">
				<img class="headtik" alt="headlog" src="imgs/headtik.jpg">
				<p>SterbenSQ</p>
				<p>发现问题</p>
				<p>寻找理论</p>
				<p>进行实践</p>
				<p>找到答案</p>
				<p>------</p>
				<p>提出假想</p>
				<p>参考理论</p>
				<p>手动实践</p>
				<p>完成目标</p>
				
			</div>
			<div id="center" class="showview">
				<div id="blog-list" >
						<div class="blogs" style="width: 85%;text-align: center;">
							没有找到相关字条
						</div>
				</div>
			</div>
			<div id="right">
			
			</div>
		</div>
		<div id="footer">
			<a href="test1">hello world!</a>
		</div>
	</div>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="shortcut icon" href="/favicon.ico" />
		<meta charset="UTF-8">
	<title>${blog.btitle }</title>
	<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
	<!-- <script type="text/javascript">
		 function gotobyid(bid){
			$.ajax({
				url:"test1",
				type:"POST",
				data:{/* _method:'DELETE', */bid:bid},
				contentType:"application/x-www-form-urlencoded",/* 有时候默认，有时候会出错，也要注意 */
				dataType:"json",/* 预期服务器返回的结果类型（服务器返回的不一定是json */
				success:function(data){
					alert(data);
				}
			});
		} 
	</script> -->
	<link rel="stylesheet" type="text/css" href="./css/index.css" />
	</head>
	<body>
	<div class="continer">
		<div id="head">
			<div id="headlogo" onclick="window.location.href='index'"><img alt="logo" src = "imgs/headtik.jpg"/></div>
			<div>
				<form action="searchblog" method="POST">
					<input name="搜索" type="submit" value="搜索" />
					<input name="btitle" type="search"/>
				</form>
			</div>
			<div id="headmenu">
				<a href="index">首页</a>
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
						<div class="blogs" onclick="gotobyid(${blog.bid})">
							<div class="blogimg" ><img alt="blog_img" src="${blog.bimg }"></div>
							<div class="blog">
									<%-- <p class="blog_bid">${blog.bid }</p> --%>
								<h2 class="blog_btitle">${blog.btitle }</h2><!-- 题目 -->
								<p class="blog_bcontent">${blog.bcontent }</p><!-- 标签分类，或者说明 -->
								<p class="blog_bcontiner" align="left">${blog.bcontiner }</p><!-- 内容 -->
								<p class="blog_username">${blog.username }</p><!-- 作者 -->
								<p class="blog_date">${blog.date }</p><!-- 发表日期 -->
							</div>
							<div class="lines"></div>
						</div>
				</div>
			</div>
			<div id="right">
			
			</div>
		</div>
		<div id="footer">
			<a href="#">hello world!</a>
		</div>
	</div>
	</body>
</html>
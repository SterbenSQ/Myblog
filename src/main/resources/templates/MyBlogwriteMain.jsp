<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SterbenSQ的管理员界面</title>
<script type="text/javascript">

</script>
</head>
<body>
		<div id="head">
			<div id="headlogo"><img alt="logo" src = "favicon.ico"/></div>
			<div>
				<form>
					<input name="搜索" type="submit" value="搜索" onclick="test()"/>
					<input name="搜索" type="search"/>
				</form>
			</div>
			<div id="headmenu">
				<span>首页</span>
				<span>分类</span>
			</div>
		</div>
		<div id="container">
			<div id="left">
				<img alt="headlog" src="favicon.ico">
				<p>个人介绍</p>
				
			</div>
			<div id="center" class="showview">
				<div id="blog-list" >
						<c:forEach items="${bloglist }" var="blog">
							<div class="blogs">
								<div class="blogimg" ></div>
								<div class="blog">
									<%-- <p class="blog_bid">${blog.bid }</p> --%>
									<h2 class="blog_btitle">${blog.btitle }</h2><!-- 题目 -->
									<p class="blog_bcontent">${blog.bcontent }</p><!-- 标签分类，或者说明 -->
									<%-- <p class="blog_bcontiner">${blog.bcontiner }</p> --%><!-- 内容 ，不需要显示-->
									<p class="blog_username">${blog.username }</p><!-- 作者 -->
									<p class="blog_date">${blog.date }</p><!-- 发表日期 -->
								</div>
								<div calss="lines"></div>
							</div>
						</c:forEach>
				</div>
			</div>
			<div id="right">
			
			</div>
		</div>
		<div id="footer">
			<a href="test1">hello world!</a>
		</div>
		
	</body>
</html>
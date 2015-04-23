<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	
	<title>april-jpa</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="/april-jpa/webjars/bootstrap/3.3.4/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="/april-jpa/webjars/bootstrap/3.3.4/css/bootstrap-theme.min.css">
	
	<!-- Dahae Custom theme -->
	<link rel="stylesheet" href="/april-jpa/resources/css/dh-homepage.css">
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="/april-jpa/webjars/jquery/2.1.3/jquery.min.js"></script>
	
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/april-jpa/html/notice/notice_list">April-jpa</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/april-jpa/html/notice/notice_list">공지사항</a></li>
					<li><a href="/april-jpa/html/qna/qna_list">QnA</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul>
					</li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>
	<form:form method="POST" commandName="notice" action="add" class="form-horizontal" role="form">
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">공지사항 등록</div>
			<div class="panel-body">
				<div class="form-group">
					<form:label class="control-label col-sm-2" path="title">제목:</form:label>
					<div class="col-sm-10">
						<form:input type="text" class="form-control" path="title" />
					</div>
				</div>
				<div class="form-group">
					<form:label class="control-label col-sm-2" path="content">내용:</form:label>
					<div class="col-sm-10">
						<form:textarea class="form-control" cols="100" rows="15" path="content" />
					</div>
				</div>
			</div>
		</div>
		<nav>
			<ul class="pager">
				<li class="previous"><a href="javascript:window.history.back();"><span aria-hidden="true">&larr;</span>&nbsp;뒤로가기</a></li>
				<div class="text-right">
					<form:button type="submit" class="btn btn-default">저장</form:button>&nbsp;
				</div>
			</ul>
		</nav>
	</div>
	</form:form>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/april-jpa/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>		
</body>
</html>

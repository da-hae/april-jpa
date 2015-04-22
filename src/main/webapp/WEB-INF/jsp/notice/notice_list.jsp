<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="/april-jpa/webjars/jquery/2.1.3/jquery.min.js"></script>
	
	<style type="text/css">
		body {
			padding-top: 50px;
		}
		
		.starter-template {
			padding: 40px 15px;
			text-align: center;
		}
	</style>
	
	
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
				<a class="navbar-brand" href="/april-jpa/html/notice/notice_list.html">April-jpa</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/april-jpa/html/notice/notice_list.html">공지사항</a></li>
					<li><a href="/april-jpa/html/qna/qna_list.html">QnA</a></li>
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
	<div class="container">
		<div class="starter-template">
			<h1>안녕하세요</h1>
			<p class="lead">
				간단한 게시판을 만들어보기 위해 작성된 페이지 입니다
			</p>
			<form role="form">
				<div class="input-group">
					<div class="input-group-btn search-panel">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							<span id="search_concept">조건</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#title">제목</a></li>
							<li><a href="#content">내용</a></li>
							<li><a href="#writer">작성자</a></li>
						</ul>
					</div>
					<input type="text" class="form-control" name="x" placeholder="검색">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button" >&nbsp;<span class="glyphicon glyphicon-search"/></button>
					</span>
				</div>
			</form>
			<div class="panel panel-default">
				<div class="panel-heading">공지사항 목록</div>
				<!-- Table -->
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th class="text-center">번호</th>
							<th class="text-center">제목</th>
							<th class="text-center">조회수</th>
							<th class="text-center">작성자</th>
							<th class="text-center">작성일</th>
						</tr>
					</thead>
					<tbody>
						<c:if test="${empty noticeList}">
							<tr>
								<td class="text-center" colspan="5">공지사항이 없습니다.</td>
							</tr>
						</c:if>
						<c:if test="${!empty noticeList}">
							<c:forEach items="${noticeList}" var="notice">
								<tr>
									<td class="text-center">${notice.id}</td>
									<td class="text-center">
										<a href="/april-jpa/html/notice/notice_view.html" />
										${notice.title}
									</td>
									<td class="text-center">${notice.hits}</td>
									<td class="text-center">${notice.rernm}</td>
									<td class="text-center">${notice.rdate}</td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>
			<p class="text-right">
				<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/notice/form';">글쓰기</button>
			</p>
			<ul class="pagination">
				<li>
					<a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
				</li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#">6</a></li>
				<li><a href="#">7</a></li>
				<li><a href="#">8</a></li>
				<li><a href="#">9</a></li>
				<li><a href="#">10</a></li>
				<li>
					<a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
				</li>
			</ul>
		</div>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/april-jpa/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>		
</body>
</html>
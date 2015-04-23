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
	<div class="container-fluid">
		<div class="starter-template">
			<h1>안녕하세요</h1>
			<p class="lead">
				간단한 게시판을 만들어보기 위해 작성된 페이지 입니다
			</p>
			<form method="get" action="<c:url value='/notice/list' />" role="form">
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
					<input id="title" name="title" type="text" class="form-control" name="x" placeholder="검색">
					<span class="input-group-btn">
						<button class="btn btn-default" type="submit" >&nbsp;<span class="glyphicon glyphicon-search"/></button>
					</span>
				</div>
			</form>
			<div class="panel panel-default">
				<div class="panel-heading">공지사항 목록</div>
				<!-- Table -->
				<table id="notice-list" class="table table-striped table-hover">
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
								<tr data-notice-key="<c:url value='/notice/view?id=${notice.id}'/>" >
									<td class="text-center">${notice.id}</td>
									<td class="text-center">${notice.title}</td>
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
				<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/notice/add';">글쓰기</button>
			</p>
			<ul class="pagination">
				<c:if test="${noticePaging.startPage < noticePaging.page}">
					<li>
						<a href="<c:url value='/notice/list?page=${noticePaging.firstPage}'/>" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a>
					</li>
				</c:if>
				<c:forEach var="i" begin="${noticePaging.startPage}" end="${noticePaging.endPage}" step="1">
					<c:choose>
						<c:when test="${i eq noticePaging.page}">
							<li class="active">
								<a href="<c:url value='/notice/list?page=${i}'/>">${i}</a>
							</li>
						</c:when>
						<c:otherwise>
							<li>
								<a href="<c:url value='/notice/list?page=${i}'/>">${i}</a>
							</li>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<c:if test="${noticePaging.page < noticePaging.endPage}">
					<li>
						<a href="<c:url value='/notice/list?page=${noticePaging.nextPage}'/>" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/april-jpa/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$('#notice-list tbody tr').on('click', function(){
				location.href = $(this).attr("data-notice-key");
			});
		});
	</script>
</body>
</html>

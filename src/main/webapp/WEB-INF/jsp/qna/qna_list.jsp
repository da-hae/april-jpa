<!DOCTYPE>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
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
					<li><a href="/april-jpa/html/notice/notice_list.html">공지사항</a></li>
					<li class="active"><a href="/april-jpa/html/qna/qna_list.html">QnA</a></li>
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
							<li><a href="#content">질문자</a></li>
							<li><a href="#writer">답변여부</a></li>
						</ul>
					</div>
					<input type="text" class="form-control" name="x" placeholder="검색">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button" >&nbsp;<span class="glyphicon glyphicon-search"/></button>
					</span>
				</div>
			</form>
			<div class="panel panel-default">
				<div class="panel-heading">QnA 목록</div>
				<!-- Table -->
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th class="text-center">번호</th>
							<th class="text-center">제목</th>
							<th class="text-center">질문자</th>
							<th class="text-center">답변여부</th>
							<th class="text-center">접수일시</th>
							<th class="text-center">처리일시</th>
							<th class="text-center">소요시간</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="text-center">1</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />QnA 테스트1</td>
							<td class="text-center">홍길동</td>
							<td class="text-center">완료</td>
							<td class="text-center">2015-04-15 12:00</td>
							<td class="text-center">2015-04-15 13:00</td>
							<td class="text-center">60분</td>
						</tr>
						
						<tr>
							<td class="text-center">2</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.1</td>
							<td class="text-center">철수</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:03</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">3</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.2</td>
							<td class="text-center">미애</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:04</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">4</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.3</td>
							<td class="text-center">영희</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:05</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">5</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.4</td>
							<td class="text-center">찰스</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:06</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">6</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.5</td>
							<td class="text-center">미희</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:07</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">7</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.6</td>
							<td class="text-center">폴</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:08</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">8</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.7</td>
							<td class="text-center">미란다</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:09</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">9</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.8</td>
							<td class="text-center">제인</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:02</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
						
						<tr>
							<td class="text-center">10</td>
							<td class="text-center"><a href="/april-jpa/html/qna/qna_view.html" />질문입니다.9</td>
							<td class="text-center">갑돌이</td>
							<td class="text-center">미결</td>
							<td class="text-center">2015-04-15 12:01</td>
							<td class="text-center"></td>
							<td class="text-center"></td>
						</tr>
					</tbody>
				</table>
			</div>
			<p class="text-right">
				<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_form.html';">글쓰기</button>
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
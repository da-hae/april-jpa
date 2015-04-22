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
	<div class="container-fluid">
		<div class="panel panel-default">
			<div class="panel-heading">QnA 추가/수정</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label class="col-sm-2 control-label">질문자:</label>
						<div class="col-sm-10">
							<p class="form-control-static">홍길동</p>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목:</label>
						<div class="col-sm-10">
							<p class="form-control-static">QnA 테스트1</p>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="content">내용:</label>
						<div class="col-sm-10">
							<textarea class="form-control" cols="100" rows="15"></textarea>
						</div>
					</div>
				</form>
			</div>
		</div>
		<nav>
			<ul class="pager">
				<li class="previous"><a href="javascript:window.history.back();"><span aria-hidden="true">&larr;</span>&nbsp;뒤로가기</a></li>
				<div class="text-right">
					<button type="submit" class="btn btn-default">저장</button>
				</div>
			</ul>
		</nav>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/april-jpa/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>

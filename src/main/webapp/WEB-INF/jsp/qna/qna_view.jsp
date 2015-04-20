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
			padding-top: 100px;
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
				<a class="navbar-brand" href="/april-jpa/html/notice/notice_list.html">Board-project</a>
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
	<div class="container" >
		<div class="panel panel-default">
			<div class="panel-heading">QnA 정보</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form">
					<div class="form-group">
						<label class="control-label col-sm-2" for="qdate">질문일시:</label>
						<div class="col-sm-10">
							<p class="form-control-static">2015-04-15 12:00</p>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="qwriter">질문자:</label>
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
				</form>
			</div>
		</div>
			
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" href="#collapse1">
						첫번째 질문입니다. <span class="label label-default">질문일시: 2015-04-15 12:00</span>
						<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_form.html';">질문 수정</button>
						</a>
					</h4>
				</div>
				<div id="collapse1" class="panel-collapse collapse in">
					<div class="panel-body">
					답변입니다.
					<br><br>
					<span class="label label-default">답변일시: 2015-04-15 13:00</span>&nbsp;<span class="label label-default">소요시간: 60분</span>
					<br><br>
					<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_answer_form.html';">답변 수정</button>
					</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" href="#collapse2">
						두번째 질문입니다. <span class="label label-default">질문일시: 2015-04-15 14:10</span>
						<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_form.html';">질문 수정</button>
						</a>
					</h4>
				</div>
				<div id="collapse2" class="panel-collapse collapse in">
					<div class="panel-body">
						<span class="label label-default">답변이 없습니다.</span>
						<br><br>
						<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_answer_form.html';">답변 등록</button>
					</div>
				</div>
			</div>
		</div>
		<nav>
			<ul class="pager">
				<li class="previous"><a href="javascript:window.history.back();"><span aria-hidden="true">&larr;</span>&nbsp;뒤로가기</a></li>
				<p class="text-right">
					<button type="button" class="btn btn-default" onclick="javascript:location.href='/april-jpa/html/qna/qna_form.html';">추가질문</button>
					<button type="button" class="btn btn-default">삭제</button>
				</p>
			</ul>
		</nav>
	</div>
	<!-- Latest compiled and minified JavaScript -->
	<script src="/april-jpa/webjars/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>
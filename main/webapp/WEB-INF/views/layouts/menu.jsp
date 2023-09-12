<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- nav : 현재 웹 사이트에서 지정한 다른 지점으로 이동할 수 있는 네비게이션 역할 / 주로 메뉴에 사용 -->
<nav class="navbar navbar-expand-md bg-primary navbar-dark stickty-top">

	<a class="navbar-brand" href="#"> <i class="fa-solid fa-tree"></i>
		Christmas
	</a>

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">

		<span class="navbar-toggler-icon"></span>

	</button>

	<div class="collapse navbar-collapse" id="collapsibleNavbar">

		<!-- 좌측 메뉴 구성 -->
		<ul class="navbar-nav">

			<li class="nav-item"><a class="nav-link" href="#">메뉴1</a></li>

			<li class="nav-item"><a class="nav-link" href="#">메뉴2</a></li>

			<li class="nav-item"><a class="nav-link" href="#">메뉴3</a></li>
		</ul>

		<!-- 우측 메뉴 -->
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" href="#"> <i
					class="fa-solid fa-right-from-bracket"></i> logout
			</a></li>
		</ul>
	</div>
</nav>
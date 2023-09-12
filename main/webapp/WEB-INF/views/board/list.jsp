<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layouts/header.jsp"%>

<%-- 개별 페이지 --%>
<h1 class="page-header">
	<i class="fa-solid fa-list"></i> Board List
</h1>

<table class="table table-striped table-hover">
	<thead>
		<tr>
			<th>No</th>
			<th>Title</th>
			<th>Writer</th>
			<th>SubDate</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach var="board" items="${list}">
			<tr>
				<td style="width: 60px">${board.bno}</td>
				<td><a href="get?bno=${board.bno}">${board.title}</a></td>
				<td style="width: 100px">${board.writer}</td>
				<td style="width: 130px"><fmt:formatDate pattern="yyyy-MM-dd"
						value="${board.regDate}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<div class="text-right">
<a href="register" class="btn btn-primary">
<i class="fa-regular fa-pen-to-square"></i> 글쓰기</a>
</div>

<%@ include file="../layouts/footer.jsp"%>
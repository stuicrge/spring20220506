<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name = "path" required="false" %>
		<nav aria-label="Page navigation example">
			<ul class="pagination justify-content-center">
				<li class="page-item ">
     				 <a class="page-link" href="${pageInfo.left }">Previous</a>
    			</li>
			<c:forEach begin = "${pageInfo.left}" end="${pageInfo.right }" var="pageNum">
			<c:url value= "${path }" var="link">
				<c:param name = "page" value="${pageNum }"></c:param>
			</c:url>
				
								
				<li class="page-item ${pageInfo.current == pageNum ? 'active' : '' }">
					<a class="page-link" href="${link}">${pageNum }</a>
				</li>
				
				
				</c:forEach>	
				 <li class="page-item">
      				<a class="page-link" href="${pageInfo.right }">Next</a>
    			 </li>
			</ul>
		</nav>
<%-- 
    Document   : home
    Created on : 2013-06-24, 22:14:04
    Author     : lukasz.solniczek
--%>
<%@include file="/header_footer/header.jsp" %>

<body>

    <div id="wrap">
        <%@include file="/navigation_menu/navigation.jsp" %>   
        <div class="container-fluid">
            <div class="row-fluid">
                <!-- Begin page content -->
                <c:if test="${!empty param.newIsseAdd}">
                    <div class="alert alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <span class="label label-success">Success</span>
                        <small>You have just add new issue...</small>
                    </div>
                </c:if>
                <div class="span7">
                    <div class="accordion" id="accordion2">
                        <h2>All Issue list</h2>
                        <c:forEach var="task" items="${allTasks}">
                            <div class="accordion-group">
                                <div class="accordion-heading">
                                    <a class="accordion-toggle text-info" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne${task.id}">
                                        <c:out value="${task.chTitle}" escapeXml="true" />
                                    </a>
                                </div>
                                <div id="collapseOne${task.id}" class="accordion-body collapse">
                                    <div class="accordion-inner">
                                        <c:out value="${task.chDescription}" escapeXml="true" />
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="span5">
                </div>
            </div>
        </div>
    </div>



    <%@include file="/header_footer/footer.jsp" %>
    <%@include file="/header_footer/js.jsp" %>
</body></html>

<%-- 
    Document   : add_issue
    Created on : 2013-07-10, 20:22:53
    Author     : lukasz.solniczek
--%>

<%@include file="/header_footer/header.jsp" %>
<body>
    <div id="wrap">
        <%@include file="/navigation_menu/navigation.jsp" %>   

        <div class="container-fluid">
            <div class="row-fluid">
                <div class="row">
                    <div class="span9">
                        <form class="form-horizontal login_form" method="post" action="addIssue.do">
                            <legend class="text-center"><h4>New Issue</h4></legend>
                            <div class="control-group">
                                <label class="control-label" for="project">Project</label>
                                <div class="controls">
                                    <select class="input-xxlarge" id="project" name="project">
                                        <c:forEach var="projectN" items="${pName}">
                                            <option value="<c:out value="${fn:trim(projectN.id)}" escapeXml="true" />">${fn:trim(projectN.chValue)}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="iType">Issue type</label>
                                <div class="controls">
                                    <select class="input-xxlarge" id="iType" name="iType">
                                        <c:forEach var="issueT" items="${iType}">
                                            <option value="<c:out value="${fn:trim(issueT.id)}" escapeXml="true" />">${fn:trim(issueT.chValue)}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="title">Title</label>
                                <div class="controls">
                                    <input name="title" class="input-xxlarge" type="text" id="title" placeholder="title">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="desc">Description</label>
                                <div class="controls">
                                    <textarea name="desc" class="input-xxlarge" id="desc" placeholder="Description" rows="5" cols="7"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="addInfo">Additiona information</label>
                                <div class="controls">
                                    <textarea name="add_info" class="input-xxlarge" id="addInfo" placeholder="Additiona information" rows="5" cols="7"></textarea>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="prio">Pirority</label>
                                <div class="controls">
                                    <select class="input-xxlarge" id="prio" name="prio">
                                        <c:forEach var="prio" items="${iPriority}">
                                            <option value="<c:out value="${fn:trim(prio.id)}" escapeXml="true" />">${fn:trim(prio.chValue)}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="issSize">Issue size</label>
                                <div class="controls">
                                    <select class="input-xxlarge" id="issSize" name="issSize">
                                        <c:forEach var="issSize" items="${iSize}">
                                            <option value="<c:out value="${fn:trim(issSize.id)}" escapeXml="true" />">${fn:trim(issSize.chValue)}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="execu">Executor</label>
                                <div class="controls">
                                    <select class="input-xxlarge" id="execu" name="execu">
                                        <c:forEach var="execu" items="${siExecu}">
                                            <option value="<c:out value="${fn:trim(execu.id)}" escapeXml="true" />">${fn:trim(execu.chName)} ${fn:trim(execu.chLastname)} ${fn:trim(execu.chLogin)}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="auth">Author</label>
                                <div class="controls">
                                    <input name="author" class="input-xxlarge" type="text" id="auth" disabled="true" value="<c:out value="${fn:trim(newUser.chLogin)}" escapeXml="true" />">
                                </div>
                            </div>
                            <div class="control-group">
                                <label class="control-label" for="attach">Attachment</label>
                                <div class="controls">
                                    <input name="attach" class="input-xxlarge" type="file" id="attach" placeholder="Attachment">
                                </div>
                            </div>
                            <div class="form-actions_custom">
                                <button type="submit" class="btn btn-primary" data-loading-text="Loading...">Add</button>
                                <button type="button" class="btn btn-link" data-dismiss="modal" aria-hidden="true" >Cancel</button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="span3">...</div>
            </div>
        </div>
    </div>
<%@include file="/header_footer/footer.jsp" %>
<%@include file="/header_footer/js.jsp" %>
</body>
</html>

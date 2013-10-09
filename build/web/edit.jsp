<%-- 
    Document   : home
    Created on : 2013-06-24, 22:14:04
    Author     : lukasz.solniczek
--%>
<%@include file="/header_footer/header.jsp" %>

<body>


    <!-- Part 1: Wrap all page content here -->
    <div id="wrap">
        <%@include file="/navigation_menu/navigation.jsp" %> 


        <!-- Begin page content -->
        <div class="container-fluid">
            <div class="row-fluid">
                <c:if test="${!empty param.newUserUpdate}">
                    <div class="alert alert-success">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <span class="label label-success">Success</span>
                        <small>You have just update your date...</small>
                    </div>
                </c:if>
                <div class="span4">
                    <legend class="text-center"><h4>Update form</h4></legend>
                    <form class="form-horizontal" method="post" action="userupdate.do">
                        <div class="control-group">
                            <label class="control-label" for="fname">First Name</label>
                            <div class="controls">
                                <input type="text" name="userfnamesignup" id="fname" placeholder="First Name" value="<c:out value="${fn:trim(newUser.chName)}" escapeXml="true" />">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="lname">Last Name</label>
                            <div class="controls">
                                <input type="text" name="userlnamesignup" id="lname" placeholder="Last Name" value="<c:out value="${fn:trim(newUser.chLastname)}" escapeXml="true" />">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="login">Login</label>
                            <div class="controls">
                                <input type="text" id="login" name="usernamesignup" placeholder="Login" value="<c:out value="${fn:trim(newUser.chLogin)}" escapeXml="true" />">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="email">Email</label>
                            <div class="controls">
                                <input type="text" name="emailsignup" id="email" placeholder="Email" value="<c:out value="${fn:trim(newUser.chEmail)}" escapeXml="true" />">
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label" for="pass">Password</label>
                            <div class="controls">
                                <input type="password" id="pass" name="passwordsignup" placeholder="Password" value="<c:out value="${fn:trim(newUser.chPassword)}" escapeXml="true" />">
                            </div>
                        </div>
                        <legend></legend>
                        <div class="control-group">
                            <button class="btn btn-small btn-block btn-primary" type="submit">Update</button>
                        </div>
                </div>
                </form>
            </div>
            <div class="span8">...</div>
        </div>
    </div>
    <%@include file="/header_footer/footer.jsp" %>
    <%@include file="/header_footer/js.jsp" %>
</body></html>

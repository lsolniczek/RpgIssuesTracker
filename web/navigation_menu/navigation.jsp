<%-- 
    Document   : navigation
    Created on : 2013-07-10, 20:16:36
    Author     : lukasz.solniczek
--%>


<!-- Fixed navbar -->
<div class="navbar navbar-inverse">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="/app_rpg/home">RPG Issue tracker</a>
            <div class="nav-collapse collapse">
                <div class="btn-group left">
                    <a class="btn btn-primary" href="add_issue"><i class="icon-plus icon-white"></i> Add Issue</a>
                </div>
                <div class="btn-group right">
                    <a class="btn btn-success" href="#"><i class="icon-user icon-white"></i> <c:out value="${fn:trim(newUser.chLogin)}" escapeXml="true" /></a>
                    <a class="btn btn-success dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="edit"><i class="icon-pencil"></i> Edit</a></li>
                        <li><a href="#"><i class="icon-trash"></i> Delete</a></li>
                        <li><a href="logout.do"><i class="icon-ban-circle"></i> Log out</a></li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="i"></i>Make admin</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>

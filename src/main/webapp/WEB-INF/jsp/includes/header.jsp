<div class="brand">${evento.nome}</div>
    <div class="address-bar">${evento.local} | <fmt:formatDate type="date" value="${evento.dataInicio.time}" /> | <fmt:formatDate type="time" value="${evento.dataInicio.time}" /></div>

    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">Business Casual</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="index.html">Home</a>
                    </li>
                    <li><a href="about.html">About</a>
                    </li>
                    <li><a href="blog.html">Blog</a>
                    </li>
                    <li><a href="contact.html">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
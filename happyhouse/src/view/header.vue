<template>
  <div>
    <div class="navbar navbar-expand-lg navbar-dark navbar-custom fixed-top">
        <div class="container">
            <a class="navbar-brand" href="index.do">HappyHouse</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive"
                aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="navbar-collapse collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto" id="loginDisplay">
                    <li class="nav-item">
                        <a class="nav-link" href="#drop-news" data-toggle="collapse">MENU
                            <ul class="nav-link collapse" id="drop-news">
                                <a class="nav-link" href="about.jsp">About us</a>
                                <a class="nav-link" href="notice.jsp">Notice</a>
                                <a class="nav-link" href="sitemap.jsp">Site map</a>
                            </ul>
                        </a>
                    </li>
	                <li class="nav-item">
	                    <a class="nav-link" href="#" onclick="document.getElementById('modal_join').style.display='block'"><i class="fas fa-user-edit"></i>Join</a>
	                </li>
	                <li class="nav-item">
                        <a class="nav-link" href="#" onclick="document.getElementById('modal_login').style.display='block'"><i class="fas fa-sign-in-alt"></i>Login</a>
	                </li>
                </ul>
            </div>
        </div>
    </div>

    <header class="masthead text-center text-white" >
        <div class="masthead-content">
            <div class="container">
                
                <h1 class="masthead-heading mb-2">행복한 부동산 정보 제공 서비스</h1>
                <h2 class="masthead-subheading mb-0">HappyHouse에 오신 것을 환영합니다</h2>
                <div class="container h-100 mt-4">
                    <div class="d-flex justify-content-center h-100">
                        <div class="searchbar">
                            <!-- <input class="search_input" type="text" name="" placeholder="Search..."> -->
                            <!-- <a href="#" class="search_icon"><i class="fas fa-search"></i></a> -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
  </div>
</template>

<script>
export default {

}
</script>

<style>
.container{
   /* background:url('../image/seoul_view.jpg') no-repeat; */
}
</style>
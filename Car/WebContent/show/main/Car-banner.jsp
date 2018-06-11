<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>汽车网</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Car Trade Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/show/main/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${pageContext.request.contextPath}/show/main/css/style.css" type="text/css" rel="stylesheet" media="all">   
<link href="${pageContext.request.contextPath}/show/main/css/font-awesome.css" rel="stylesheet">	<!-- font-awesome icons -->     
<link rel="stylesheet" href="${pageContext.request.contextPath}/show/main/css/flexslider.css" type="text/css" media="screen" />  <!-- flexslider-CSS -->  
<link rel="stylesheet" href="${pageContext.request.contextPath}/show/main/css/chocolat.css" type="text/css" media="screen"> 
<!-- //Custom Theme files --> 
<!-- js -->
<script src="${pageContext.request.contextPath}/show/main/js/jquery-2.2.3.min.js"></script>  
<!-- //js -->
<!-- web-fonts -->    
<!-- //web-fonts -->
</head>
<body >
	<!-- banner -->
	 
		<!-- header -->
		<div class="header-w3layouts" style="background-image:url(${pageContext.request.contextPath}/show/main/images/1.jsp)"> 
			<!-- Navigation -->
			<nav class="navbar navbar-default navbar-fixed-top">
				<div class="container">
					<div class="navbar-header page-scroll">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
							<span class="sr-only">汽车交易</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<h1 class="w3lslogo"><a href="index.html">CT <span>汽车交易</span></a></h1>
					</div> 
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-ex1-collapse">
						<ul class="nav navbar-nav navbar-right cl-effect-15">
							<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
							<li><a class="page-scroll" href="#home" data-hover="主页">主页</a></li> 
							<li><a class="page-scroll" href="../../BuyCarServlet?method=getAll" data-hover="商城">商城</a></li>
							<li><a class="page-scroll" href="#features" data-hover="Features">Features</a></li>
							<li><a class="page-scroll" href="#gallery" data-hover="Gallery">Gallery</a></li>
							<li><a class="page-scroll" href="#stats" data-hover="登录">登录</a></li>
							<li><a class="page-scroll" href="#blog" data-hover="注册">注册</a></li>
							<li><a class="page-scroll" href="#contact" data-hover="后台管理">后台管理</a></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container -->
			</nav>  
		</div>	
		<!-- //header -->
		<!-- banner-text -->
		<div class="banner-text">  
			 
		</div> 
		<!-- //banner-text -->   
	
	
</body>
<!-- //modal --> 
	<!-- timer scripts --> 
	<script type="text/javascript" src="${pageContext.request.contextPath}/show/main/js/moment.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/show/main/js/moment-timezone-with-data.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/show/main/js/timer.js"></script>
	<!-- //timer scripts -->
	<!-- start-smooth-scrolling --> 
	<script type="text/javascript" src="${pageContext.request.contextPath}/show/main/js/move-top.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/show/main/js/easing.js"></script>	
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
			
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
	<!-- //end-smooth-scrolling -->	 
	<!-- smooth-scrolling-of-move-up -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			
			$().UItoTop({ easingType: 'easeOutQuart' });
			
		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->   
	<!-- Scrolling Nav JavaScript --> 
    <script src="${pageContext.request.contextPath}/show/main/js/scrolling-nav.js"></script>  
	<!-- //fixed-scroll-nav-js -->  
	<!-- bth hover effect --> 
	<script>
	$(function() {
		$('.btn-6')
		.on('mouseenter', function(e) {
			var parentOffset = $(this).offset(),
			relX = e.pageX - parentOffset.left,
			relY = e.pageY - parentOffset.top;
		  $(this).find('span').css({
			top: relY,
			left: relX
		  })
		})
		.on('mouseout', function(e) {
		  var parentOffset = $(this).offset(),
			relX = e.pageX - parentOffset.left,
			relY = e.pageY - parentOffset.top;
		  $(this).find('.btn-6 span').css({
			top: relY,
			left: relX
		  })
		}); 
	});
	</script>	
	<!-- //bth hover effect --> 
	<!-- jarallax -->
	<script src="${pageContext.request.contextPath}/show/main/js/jarallax.js"></script>
	<script src="${pageContext.request.contextPath}/show/main/js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>
	<!-- //jarallax -->   
	<!-- FlexSlider --> 
	<script defer src="${pageContext.request.contextPath}/show/main/js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function(){
		  $('.flexslider').flexslider({
			animation: "slide",
			start: function(slider){
			  $('body').removeClass('loading');
			}
		  });
		});
	</script>
	<!-- //End-FlexSlider -->  
	<!-- pop-up-script -->
	<script src="${pageContext.request.contextPath}/show/main/js/jquery.chocolat.js"></script>
	<script type="text/javascript">
	$(function() {
		$('.view-seventh a').Chocolat();
	});
	</script>
	<!-- //pop-up-script -->  
	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/show/main/js/bootstrap.js"></script>
</html>
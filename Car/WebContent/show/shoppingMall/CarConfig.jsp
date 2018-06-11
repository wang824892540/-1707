<%@page import="java.util.Random"%>
<%@page import="cn.com.car.bean.CarModel"%>
<%@page import="java.util.List"%>
<%@page import="cn.com.car.service.carmanager.impl.CarBrandServiceImpl"%>
<%@page import="cn.com.car.service.carmanager.CarBrandService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
<title>汽车详情</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Car Trade Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">   
<link href="css/font-awesome.css" rel="stylesheet">	<!-- font-awesome icons -->     
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />  <!-- flexslider-CSS -->  
<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen"> 
<!-- //Custom Theme files -->
<!-- Bootstrap -->
<link href="${pageContext.request.contextPath }/manage/manageMent/assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath }/manage/manageMent/assets/css/vendor/animate/animate.css">
<link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath }/manage/manageMent/assets/js/vendor/mmenu/css/jquery.mmenu.all.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/manage/manageMent/assets/js/vendor/videobackground/css/jquery.videobackground.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/manage/manageMent/assets/css/vendor/bootstrap-checkbox.css">
	
<link rel="stylesheet" href="${pageContext.request.contextPath }/manage/manageMent/assets/js/vendor/chosen/css/chosen.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/manage/manageMent/assets/js/vendor/chosen/css/chosen-bootstrap.css">
	
<link href="${pageContext.request.contextPath}/manage/manageMent/assets/css/minimal.css" rel="stylesheet">
<!-- js -->
<script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/jquery.js"></script>  
<!-- //js -->


<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath }/show/html/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="${pageContext.request.contextPath }/show/html/css/style.css" type="text/css" rel="stylesheet" media="all">   
<link href="${pageContext.request.contextPath }/show/html/css/font-awesome.css" rel="stylesheet">	<!-- font-awesome icons -->     
<link rel="stylesheet" href="${pageContext.request.contextPath }/show/html/css/flexslider.css" type="text/css" media="screen" />  <!-- flexslider-CSS -->  
<link rel="stylesheet" href="${pageContext.request.contextPath }/show/html/css/chocolat.css" type="text/css" media="screen"> 
<!-- //Custom Theme files --> 
<!-- js -->
<script src="${pageContext.request.contextPath }/show/html/js/jquery-2.2.3.min.js"></script>  
<!-- //js -->
<!-- web-fonts -->    
<!-- //web-fonts -->


</head>
  <body class="bg-1">
    <!-- Preloader -->
    <div class="mask"><div id="loader"></div></div>
    <!--/Preloader -->

    <!-- Wrap all page content here -->
    <div id="wrap">
      <!-- Make page fluid -->
      <div class="row">
 
        <!-- Page content -->
        <div id="content" style="padding-right:20%">
          <!-- content main container -->
          <div class="main">
            <!-- row -->
            <div class="row">

              <!-- col 12 -->
              <div class="col-md-12">
				<!-- col 12 -->
						<h3>基本信息</h3>
                    	<hr/>
                    	<section class="tile color transparent-white col-md-12">
	                    <!-- cards -->
	                    <div class="row cards" style="padding-top: 15px;">
	                      
	                      <div class="card-container col-md-3">
	                        <div class="card card-redbrown">
	                          <div class="front"> 
	
	                            <div class="media" >
	                              <div class="media-body">
	                                <center><span>汽车品牌</span></center>
	                                <center style="padding-top: 15px;">
	                                	<h2 class="media-heading animate-number">${config.car_Brandname}</h2>
	                                </center>
	                              </div>
	                            </div> 
	                          </div> 
	                        </div>
	                      </div>
	                      
	                      <div class="card-container col-md-3">
	                        <div class="card card-blue">
	                          <div class="front"> 
	
	                            <div class="media" >
	                              <div class="media-body">
	                                <center><span>汽车型号</span></center>
	                                <center style="padding-top: 15px;">
	                                	<h2 class="media-heading animate-number">${config.car_Modelname}</h2>
	                                </center>
	                              </div>
	                            </div> 
	                          </div> 
	                        </div>
	                      </div>
	                      
	                      <div class="card-container col-md-3">
	                        <div class="card card-greensea">
	                          <div class="front"> 
	
	                            <div class="media" >
	                              <div class="media-body">
	                                <center><span>汽车类型</span></center>
	                                <center style="padding-top: 15px;">
	                                	<h2 class="media-heading animate-number">${config.car_Typename}</h2>
	                                </center>
	                              </div>
	                            </div> 
	                          </div> 
	                        </div>
	                      </div>
	                      
	                      <div class="card-container col-md-3">
	                        <div class="card card-slategray">
	                          <div class="front"> 
	
	                            <div class="media" >
	                              <div class="media-body">
	                                <center><span>汽车售价</span></center>
	                                <center style="padding-top: 15px;">
	                                	<h2 class="media-heading animate-number">￥${config.car_Sell}</h2>
	                                </center>
	                              </div>
	                            </div> 
	                          </div> 
	                        </div>
	                      </div>
	                      
	                      
	                    </div>
	                    <!-- /cards -->
	                    </section>
	                    
	                    <h3>详细信息</h3>
	                    <hr/>
	                    <section class="tile color transparent-white col-md-12">
	                    	<div style="padding-top: 10px;" class="col-md-4">
	                    		<div>
	                    			
		                    		<span class="badge badge-slategray" style="font-size: 15px;">1</span>
		                    		<span class="label label-slategray" style="font-size: 15px;">发动机信息</span>
		                    		<span class="label label-slategray" style="font-size: 15px;">${config.car_Engine}</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">2</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;&nbsp;&nbsp;变速箱&nbsp;&nbsp;&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Gearbox}</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">3</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;能源类型&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Energy}</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;padding-bottom: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">4</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;最大功率&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Life} kw</span>
		                    		
		                    	</div>
		                    	
		                    	<div>
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">5</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;车身结构&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Structure}</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">6</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;车轮驱动&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Tiredrive}驱</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">7</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;&nbsp;&nbsp;长宽高&nbsp;&nbsp;&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Volume}</span>
		                    		
		                    	</div>
		                    	
		                    	<div style="padding-top: 10px;">
	                    			
		                    			<span class="badge badge-slategray" style="font-size: 15px;">8</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">&nbsp;&nbsp;安全气囊&nbsp;&nbsp;</span>
		                    			<span class="label label-slategray" style="font-size: 15px;">${config.car_Issafe > 1 ? '主,副':'主'}</span>
		                    		
		                    	</div>
		                    	<div class="col-md-12" style="padding-top: 30px;">
		                    		<button type="button" class="btn btn-primary  btn-block">购买</button>
		                    	</div>
	                    	</div>
	                    	
	                    	<div class="col-md-8" style="padding-top: 10px;padding-bottom: 10px;">
		                   		<img src="${pageContext.request.contextPath}/show/html/images/g<%=new Random().nextInt(8)+1%>.jpg" />		                   		
		                    </div>
		                    
	                    </section>
	                      
	                      <div class="container">
	    	<!-- gallery -->
		<div id="gallery" class="gallery">
			<div class="container">
				<h3 class="agileits-title">Gallery<span class="w3lshr-line"> </span></h3>
				<div class="main">
	                <div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g1.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g1.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g2.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g2.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g3.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g3.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div> 
	                </div>  
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g7.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g7.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g8.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g8.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g9.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g9.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div> 
	                </div>  
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g4.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g4.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g5.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g5.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div>
	                </div>
					<div class="col-sm-4 col-xs-6 gallry-agile-grids">
						<div class="view view-seventh">
							<a href="${pageContext.request.contextPath}/show/html/images/g6.jpg" class="b-link-stripe b-animate-go thickbox" title="Car Trade">
								<img src="${pageContext.request.contextPath}/show/html/images/g6.jpg" alt=""/>
								<div class="mask">
									<h4>Trending Cars</h4>
									<p>Donec efficitur lacus sit amet sollicitudin finibus. Sed tristique nisi augue, sed elementum </p>
								</div>
							</a>
						</div> 
					</div>
					<div class="clearfix"> </div>
	            </div>
			</div>
		</div>
	    
	    
	    <!-- blog -->
		<div id="blog" class="blog gallery">
			<div class="container">        
				<h3 class="agileits-title">Our Blog<span class="w3lshr-line"> </span></h3>
				<div class="blog-agileinfo">
					<div class="col-md-7 blog-w3grid-img">
						<a href="#myModal" data-toggle="modal" class="wthree-blogimg">  
							<img src="${pageContext.request.contextPath}/show/html/images/g1.jpg" class="img-responsive" alt=""/>
						</a>  
					</div>
					<div class="col-md-5 blog-w3grid-text"> 
						<h4><a href="#myModal" data-toggle="modal">Soluta vum nobis</a></h4>
						<h6>By <a href="#"> Admin</a> - Nov 25th, 2016 </h6>
						<p>Sed interdum interdum accumsan. Aenean nec purus ac orci finibus facilisis. In sit amet placerat nisl, in auctor sapien. Donec ultricies faucibus ante in mattis earum rerum delectus in auctor sapien. </p>
					</div> 
					<div class="clearfix"> </div>
				</div> 
				<div class="blog-agileinfo blog-agileinfo-mdl">
					<div class="col-md-7 blog-w3grid-img blog-img-rght">
						<a href="#myModal" data-toggle="modal" class="wthree-blogimg">  
							<img src="${pageContext.request.contextPath}/show/html/images/g2.jpg" class="img-responsive" alt=""/>
						</a>  
					</div>
					<div class="col-md-5 blog-w3grid-text"> 
						<h4><a href="#myModal" data-toggle="modal">Aenean nec purus ac</a></h4>
						<h6>By <a href="#"> Admin</a> - Dec 31st, 2015 </h6>
						<p>Sed interdum interdum accumsan. Aenean nec purus ac orci finibus facilisis. In sit amet placerat nisl, in auctor sapien. Donec ultricies faucibus ante in mattis earum rerum hic a sapiente delectus. </p>
					</div> 
					<div class="clearfix"> </div>
				</div> 
				<div class="blog-agileinfo">
					<div class="col-md-7 blog-w3grid-img">
						<a href="#myModal" data-toggle="modal" class="wthree-blogimg">  
							<img src="${pageContext.request.contextPath}/show/html/images/g3.jpg" class="img-responsive" alt=""/>
						</a>  
					</div>
					<div class="col-md-5 blog-w3grid-text"> 
						<h4><a href="#myModal" data-toggle="modal">Mattis earum rerum</a></h4>
						<h6>By <a href="#"> Admin</a> - Dec 25th, 2016 </h6>
						<p>Sed interdum interdum accumsan. Aenean nec purus ac orci finibus facilisis. In sit amet placerat nisl, in auctor sapien. Donec ultricies faucibus ante rerum hic a sapiente delectus in auctor sapien. </p>
					</div> 
					<div class="clearfix"> </div>
				</div> 
			</div>
		</div>
		<!-- //blog --> 
    </div>
	                      
					</div>
                
              <!-- /tile -->
			  </div>
              <!-- /col 12 -->
            </div>
            <!-- /row -->
          </div>
          <!-- /content container -->
		</div>
        <!-- Page content end -->
	  </div>
	
    <section class="videocontent" id="video"></section>



    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/mmenu/js/jquery.mmenu.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/sparkline/jquery.sparkline.min.js"></script>
    <script type="text/javascript" 

src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/nicescroll/jquery.nicescroll.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/animate-

numbers/jquery.animateNumbers.js"></script>
    <script type="text/javascript" 

src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/videobackground/jquery.videobackground.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/blockui/jquery.blockUI.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/flot/jquery.flot.time.min.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/flot/jquery.flot.selection.min.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/flot/jquery.flot.animator.min.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/flot/jquery.flot.orderBars.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/easypiechart/jquery.easypiechart.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/rickshaw/raphael-min.js"></script> 
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/rickshaw/d3.v2.js"></script>
    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/rickshaw/rickshaw.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/morris/morris.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/tabdrop/bootstrap-tabdrop.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/summernote/summernote.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/chosen/chosen.jquery.min.js"></script>

    <script src="${pageContext.request.contextPath}/show/shoppingMall/assets/js/minimal.min.js"></script>
    
  </body>
</html>
<%@page import="cn.com.car.bean.CarModel"%>
<%@page import="java.util.List"%>
<%@page import="cn.com.car.service.carmanager.impl.CarBrandServiceImpl"%>
<%@page import="cn.com.car.service.carmanager.CarBrandService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	
%>
<html>
  <head>
    <title>Minimal 1.0 - Google Maps</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/show/shoppingMall/assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/show/shoppingMall/assets/css/vendor/animate/animate.css">
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/mmenu/css/jquery.mmenu.all.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/videobackground/css/jquery.videobackground.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/show/shoppingMall/assets/css/vendor/bootstrap-checkbox.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/show/shoppingMall/assets/js/vendor/tabdrop/css/tabdrop.css">

    <link href="${pageContext.request.contextPath}/show/shoppingMall/assets/css/minimal.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    </head>
  <body class="bg-4">
    <!-- Preloader -->
    <div class="mask"><div id="loader"></div></div>
    <!--/Preloader -->

    <!-- Wrap all page content here -->
    <div id="wrap">

      


      <!-- Make page fluid -->
      <div class="row">
 
        <!-- Page content -->
        <div id="content" class="col-md-12">
          <!-- page header 
          <div class="pageheader">
            

            <h2><i class="fa fa-compass" style="line-height: 48px;padding-left: 0;"></i> Google Maps <span>// Place subtitle here...</span></h2>
            

            <div class="breadcrumbs">
              <ol class="breadcrumb">
                <li>You are here</li>
                <li><a href="index.html">Minimal</a></li>
                <li><a href="#">Example Pages</a></li>
                <li class="active">Google Maps</li>
              </ol>
            </div>


          </div>
           /page header -->
          <!-- content main container -->
          <div class="main">
            <!-- row -->
            <div class="row">

              <!-- col 12 -->
              <div class="col-md-12">



                <!-- tile 
                <section class="tile transparent">


                  <!-- tile header -->
                  <div class="tile-header nopadding">
                    <div class="controls">
                      <a href="#" class="refresh"><i class="fa fa-refresh"></i></a>
                      <a href="#" class="remove"><i class="fa fa-times"></i></a>
                    </div>
                  </div>
                  <!-- /tile header -->

                  <!-- tile body -->
                  <div class="tile-footer color transparent-black rounded-bottom-corners"  style="padding-left:-200px">

                    <ul class="nav nav-pills tabdrop">
                      <li class="active"><a href="#basicContainer" data-toggle="pill" id="Car_buy">我要买车</a></li>
                      <li><a href="#streetContainer" data-toggle="pill" id="Car_rent">我要租车</a></li>
                      <li><a href="#clusterContainer" data-toggle="pill">Clustering Example</a></li>
                      <li><a href="#paginationContainer" data-toggle="pill">Map with Pagination Example</a></li> 
                      <li><a href="#filterContainer" data-toggle="pill">Map with Filtering Example</a></li> 
                      <li><a href="#geolocationContainer" data-toggle="pill">Geolocation Example</a></li> 
                      <li><a href="#jsonContainer" data-toggle="pill">JSON Data Example</a></li>           
                    </ul>
                  </div>
                  <!-- /tile	 body -->
				
                  <!-- tile footer -->
                  <div style="display:block" id="buy">
                  	<div class="row cards">
	                  	
              		<table width="84%" border="1">
              			<tr>
              				<td>
              					<hr/>
              				</td>
              			</tr>
              			
              			<tr>
              				<td>
              						<div class="form-group col-md-6" style="padding-top:1%;">
								    	<input type="text" id="searchText" class="form-control" style="opacity:0.6;width:100%" placeholder="请输入文本">
								  	</div>
								  	<a id="search" type="submit" style="opacity:0.6;margin-top:1%" class="btn btn-success">搜索</a>
              				</td>
              			</tr>
              			
              			<tr>
              				<td>
              					品牌
              				</td>
              			</tr>
              			
              			<tr>
              				<td>
              					车型
              				</td>
              			</tr>
              			<tr>
              				<td id="datas">
              			<c:forEach items="${datas}" var="data">
              					<div class="card-container col-lg-4 col-sm-4 col-sm-4">
                				<div class="card card-redbrown hover">
                  				<div class="front"> 
			
			                    <div class="media">        
			                      <span class="pull-left">
			                        <i class="fa fa-users media-object"></i>
			                      </span>
			
			                      <div class="media-body">
			                        <small>
			                        ${data.car_Brandid}
			                        </small>
			                        <h2 class="media-heading animate-number" data-value="${data.car_Modelname}" data-animation-
			
			duration="1500">0</h2>
			                      </div>
			                    </div> 
			
			                    <div class="progress-list">
			                      <div class="details">
			                        <div class="title">This month plan %</div>
			                      </div>
			                       
			                      <div class="status pull-right bg-transparent-black-1">
			                   库存    <span class="animate-number" data-value="100" data-animation-
			
			duration="1500">0</span>% 
			                      </div>
			                      <div class="clearfix"></div>
			                      <div class="progress progress-little progress-transparent-black">
			                        <div class="progress-bar animate-progress-bar" data-percentage="100%"> </div>
			                      </div>
			                     
			                    </div>
			
			                  </div>
			                  <div class="back">
			                    <a href="#">
			                      <i class="fa fa-bar-chart-o fa-4x"></i>
			                      <span><button class="btn btn-success">查看详情</button></span>
			                    </a>  
			                  </div>
			                </div>
			              </div>
              				
              				
              			</c:forEach>
              			 
              			</td>
              			</tr>
              	</table>
             </div>
                  </div>
                  <div style="display:none" id="rent">
                  	我要租车
                  </div>
                  
                  <!-- /tile footer -->


                </section>
                <!-- /tile -->
				</div>
              <!-- /col 12 -->
            </div>
            <!-- /row -->
          </div>
          <!-- /content container -->
		</div>
        <!-- Page content end -->

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
    
    <script>
    //我要租卖车
    $("#Car_buy").bind("click",function(){
    	$("#rent").attr("style","display:none");
    	$("#buy").attr("style","display:block");
    });
    
    $("#Car_rent").bind("click",function(){
    	$("#rent").attr("style","display:blocl");
    	$("#buy").attr("style","display:none");
    });
    
    
    $("#search").bind("click",function(){
    	alert("searchText="+$('#searchText').val());
    	jQuery.post("CarMallServlet?method=getCarModelByInfo",{searchText:$('#searchText').val()},function(data){
    		alert(data);
    		var datas = $.parseJSON(data);
    	},'json');
    });
    
    $(function(){
        // Initialize card flip
        $('.card.hover').hover(function(){
          $(this).addClass('flip');
        },function(){
          $(this).removeClass('flip');
        });
      });
        
    </script>
  </body>
</html>
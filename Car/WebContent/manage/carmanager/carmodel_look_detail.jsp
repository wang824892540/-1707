<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>汽车型号查看详情</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8" />

    <link rel="icon" type="image/ico" href="http://tattek.com/minimal/${pageContext.request.contextPath}/manage/manageMent/assets/images/favicon.ico" />
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/manage/manageMent/assets/css/vendor/bootstrap/bootstrap.min.css" rel="stylesheet">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/css/vendor/animate/animate.min.css">
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/mmenu/css/jquery.mmenu.all.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/videobackground/css/jquery.videobackground.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/css/vendor/bootstrap-checkbox.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/rickshaw/css/rickshaw.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/morris/css/morris.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/tabdrop/css/tabdrop.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/summernote/css/summernote.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/summernote/css/summernote-bs3.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/chosen/css/chosen.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/chosen/css/chosen-bootstrap.css">

    <link href="${pageContext.request.contextPath}/manage/manageMent/assets/css/minimal.css" rel="stylesheet">
    
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/mmenu/js/jquery.mmenu.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/sparkline/jquery.sparkline.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/nicescroll/jquery.nicescroll.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/animate-numbers/jquery.animateNumbers.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/videobackground/jquery.videobackground.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/blockui/jquery.blockUI.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/flot/jquery.flot.min.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/flot/jquery.flot.time.min.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/flot/jquery.flot.selection.min.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/flot/jquery.flot.animator.min.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/flot/jquery.flot.orderBars.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/easypiechart/jquery.easypiechart.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/rickshaw/raphael-min.js"></script> 
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/rickshaw/d3.v2.js"></script>
    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/rickshaw/rickshaw.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/morris/morris.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/tabdrop/bootstrap-tabdrop.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/summernote/summernote.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/vendor/chosen/chosen.jquery.min.js"></script>

    <script src="${pageContext.request.contextPath}/manage/manageMent/assets/js/minimal.min.js"></script>
    
    <script type="text/javascript">
    	$(function(){
    		//卡片翻转效果
    		$('.card.hover').hover(function(){
    	        $(this).addClass('flip');
    	      },function(){
    	        $(this).removeClass('flip');
    	    });
    		
    		//点击卡片
    		$(".back").each(function(){
    			$(this).click(function(){
    				//获得卡片上的型号信息
					var ModelId = $(this).attr("name");
					var ModelName = $(this).find("span").eq(0).html();
					var ModelRemark = $(this).find("span").eq(1).html();
					//将相应的信息显示到相应的输入框
					$("#spanName").html(ModelName);
					$("#carModelRemark").val(ModelId);
					$("#carModelId").val(ModelRemark);
					$("#carModelName").val(ModelName);
					//将详情框显示
    				$("#detail").css("display","block");
    			});
    		});
    		
    	});
    </script>
    <style type="text/css">
    	html{
    		overflow: auto;
    	}
    	body{
    		padding-left:20px;
    		padding-right:20px;
    	}
    	#main-search{
    		position:absolute;
    		margin-left:300px;
    		margin-top:-40px;
    	}
    	#btn-search{
    		width:70px;
    		height:35px;
    		margin-left: -6px;
    		line-height: 10px;
    		margin-top:-1px;
    	}
    	#txt-search{
    		width:200px;
    		height:35px;
    		color:#113965
    	}
    	#btnAdd{
    		position:absolute;
    		right:300px;
    		top:30px;
    	}
    </style>
</head>
<body class="bg-1">
	<div class="pageheader" id="pageheader">
            
	  <!-- 管理界面标题与查询框start -->
      <h2><i class="fa fa-tachometer"></i> 汽车型号管理
       <span>
        <form action="${pageContext.request.contextPath}/CarModelServlet">
         <div class="search" id="main-search">
         	<input type="hidden" name="method" value="listByName"/>
            <input type="text" placeholder="请输入型号名称" id="txt-search" name="txt-search" value="${keyWord}">
            <button type="submit" class="btn btn-slategray" id="btn-search">搜索</button>
         </div>
        </form>
       </span>
      </h2>
      <!-- 管理界面标题与查询框end -->
	  
	  
	  <a href="${pageContext.request.contextPath}/manage/carmanager/carmodel_add.jsp" class="btn btn-hotpink margin-bottom-20" id="btnAdd">
         <span>添加</span>
      </a>
     
	  <!-- 所在位置导航start -->
      <div class="breadcrumbs">
        <ol class="breadcrumb">
          <li>所在位置</li>
          <li><a href="index.html">xx后台管理</a></li>
          <li class="active">汽车型号管理</li>
        </ol>
      </div>
	  <!-- 所在位置导航end -->

    </div>

	<!-- 卡片列表start -->
	<div class="row cards">
<c:forEach items="${pageBean.datas}" var="carModel">

	

	<c:choose>
	  <c:when test="${carModel.car_Modelid%4==1}">
        <div class="card-container col-lg-3 col-sm-6 col-sm-12">
          <div class="card card-redbrown hover">
            <div class="front"> 

              <div class="media">        
                <span class="pull-left" >
                  <i class="fa fa-users media-object"></i>
                </span>

                <div class="media-body">
                  <small>型号编号：${carModel.car_Modelid }</small>
                  <h2 class="media-heading animate-number" data-value="${carModel.car_Modelname }" data-animation-duration="1500">0</h2>
                </div>
              </div> 

              <div class="progress-list">
                <div class="details">
                  <div class="title">查看详情请点我</div>
                </div>
               
                <div class="clearfix"></div>
                <div class="progress progress-little progress-transparent-black">
                  <div class="progress-bar animate-progress-bar" data-percentage="100%"></div>
                </div>
              </div>

            </div>
            <div class="back" name="${carModel.car_Remark }">
              <span style="display:none;">${carModel.car_Modelname }</span>
              <span style="display:none;">${carModel.car_Modelid }</span>
              <a href="#">
                <i class="fa fa-bar-chart-o fa-4x"></i>
                <span>查看详情</span>
              </a>  
            </div>
          </div>
        </div>
        
	  </c:when>
	  
	  <c:when test="${carModel.car_Modelid%4==2}">
        <div class="card-container col-lg-3 col-sm-6 col-sm-12">
          <div class="card card-blue hover">
            <div class="front">        
              
              <div class="media">                  
                <span class="pull-left">
                  <i class="fa fa-shopping-cart media-object"></i>
                </span>

                <div class="media-body">
                  <small>型号编号：${carModel.car_Modelid }</small>
                  <h2 class="media-heading animate-number" data-value="${carModel.car_Modelname }" data-animation-duration="1500">0</h2>
                </div>
              </div> 

              <div class="progress-list">
                <div class="details">
                  <div class="title">查看详情请点我</div>
                </div>
                
                <div class="clearfix"></div>
                <div class="progress progress-little progress-transparent-black">
                  <div class="progress-bar animate-progress-bar" data-percentage="100%"></div>
                </div>
              </div>

            </div>
            <div class="back" name="${carModel.car_Remark }">
              <span style="display:none;">${carModel.car_Modelname }</span>
              <span style="display:none;">${carModel.car_Modelid }</span>
              <a href="#">
                <i class="fa fa-bar-chart-o fa-4x"></i>
                <span>查看详情</span>
              </a>
            </div>
          </div>
        </div>
	  </c:when>

	  <c:when test="${carModel.car_Modelid%4==3}">
        <div class="card-container col-lg-3 col-sm-6 col-sm-12">
          <div class="card card-greensea hover">
            <div class="front">        
              
              <div class="media">
                <span class="pull-left">
                  <i class="fa fa-usd media-object"></i>
                </span>

                <div class="media-body">
                  <small>型号编号：${carModel.car_Modelid }</small>
                  <h2 class="media-heading animate-number" data-value="${carModel.car_Modelname }" data-animation-duration="1500">0</h2>
                </div>
              </div>

              <div class="progress-list">
                <div class="details">
                  <div class="title">查看详情请点我</div>
                </div>
                
                <div class="clearfix"></div>
                <div class="progress progress-little progress-transparent-black">
                  <div class="progress-bar animate-progress-bar" data-percentage="100%"></div>
                </div>
              </div>

            </div>
            <div class="back" name="${carModel.car_Remark }">
              <span style="display:none;">${carModel.car_Modelname }</span>
              <span style="display:none;">${carModel.car_Modelid }</span>
              <a href="#">
                <i class="fa fa-bar-chart-o fa-4x"></i>
                <span>查看详情</span>
              </a>
            </div>
          </div>
        </div>
	  </c:when>
	  
	  <c:otherwise>
        <div class="card-container col-lg-3 col-sm-6 col-xs-12">
          <div class="card card-slategray hover">
            <div class="front"> 

              <div class="media">                   
                <span class="pull-left">
                  <i class="fa fa-eye media-object"></i>
                </span>

                <div class="media-body">
                  <small>型号编号：${carModel.car_Modelid }</small>
                  <h2 class="media-heading animate-number" data-value="${carModel.car_Modelname }" data-animation-duration="1500">0</h2>
                </div>
              </div> 

              <div class="progress-list">
                <div class="details">
                  <div class="title">查看详情请点我</div>
                </div>
                
                <div class="clearfix"></div>
                <div class="progress progress-little progress-transparent-black">
                  <div class="progress-bar animate-progress-bar" data-percentage="100%"></div>
                </div>
              </div>

            </div>
            <div class="back" name="${carModel.car_Remark }">
              <span style="display:none;">${carModel.car_Modelname }</span>
              <span style="display:none;">${carModel.car_Modelid }</span>
              <a href="#">
                <i class="fa fa-bar-chart-o fa-4x"></i>
                <span>查看详情</span>
              </a>
            </div>
          </div>
        </div>
      </c:otherwise>
   </c:choose>
</c:forEach>
      </div>
      <!-- 卡片列表end -->
      
      <!-- 分页start -->
       <div id="TableTail" align="center">
		当前第${pageBean.currentPage}页     &nbsp;&nbsp; 总共${pageBean.pageNum}页 &nbsp;&nbsp;
		<a href="${pageContext.request.contextPath }/CarModelServlet?method=listByName&txt-search=${keyWord}">首页</a>
		

		<a href="${pageContext.request.contextPath }/CarModelServlet?method=listByName&page=${pageBean.currentPage-1}&txt-search=${keyWord}">上一页 </a>

<c:if test="${pageBean.currentPage== pageBean.pageNum}">
		尾页
</c:if>		

<c:if test="${pageBean.currentPage!= pageBean.pageNum}">
		<a href="${pageContext.request.contextPath }/CarModelServlet?method=listByName&page=${pageBean.currentPage+1}&txt-search=${keyWord}">下一页 </a>
</c:if>			
		<a href="${pageContext.request.contextPath }/CarModelServlet?method=listByName&page=${pageBean.pageNum}&txt-search=${keyWord}">末页</a>
    </div> 
    <!-- 分页end -->
    
	</body>
</html>
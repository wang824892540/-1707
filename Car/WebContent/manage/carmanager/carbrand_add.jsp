<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加汽车品牌</title>
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
</head>
<style>
	#allDiv{
		position:absolute;
		left:300px;
		top:200px;
	}
	#titleHeader{
		position:absolute;
		left:100px;
		top:-70px;
		padding-left:200px;
		width:600px;
		height:300px;
		background-color: #f2ae95;
		box-shadow:2px 2px 10px #909090;
		z-index: 1px;
	})
	#titleBody{
		position:absolute;
		top:100px;
	}
</style>
<script type="text/javascript">
	
	$(function(){
		
	})
</script>
<body class="bg-1">
    <!-- col 12 -->
    <div class="col-md-6" id="allDiv">

      <!-- tile -->
      <section class="tile color transparent-white">

        <!-- 表单 -->
        <div class="tile-body" id="titleBody">
        
          <!-- 页面标题  -->
          <div class="tile-header" id="titleHeader">
            <h1><strong>汽车品牌添加</strong></h1>
          </div>
          <!-- /页面标题 -->
          
          <form  class="form-horizontal" role="form" action="CarBrandServlet?method=add" enctype="multipart/form-data">
            
            <input type="hidden" name="method" value="add"/>
            
            <div class="form-group">
              <label for="brandName" class="col-sm-4 control-label">品牌名称：</label>
              <div class="col-sm-8">
                <input type="text" class="form-control" id="brandName" name="brandName">
              </div>
            </div>
            
            <div class="form-group">
              <label for="brandRemark" class="col-sm-4 control-label">品牌备注：</label>
              <div class="col-sm-8">
                <input type="text" class="form-control" id="brandRemark" name="brandRemark">
              </div>
            </div>
            
             <div class="form-group">
              <label for="colorpicker-rgb" class="col-sm-4 control-label">选择图片：</label>
              <div class="col-sm-8">
                <div class="input-group">
                <span class="input-group-btn">
                  <span class="btn btn-primary btn-file">
                    <i class="fa fa-upload"></i><input type="file" multiple="">
                  </span>
                </span>
                <input type="text" class="form-control" readonly="">
              </div>
              </div>
            </div>

            <div class="form-group form-footer footer-white">
              <div class="col-sm-offset-6 col-sm-8">
                <button type="submit" class="btn btn-dutch">添加</button>
                <button type="reset" class="btn btn-red">取消</button>
              </div>
            </div>
                  
          </form>
        </div>
        <!-- /表单 -->
        
      
      </section>
      <!-- /tile -->
    </div>  
</body>
</html>
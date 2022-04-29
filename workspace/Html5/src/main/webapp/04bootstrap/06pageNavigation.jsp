<!DOCTYPE html>

<html lang="ko">

<head>
	<meta charset="EUC-KR">
			
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<!--   jQuery , Bootstrap CDN  -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
</head>

<body>

	<!--  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->
 	<!--  아래의 내용은 http://getbootstrap.com/components/ 에서 
 			Pagination 참조 Copy-->
	
	<!-- 01 default pageNavigation Start -->
	<div class="container">
		 
		 <nav>
		  <ul class="pagination">
		    <li>
		      <a href="#" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <li><a href="#">1</a></li>
		    <li><a href="#">2</a></li>
		    <li><a href="#">3</a></li>
		    <li><a href="#">4</a></li>
		    <li><a href="#">5</a></li>
		    <li>
		      <a href="#" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		
		</nav>
	</div>
	<!-- 01 default pageNavigation end -->
	
	
	<!-- 02 disable, active pageNavigation Start -->
	<div class="container">

		<nav>
		  <ul class="pagination">
		    
		    <!--  사용불가 인경우 : disabled -->
		    <li class="disabled">
		      <a href="#" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    
		    <!--  현재 page 가르킬경우 : active -->
		    <li class="active">
		    	<a href="#">1<span class="sr-only">(current)</span></a>
		    </li>
		    
		    <li><a href="#">2</a></li>
		    <li><a href="#">3</a></li>
		    <li><a href="#">4</a></li>
		    <li><a href="#">5</a></li>
		    <li>
		      <a href="#" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		 </nav> 		
 
	</div>
	<!-- 02 default pageNavigation end -->
	

	<!-- 03 size control  pageNavigation Start -->
	<div class="container">
		 
		 <nav>
		 <!-- 크기조절 :  pagination-lg pagination-sm-->
		  <ul class="pagination pagination-lg" >
		    <li>
		      <a href="#" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <li><a href="#">1</a></li>
		    <li><a href="#">2</a></li>
		    <li><a href="#">3</a></li>
		    <li><a href="#">4</a></li>
		    <li><a href="#">5</a></li>
		    <li>
		      <a href="#" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  </ul>
		
		</nav>
	</div>
	<!-- 03 size control  default pageNavigation end -->
	
	
	<!-- 04 Pager : simple pageNavigation Start -->
	<div class="container">
		<nav>
		  <ul class="pager">
		    <li><a href="#">Previous</a></li>
		    <li><a href="#">Next</a></li>
		  </ul>
		</nav>
	</div>
	<!-- 04 Pager : simple  pageNavigation end -->
	
	
	<!-- 05 simple pageNavigation Start -->
	<div class="container">
		<nav>
		  <ul class="pager">
		    <li class="previous disabled"><a href="#"><span aria-hidden="true">&larr;</span> Older</a></li>
		    <!-- <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> Older</a></li>  -->
		    <li class="next"><a href="#">Newer <span aria-hidden="true">&rarr;</span></a></li>
		  </ul>
		</nav>
	</div>
	<!-- 05 simple  pageNavigation end -->

</body>

</html>
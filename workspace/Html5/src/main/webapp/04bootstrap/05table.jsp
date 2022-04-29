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

<body role="document">

<!-- Container start -->	 
	<div class="container">
		
	<!--  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->
	<!--  1. 아래의 내용은 http://getbootstrap.com/getting-started/ 의
	            Using the Framework 의 Bootstrap theme에서 참조  Copy
	              
	            및
	             
	        2. 아래의 내용은  http://getbootstrap.com/css/ 에서 Table 부분 참조 Copy-->
		<div class="page-header">
	       <h1>Tables</h1>
	    </div>
	    
		<!-- 1번째 row start -->	    
	    <div class="row">
	        <div class="col-md-6">
	          <table class="table">
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Username</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td>1</td>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@mdo</td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Jacob</td>
	                <td>Thornton</td>
	                <td>@fat</td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td>Larry</td>
	                <td>the Bird</td>
	                <td>@twitter</td>
	              </tr>
	            </tbody>
	          </table>
	        </div>
	        
	        <div class="col-md-6">
	         <!--  줄무늬를 추가 : table-striped  -->
	          <table class="table table-striped">
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Username</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td>1</td>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@mdo</td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Jacob</td>
	                <td>Thornton</td>
	                <td>@fat</td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td>Larry</td>
	                <td>the Bird</td>
	                <td>@twitter</td>
	              </tr>
	            </tbody>
	          </table>
	        </div>
        </div>
        <!-- 1번째 row end -->	    
	
	    <!-- 2번째 row start -->	    
	    <div class="row">
	      
	        <div class="col-md-6">
	          <!-- 테이블의 모서리와 셀에 선을 그리기 : table-bordered -->
	          <table class="table table-bordered">
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Username</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td rowspan="2">1</td>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@mdo</td>
	              </tr>
	              <tr>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@TwBootstrap</td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Jacob</td>
	                <td>Thornton</td>
	                <td>@fat</td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td colspan="2">Larry the Bird</td>
	                <td>@twitter</td>
	              </tr>
	            </tbody>
	          </table>
	        </div>
	        
	        <div class="col-md-6">
	          <!--  Table 간 간격 줄이기 :  table-condensed -->
	          <table class="table table-condensed">
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Username</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td>1</td>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@mdo</td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Jacob</td>
	                <td>Thornton</td>
	                <td>@fat</td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td colspan="2">Larry the Bird</td>
	                <td>@twitter</td>
	              </tr>
	            </tbody>
	          </table>
	        </div>
	     </div>
	     <!-- 2번째 row end -->	    
	   
	      <!-- 3번째 row start -->	        
	      <div class="row">
	      
	        <div class="col-md-6">
	          <!-- 테이블의 모서리와 셀에 선을 그리기 : table-bordered -->
	          <table class="table table-bordered table-hover" >
	            <thead>
	              <tr>
	                <th>#</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Username</th>
	              </tr>
	            </thead>
	            <tbody>
	              <tr>
	                <td rowspan="2">1</td>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@mdo</td>
	              </tr>
	              <tr>
	                <td>Mark</td>
	                <td>Otto</td>
	                <td>@TwBootstrap</td>
	              </tr>
	              <tr>
	                <td>2</td>
	                <td>Jacob</td>
	                <td>Thornton</td>
	                <td>@fat</td>
	              </tr>
	              <tr>
	                <td>3</td>
	                <td colspan="2">Larry the Bird</td>
	                <td>@twitter</td>
	              </tr>
	            </tbody>
	          </table>
	        </div>
	      </div>
	      <!-- 3번째 row end -->	        
	        
	</div>
<!-- Container start -->	 
	     
</body>

</html>
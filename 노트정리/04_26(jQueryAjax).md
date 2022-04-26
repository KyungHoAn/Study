# jQueryAjax

EL에 관한 내용
<a href="https://atoz-develop.tistory.com/entry/JSP-EL-%ED%91%9C%ED%98%84%EC%8B%9D-%EB%AC%B8%EB%B2%95%EA%B3%BC-%EC%82%AC%EC%9A%A9-%EB%B0%A9%EB%B2%95">knowledge Repository</a><br/>

### EL 표기법
${}
- JSP가 실행될 때 즉시 반영된다.
- 객체 프로퍼티 값을 꺼낼때 주로 사용

#{}
- 시스템에서 필요하다고 판달될 때 그 값을 사용
- 사용자 입력값을 객체의 프로퍼티에 담는 용도로 주로 사용

### 01get-orderClient.html
XMLHttpRequest 인스턴스 생성을 ajaxUtil01.js 모듈로 처리

### 02post-orderClient.html
//연결 초기화
request.open("POST",url,true);
//send()호출전 아래의 속성을 지정
request.onreadystatechange = updatePage

//request시 data 전송(POST) header설정
request.setRequestHeader('Content-Type','appication/x-www-form-urlencoded');

### 03postInnerHtml-orderclient
* 현업에서 사용x, 쓰지 말자

### 05postjQueryJSON-orderClient.html
==> textarea click 및 onload Event처리 및 연결
```
$(function(){
  $("textarea").on("click",function(){
    getCustomerInfo();
    });
    $("form")[0].reset();
  });
```
```
		function getCustomerInfo(){
			
			 //ajaxUtil01.js 모듈의 createReqeust() 호출
			createRequest();
			 
			//var name = document.getElementById("name").value;
			//var phone = document.getElementById("phone").value;
			var name = $("#name").val();
			var phone= $("#phone").val();
			var url ="postJSON-orderServer.jsp";

			var queryString = "name="+name+"&phone="+phone;

	 		//Debug...
	 		alert(queryString);
	 		//request시  data전송 있음
	 		openSendRequest(url,"POST",queryString,updatePage);
	 		//openSendRequest(url,"GET",queryString,updatePage);
		}
```
```
		//CallBackFunction Definition
		function updatePage(){
			
			if(request.readyState == 4){
			
				if(request.status == 200){
					
					var serverData = request.responseText;
					alert("Server에서 받은 내용 : \n"+serverData);
					
					var JSONData = $.parseJSON(serverData);
					
					//Debug...
					alert("JSONData:\n"+JSONData);
					
					var displayValue ="이름:"+JSONData.name+"\n"
									+"전화:"+JSONData.phone+"\n"
									+"주소:"+JSONData.address;
					
					$("#address").val(displayValue);
				}else{
					alert("에러 발생 : "+request.status);
				}
			} 
		}
```

### 06jQueryAjaxSjon-orderClient.html
$.ajax() function 사용법 : http://api.jquery.com/jQuery.ajax/참조
- jQueryAjax지원 : $.ajax(option)
- option : name =value (JSON형식)


- asyn : boolean
  - true(default) | false
- method : http method
  - GET(default) | POST |~~
- contentType : 서버로 전소오디는 Data형식
- data : server로 전송하는 QueryString
  - Object | String
- dataType : 서버에서 받는 Data형식
  - default : Intelligaent Fuess
- success : function(value1, value2)
  - request 성공시 호출되는 CallBackFunction
  - value1 : server에서 받은 Data
  - value2 : 상태값

```
$.ajax(
	{
		url:"postJSON0orderserver.jsp",       //url은 똑같이 받아옴
		method:"POST",                        //Post로 받는다.
		data :{
			name:$("#name").val(),
			phone:$("#phone").val()
		},
		dataType:"text",
		success:function(serverData,sataus){
			alert(status);
			alert("Server에서 받은 내용: \n"+serverData);
			
			var JSONData = $.parseJSON(serverdata);
			
			alert("JSONData : \n"+JSONData);
			
			var displayValue = "이름: "+JSONData.name+"\n"
								+"전화:"+JSONData.phone+"\n"
								+"주소:"+JSONData.address;
					
			$("#address").val(displayValue);
		}
			
	}
);
```

### postJSON-orderServer.jsp
```
<% 
	//==>한글처리(POST)	 ::  UTF-8로 encoding
	request.setCharacterEncoding("UTF-8");// post방식일때는 utf-8 get방식일때는 euc-kr
	String name =  request.getParameter("name");
	String phone = request.getParameter("phone");
	
	//==> 주소를 임의로 발생시키기...
	String address ="";
	int random = new java.util.Random().nextInt(3);
	if( random ==0 ){
		address = "서울";
	}else if( random ==1 ){
		address = "부산";
	}else{
		address = "제주도";
	}
%>
```

```
<%
	System.out.println("postJSON-orderServer.jsp:: 이름="+name+"주소="+address+"전화="+phone);

	JSONObject obj = new JSONObject();
	obj.put("name",name);
	obj.put("phone",phone);
	obj.put("address",address);
	
	System.out.println(obj);
%>

<%=obj %>
```

### 07jQueryAjaxETC-orderClient.html
```
//각각의 실습을 확인하기(꼭!!!!)
	 $(function(){
		 $("textarea").on("click",function(){
			use_ajax_option();
			//use_ajax_url_option();
	 		//use_getJSON();
	 		//user_post();
	 		//user_get();
		 });
		 $("form")[0].reset();
	 });
```


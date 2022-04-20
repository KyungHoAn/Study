# jQuery

<a href="https://jquery.com/">jQuery.org</a>

- javascript Framework 사용 : jQuery Framework
  - Dom(Document Object Model: 문서객체모델)처리가 쉬우며
  - 일관성을 갖는 Event 처리
  - 코드 간결 , 가독성 좋음

### 03jQueryFramework.html
```
<script src="../javascript/jquery-2.1.4.js" type="text/javascript"></script>
<script ytpe="text/javascript">
	$(function() {
		
		//==> <td> element Object 에 onclick EVENT 발생시 처리할 function 등록
		//==> :: Event 처리 CallBackFunction를  Event Listener 등록   
		//==> java syntax : Anonymous Inner Class 와 비교이해 
		$("td").click(function() {
			$(this).hide();
		})
		
		//==> <td> element Object 에 onclick EVENT 발생시 처리할 function 등록
		//==> :: Event 처리 CallBackFunction를  Event Listener 등록   
		//==> java syntax : Anonymous Inner Class 와 비교이해 
		$("td:last").click(function() {
			self.location = "03jQueryFramework.html";	
			//self.location = "02onlyJavaScript.html";
			//self.location = "01onlyJavaScript.html";
		})
	});
```
- 19번째 줄 : td를 찾아서 click을 하면 hide해준다.
  - hide API -> The matched elements will be hidden immediately, with no animation.
  - 일치하는 요소는 애니메이션 없이 즉시 숨겨집니다.

- 26번째 줄 td의 마지막요소를 클릭하면 html을 다시 restart한다.

### onlyCSS02.html
- static contents / style(Design) 분리
- javascript는 ~~ .js로 모듈화 가능하듯 ~~ .css로 모듈화 가능
- html element name 접근 : span(~~ )
- class attribute 접근 : abc (~~ )
- id attrivute 접근 : #uniqueld(~~ )
```
	<style type="text/css">
		span{
			background-color: yellow ; 
			font-size: 10pt;
		}
		
		.abc{
			background-color: green ; 
			font-size: 20pt;
		}
		
		#uniqueld{
			background-color: red;
			font-size: 30pt;
		}
	</style>
```
- span tage로 되어있는 곳은 background- color 의 색은 yellow이다.
- class 이름이 abc로 되어있는 곳은 background -color 색은 green이다
- 식별자이름으로 되어있는 곳의 background-color 색은 red이다.

### 01What_jQuery.html
```
 	function change(elem){
	 	  elem.style.color="red";
	 }
	
	 $(function(){

		 $('span').click(function(){

			$(this).css('color','red');
		 })
	 });
```
- span 태그를 클릭하면 해당 color 를 red로 바꾸어 준다.

### 02what_jQuery.html
1. javascript 이용 : onload시 호출되는 function 선언
2. onload : DOM element의 load또는 image 또는 외부 모든 resource 들이 load완료 시점
```
	 window.onload = function(){
		 alert("element 파싱, load 완료 시점 alert 창 open \n\n wondow.onload사용")
	 }
	 
	 //2.1 jQuery 사용법
	 //:1. 과 동일 (차이점: DOM element 가 load된 시점에 실행)
	 //:1보다 2.보다 2.1이 먼저 실행된
	 //==> ready(CallBack function)
	 $(document).ready(function(){
		 alert("element 파싱, load완료시점 alert 창 open \n\n jQuery $(document).ready()사용")
	 });
	 
	 //2.2 jQuery 사용법
	 //:2.1 과 동일(notation만 틀리다)
	 // : 1보다 2.1 2.2 먼저 실행됨)
	 
	 $(function(){
		 alert("element 파싱(load) 완료시점 alert창 open \n\n jQuery $() 사용")
	 });
```
- $(document).ready(function(){}과 $(function(){} 은 같은 의미 후자를 더 선호
- 같은 의미인 것
```
$(function(){
jQuery(fucntion(){}
window.jQuery(function(){}
window.$(function(){}
```
### 10selector_tag_id_class.html
```
// html element 이름으로 접근
span{}
// class attribute 로 접근
.abc{}
// id attribute로 접근
#uniquIdP{}
```
- onlyCSS02.html 참조
- selector (선택자) : dom을 다루기 위해 element Object GET
	- tag 선택자 : $("elementName")
	- id 선택자 : $("#id")
	- class 선택자 : $(".className") 

```
var divElem = $("div");
divElem.css('color','yellow');
=======> 같은 의미
$("div").css('color','black');
```


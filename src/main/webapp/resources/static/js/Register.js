/**@charset "UTF-8";
 * 
 */
 	const baseURL = "http://localhost:8080/TeamProject2";
	let pagePath = null;
	let fullURL = null;
 
 // 로그인 버튼 클릭 이벤트 핸들러
 document.getElementById("regis").addEventListener('click',function(){
		 	pagePath = "/member/Login.jsp"
			fullURL = baseURL + pagePath;
	
			location.href = fullURL;
 })
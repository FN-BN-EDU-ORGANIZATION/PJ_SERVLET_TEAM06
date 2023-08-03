<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@include file="/resources/static/jsp/cdn.jsp" %>

<style type="text/css">
<%@include file="/resources/static/css/join.css" %>
<%@include file="/resources/static/css/reset.css" %>
</style>

</head>
<body>
   <div id="wrap" class="wrapper">
     <form method ="post" name="join" id="join" action="${pageContext.request.contextPath}/join.do">
        <!-- 회원가입 타이틀부분 -->
         <header>
            <div id="header">
               <h1 class="h_loho">
                  <span><img alt="베스킨 메인문구" src="resources/static/image/rowLogo.png"></span>
                  <p>회원가입</p>
               </h1>
               </div>
         </header>

         <div id="container">
            <div class="row_group">
               <div class="userInput">
        <!-- 아이디 입력 -->
                  <h3 class="list">
                  아이디<span id="idError"></span>
                  </h3>
                  <span class="box int_id" ><input type="text" id="id" class="int check" name="id"
                     maxlength="20"></span>
               </div>
               <div class="userInput">
        <!-- 비밀번호 입력 -->
                  <h3 class="list">비밀번호<span id="pwError"></span></h3>
                  <span class="box int_id"><input type="password" id="pw" class="int check" name="pw"
                     maxlength="20"></span>
               </div>
        <!-- 비밀번호 재확인 입력 -->
               <div class="userInput">
                  <h3 class="list">비밀번호 재확인<span id="pwCheckError"></span></h3>
                  <span class="box int_id"><input type="password" id="pwCheck" class="int check" 
                     maxlength="20"></span>
               </div>
            </div>
               <div class="row_group">
        <!-- 성명 입력 -->
               <div class="userInput">
                  <h3 class="list">성명<span id="nameError"></span></h3>
                  <span class="box int_id"><input type="text" id="name" class="int check" name="name"
                     maxlength="20"></span>
               </div>
        <!-- 전화번호 입력 -->
               <div class="userInput">
                  <h3 class="list">전화번호("-" 제외)<span id="phoneNumError"></span></h3>
                  <span class="box int_id"><input type="text" id="phoneNum" class="int check" name="phone"
                     maxlength="11"></span>
               </div>
        <!-- 주소 입력 -->
              <div class="userInput">
                  <h3 class="list selfad">
                     자택주소<span id="addressError"></span>
                  </h3>
                  <div id="address" class="int_id">
                  <span class="Ad">
                  <input type="text" id="sample4_postcode" class="d_form mini line addressCheck" placeholder="우편번호" readonly>
                  <input type="button" id="addressButton" class="d_form mini" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" readonly>
                  </span>
                  
                  <div class="other">
                   <input type="text" id="sample4_roadAddress" class="d_form mini line" placeholder="도로명주소" readonly>
                  <input type="text" id="sample4_jibunAddress" class="d_form mini line" placeholder="지번주소" readonly>
                  <span id="guide" style="color:#999;display:none"></span>
                  <input type="text" id="sample4_extraAddress" class="d_form mini line" placeholder="참고주소" readonly>
                  <input type="text" id="sample4_detailAddress" class="d_form mini line addressCheck" placeholder="상세주소" >
                  </div>
                
                  <input type="text" id="sample4_roadAddress" placeholder="도로명주소">
				<input type="text" id="sample4_jibunAddress" placeholder="지번주소">
				<span id="guide" style="color:#999;display:none"></span>
				<input type="text" id="sample4_detailAddress" placeholder="상세주소">
				<input type="text" id="sample4_extraAddress" placeholder="참고항목">

					<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
					<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
                  
                  
                  
                  
                  </div>
               </div>
                <!-- 이메일 입력 -->
              <div class="userInput">
                  <h3 class="list">이메일<span id="emailError"></span></h3>
                  <span class="emailInt" id="emailBox"> <input type="text" id="email" maxlength="20" class="check" > 
                     <span>   @ </span> 
                        <!-- 이메일 택일 -->
                        <select id="mail_Select">
                           <option>이메일 선택</option>
                           <option>naver.com</option>
                           <option>gmail.com</option>
                           <option>daum.net</option>
                           <option>hanmail.net</option>
                           <option>hotmail.com</option>
                           <option>nate.com</option>
                           <option>yahoo.co.kr</option>
                           <option>empas.com</option>
                           <option>freechal.com</option>
                           <option>lycos.co.kr</option>
                           <option>korea.com</option>
                           <option>hanmir.com</option>
                           <option>dreamwiz.com</option>
                           <option>paran.com</option>
                        </select>
                  </span>
               </div>
       <!-- 개인정보 수집 동의 -->
                  <div class="userInput agree">
                  <h3 class="lists">개인정보 수집/이용동의<span id="consentError"></span></h3>
                  <div id="informationConsent">
                  <span id="consentBox">
                      <h3 class="information">개인정보 처리방침<span id="consentError"></span></h3>
                      <!-- 세부내용 중략 -->
                  </span>
               </div>
               <label class="select"><input type="radio" id="check" name="check" value="동의">동의</label>
               <label class="select"><input type="radio" id="noneCheck"name="check" value="비동의" checked="checked">비동의</label>
               </div>
               <div class="btn_areaa">
                  <input type="submit" value="가입하기" id="btnJoin" class="btn_type btn_primary">
               </div>
            </div>
         </div>
      </form>
   </div>


               
               <footer>
        <div class="boxalign">
          <div class="sns">
            <a href="javascript:;"
              ><img src="image/icon_blog.png" alt="페이스북"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_instgram.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_twitter.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_youtube.png" alt="인스타그램"
            /></a>
            <a href="javascript:;"
              ><img src="image/icon_facebook.png" alt="인스타그램"
            /></a>
          </div>

          <div class="footer_logo">
            <a href="javascript:;">
              <img src="image/rowLogo.png" alt="하단로고" />
            </a>
            <div>1661 - 5270</div>
          </div>

          <div class="footer_nav">
            <ul>
              <li><a href="javascript:;">이용약관</a></li>
              <li><a href="javascript:;">개인정보처리방침</a></li>
              <li><a href="javascript:;">위치기반서비스</a></li>
              <li><a href="javascript:;">고객센터</a></li>
              <li><a href="javascript:;">인재채용</a></li>
              <li><a href="javascript:;">단체주문</a></li>
            </ul>
          </div>

          <div class="copyright">
            <div>
              주식회사 베스킨라빈스는 통신판매중개자이며 통신판매의 당사자가
              아닙니다. 따라서 상품/ 거래정보 및 거래와 관련하여 베스킨라빈스에
              등록된 판매자의 고의 또는 과실로 소비자에게 발생하는 손해에 대해
              베스킨라빈스는 책임을 지지 않습니다. 상품 및 거래에 관하여 보다
              정확한 정보는 해당 판매자에게 직접 확인하여 주시기 바랍니다.
              <p>Copyright DagueYO. All Rights Reserved.</p>
            </div>
          </div>
        </div>
      </footer>
    </div>
    <script src="resources/static/js/Join.js"></script>


</body>
</html>

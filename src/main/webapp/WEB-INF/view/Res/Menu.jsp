<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>

<%@include file="/resources/static/jsp/cdn.jsp" %>

<style>
	<%@include file="/resources/static/css/Menu.css" %>
	<%@include file="/resources/static/css/reset.css" %>
</style>
</head>

<body>
  <div id="wrap">
     <header>
      <div class="boxalign">
        <ul class="head_left_icon">
          <li>
            <a href="javascript:;">
              <img src="image/icon_instgram.png" alt="아이콘_인스타그램" />
            </a>
          </li>
          <li>
            <a href="javascript:;">
              <img src="image/icon_facebook.png" alt="아이콘_페이스북" />
            </a>
          </li>
          <li>
            <a href="javascript:;">
              <img src="image/icon_blog.png" alt="아이콘_블로그" />
            </a>
          </li>
          <li>
            <a href="javascript:;">
              <img src="image/icon_youtube.png" alt="아이콘_유튜브" />
            </a>
          </li>

          <li>
            <a href="javascript:;">
              <img src="image/icon_twitter.png" alt="아이콘_트위터" />
            </a>
          </li>
        </ul>

        <h1 class="logo">
          <a href="index.html"><img src="image/rowLogo.png" alt="상단로고" /></a>
        </h1>

        <ul class="head_right_icon">
          <li>
            <a href="/로그인html.html"><strong>6조</strong>님</a>
          </li>
          <li class="basket_icon">
            <a href="/주문index.html"><img src="image/basket_icon.png" alt="장바구니_아이콘" /></a>
          </li>
          <li class="search_icon">
            <a href="javascript:;"><img src="image/search.png" alt="찾기_아이콘" /></a>
          </li>
        </ul>
      </div>
    </header>
    <nav>
      <div class="boxalign">
        <ul class="main_nav">
          <li>
            <a href="#">BEST MONTH</a>
            <div class="sub_nav">
              <ul>
                <li>
                  <a class="sub_nav_img" href="#"></a>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">케이크</a></li>
                      <li><a href="#">음료</a></li>
                      <li><a href="#">커피</a></li>
                      <li><a href="#">디저트</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">진행이벤트</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">당첨자발표</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">매장찾기</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">고객센터</a></li>
                      <li><a href="#">단체주문</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">공지사항</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">보도차죠</a></li>
                      <li><a href="#">채용정보</a></li>
                      <li><a href="#">점포개설문의</a></li>
                    </ul>
                  </div>
                </li>
              </ul>
            </div>
          </li>
          <li>
            <a href="menu.html">MENU</a>
            <div class="sub_nav">
              <ul>
                <li>
                  <a class="sub_nav_img" href="#"></a>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">케이크</a></li>
                      <li><a href="#">음료</a></li>
                      <li><a href="#">커피</a></li>
                      <li><a href="#">디저트</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">진행이벤트</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">당첨자발표</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">매장찾기</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">고객센터</a></li>
                      <li><a href="#">단체주문</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">공지사항</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">보도차죠</a></li>
                      <li><a href="#">채용정보</a></li>
                      <li><a href="#">점포개설문의</a></li>
                    </ul>
                  </div>
                </li>
              </ul>
            </div>
          </li>
          <li>
            <a href="#">EVENT</a>
            <div class="sub_nav">
              <ul>
                <li>
                  <a class="sub_nav_img" href="#"></a>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">케이크</a></li>
                      <li><a href="#">음료</a></li>
                      <li><a href="#">커피</a></li>
                      <li><a href="#">디저트</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">진행이벤트</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">당첨자발표</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">매장찾기</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">고객센터</a></li>
                      <li><a href="#">단체주문</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">공지사항</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">보도차죠</a></li>
                      <li><a href="#">채용정보</a></li>
                      <li><a href="#">점포개설문의</a></li>
                    </ul>
                  </div>
                </li>
              </ul>
            </div>
          </li>
          <li>
            <a href="#">STORE</a>
            <div class="sub_nav">
              <ul>
                <li>
                  <a class="sub_nav_img" href="#"></a>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">케이크</a></li>
                      <li><a href="#">음료</a></li>
                      <li><a href="#">커피</a></li>
                      <li><a href="#">디저트</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">진행이벤트</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">당첨자발표</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">매장찾기</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">고객센터</a></li>
                      <li><a href="#">단체주문</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">공지사항</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">보도차죠</a></li>
                      <li><a href="#">채용정보</a></li>
                      <li><a href="#">점포개설문의</a></li>
                    </ul>
                  </div>
                </li>
              </ul>
            </div>
          </li>
          <li>
            <a href="#">ABOUT</a>
            <div class="sub_nav">
              <ul>
                <li>
                  <a class="sub_nav_img" href="#"></a>
                </li>
                <li>
                  <a href="#">아이스크림</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">케이크</a></li>
                      <li><a href="#">음료</a></li>
                      <li><a href="#">커피</a></li>
                      <li><a href="#">디저트</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">진행이벤트</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">당첨자발표</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">매장찾기</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">고객센터</a></li>
                      <li><a href="#">단체주문</a></li>
                    </ul>
                  </div>
                </li>
                <li>
                  <a href="#">공지사항</a>
                  <div class="sub_nav_sub">
                    <ul>
                      <li><a href="#">보도차죠</a></li>
                      <li><a href="#">채용정보</a></li>
                      <li><a href="#">점포개설문의</a></li>
                    </ul>
                  </div>
                </li>
              </ul>
            </div>
          </li>
        </ul>
      </div>
    </nav>
    <div id="slider">
      <div class="swiper-container">
        <div class="swiper-wrapper">
          <div class="swiper-slide slide01">
            <img src="image/menu_kakao_img.png" alt="">
          </div>
          <div class="swiper-slide slide02">
            <img src="image/best2.JPG" alt="">
          </div>
          <div class="swiper-slide slide03">
            <img src="image/best3.JPG" alt="">
          </div>
          <div class="swiper-slide slide04">
            <img src="image/best4.JPG" alt="">
          </div>
          <div class="swiper-slide slide05">
            <img src="image/best5.JPG" alt="">
          </div>
        </div>
        <!-- <div class="swiper-button-next"></div> 다음 버튼
        <div class="swiper-button-prev"></div> 이전 버튼 -->
      </div>
    </div>
    <div id="contents">
      <div id="pagination"></div>
      <div id="gallery"></div>
    </div>


 <footer>
      <div class="boxalign">
        <div class="sns">
          <a href="javascript:;"><img src="image/icon_blog.png" alt="페이스북" /></a>
          <a href="javascript:;"><img src="image/icon_instgram.png" alt="인스타그램" /></a>
          <a href="javascript:;"><img src="image/icon_twitter.png" alt="인스타그램" /></a>
          <a href="javascript:;"><img src="image/icon_youtube.png" alt="인스타그램" /></a>
          <a href="javascript:;"><img src="image/icon_facebook.png" alt="인스타그램" /></a>
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

  <!-- 스크립트 태그를 맨 아래로 이동 -->
  <script src="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.js"></script>
  <script src="resources/static/js/Menu.js"></script>
</body>



</html>